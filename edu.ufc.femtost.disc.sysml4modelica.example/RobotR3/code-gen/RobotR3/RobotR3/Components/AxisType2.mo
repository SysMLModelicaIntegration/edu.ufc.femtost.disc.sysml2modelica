within RobotR3.RobotR3.Components;

model AxisType2
	parameter Real kp = 10.0;
	parameter Real ks = 1.0;
	parameter Modelica.SIunits.Time Ts = 0.01;
	parameter Real k = 1.1616;
	parameter Real w = 4590.0;
	parameter Real D = 0.6;
	parameter Modelica.SIunits.Inertia J (min = 0) = 0.0013;
	parameter Real ratio = -105.0;
	parameter Modelica.SIunits.Torque Rv0 = 0.4;
	parameter Real Rv1 (unit = "N.m.s/rad") = 0.13 / 160;
	parameter Real peak = 1;
	Modelica.Mechanics.Rotational.Interfaces.Flange_b flange;
	replaceable RobotR3.RobotR3.Components.GearType2 gear (Rv0 = Rv0, Rv1 = Rv1, peak = peak, i = ratio);
	RobotR3.RobotR3.Components.Motor motor (J = J, k = k, w = w, D = D);
	RobotR3.RobotR3.Components.Controller controller (kp = kp, ks = ks, Ts = Ts, ratio = ratio);
	RobotR3.RobotR3.Components.AxisControlBus axisControlBus;
	Modelica.Mechanics.Rotational.Sensors.AngleSensor angleSensor;
	Modelica.Mechanics.Rotational.Sensors.SpeedSensor speedSensor;
	Modelica.Mechanics.Rotational.Sensors.AccSensor accSensor;
	Modelica.Mechanics.Rotational.Components.InitializeFlange initializeFlange;
	Modelica.Blocks.Sources.Constant const (k = 0);
equation
	connect(flange, gear.flange_b);
	connect(gear.flange_b, accSensor.flange);
	connect(gear.flange_b, speedSensor.flange);
	connect(gear.flange_b, angleSensor.flange);
	connect(gear.flange_a, motor.flange_motor);
	connect(initializeFlange.flange, flange);
	connect(const.y, initializeFlange.a_start);
	connect(motor.axisControlBus, axisControlBus);
	connect(axisControlBus.speed, speedSensor.w);
	connect(angleSensor.phi, axisControlBus.angle);
	connect(accSensor.a, axisControlBus.acceleration);
	connect(axisControlBus, controller.axisControlBus);
	connect(axisControlBus.angle_ref, initializeFlange.phi_start);
	connect(initializeFlange.w_start, axisControlBus.speed_ref);

end AxisType2;
