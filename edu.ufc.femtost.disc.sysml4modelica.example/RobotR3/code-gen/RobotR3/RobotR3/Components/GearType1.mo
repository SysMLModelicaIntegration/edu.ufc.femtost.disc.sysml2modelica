within RobotR3.RobotR3.Components;

model GearType1
	extends Modelica.Mechanics.Rotational.Interfaces.PartialTwoFlanges;
	parameter Real i = -105;
	parameter Real c (unit = "N.m/rad") = 43.0;
	parameter Real d (unit = "N.m.s/rad") = 0.005;
	parameter Modelica.SIunits.Torque Rv0 = 0.4;
	parameter Real Rv1 (unit = "N.m.s/rad") = 0.13 / 160;
	parameter Real peak = 1.0;
	Modelica.SIunits.AngularAcceleration a_rel = der(spring.w_rel);
	constant Modelica.SIunits.AngularVelocity unitAngularVelocity = 1.0;
	constant Modelica.SIunits.Torque unitTorque = 1.0;
	Modelica.Mechanics.Rotational.Components.IdealGear gear (ratio = i, useSupport = false);
	Modelica.Mechanics.Rotational.Components.SpringDamper spring (c = c, d = d);
	Modelica.Mechanics.Rotational.Components.BearingFriction bearingFriction (tau_pos = [0,Rv0 / unitTorque;1,(Rv0 + Rv1 * unitAngularVelocity) / unitTorque], useSupport = false);
equation
	connect(bearingFriction.flange_b, spring.flange_a);
	connect(spring.flange_b, gear.flange_a);
	connect(bearingFriction.flange_a, flange_a);
	connect(flange_b, gear.flange_b);
initial equation
	spring.w_rel = 0;
	a_rel = 0;

end GearType1;
