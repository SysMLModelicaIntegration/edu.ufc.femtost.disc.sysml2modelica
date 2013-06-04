within RobotR3.RobotR3.Components;

model AxisType1
	extends RobotR3.RobotR3.Components.AxisType2 (redeclare GearType1 gear(c = c, d = cd));
	parameter Real c (unit = "N.m/rad") = 43.0;
	parameter Real cd (unit = "N.m/rad") = 0.005;

end AxisType1;
