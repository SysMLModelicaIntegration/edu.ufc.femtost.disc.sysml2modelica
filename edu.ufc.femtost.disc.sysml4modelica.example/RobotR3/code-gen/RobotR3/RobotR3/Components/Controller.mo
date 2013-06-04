within RobotR3.RobotR3.Components;

model Controller
	parameter Real kp = 10.0;
	parameter Real ks = 1.0;
	parameter Modelica.SIunits.Time Ts = 0.01;
	parameter Real ratio = 1.0;
	RobotR3.RobotR3.Components.AxisControlBus axisControlBus;
	Modelica.Blocks.Math.Gain gain1 (k = ratio);
	Modelica.Blocks.Continuous.PI PI (k = ks, T = Ts);
	Modelica.Blocks.Math.Feedback feedback1;
	Modelica.Blocks.Math.Gain P (k = kp);
	Modelica.Blocks.Math.Add3 add3 (k3 = -1);
	Modelica.Blocks.Math.Gain gain2 (k = ratio);
equation
	connect(gain1.y, feedback1.u1);
	connect(feedback1.y, P.u);
	connect(P.y, add3.u2);
	connect(gain2.y, add3.u1);
	connect(add3.y, PI.u);
	connect(gain2.u, axisControlBus.speed_ref);
	connect(axisControlBus.angle_ref, gain1.u);
	connect(feedback1.u2, axisControlBus.motorAngle);
	connect(add3.u3, axisControlBus.motorSpeed);
	connect(PI.y, axisControlBus.current_ref);

end Controller;
