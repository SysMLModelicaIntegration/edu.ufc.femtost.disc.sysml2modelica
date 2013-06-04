within RobotR3.RobotR3.Components;

expandable connector AxisControlBus
	extends Modelica.Icons.SignalSubBus;
	Boolean motion_ref;
	Modelica.SIunits.Angle angle_ref;
	Modelica.SIunits.Angle angle;
	Modelica.SIunits.AngularVelocity speed_ref;
	Modelica.SIunits.AngularVelocity speed;
	Modelica.SIunits.AngularAcceleration acceleration_ref;
	Modelica.SIunits.AngularAcceleration acceleration;
	Modelica.SIunits.Current current_ref;
	Modelica.SIunits.Current current;
	Modelica.SIunits.Angle motorAngle;
	Modelica.SIunits.AngularVelocity motorSpeed;

end AxisControlBus;
