within RobotR3.RobotR3.Components;

model GearType2
	extends Modelica.Mechanics.Rotational.Interfaces.PartialTwoFlanges;
	parameter Real i = -99;
	parameter Modelica.SIunits.Torque Rv0 = 21.8;
	parameter Real peak = 26.7 / 21.8;
	parameter Real Rv1 = 9.8;
	constant Modelica.SIunits.AngularVelocity unitAngularVelocity = 1;
	constant Modelica.SIunits.Torque unitTorque = 1;
	Modelica.Mechanics.Rotational.Components.IdealGear gear (ratio = i, useSupport = false);
	Modelica.Mechanics.Rotational.Components.BearingFriction bearingFriction (tau_pos = [0,Rv0 / unitTorque;1,(Rv0 + Rv1 * unitAngularVelocity) / unitTorque], peak = peak, useSupport = false);
equation
	connect(gear.flange_b, bearingFriction.flange_a);
	connect(bearingFriction.flange_b, flange_b);
	connect(gear.flange_a, flange_a);

end GearType2;
