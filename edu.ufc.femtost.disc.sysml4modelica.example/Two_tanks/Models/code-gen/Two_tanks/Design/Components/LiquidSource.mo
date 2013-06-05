within Two_tanks.Design.Components;

model LiquidSource
	parameter Real flowLevel = 0.02;
	Two_tanks.Design.Interface.LiquidFlow qOut;
equation
	qOut.lflow = if time > 150 then 3 * flowLevel else flowLevel;

end LiquidSource;
