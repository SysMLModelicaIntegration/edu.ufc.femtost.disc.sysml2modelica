within Two_tanks.Design.Components;

model LiquidSource
/* Generated with the plugin UFC - SysML4Modelica
	@ReqID: 1.1 : After 150 sec, the flow rate must be 3 times higher than the previous rate.
*/
	parameter Real flowLevel = 0.02;
	Two_tanks.Design.Interface.LiquidFlow qOut;
equation
	qOut.lflow = if time > 150 then 3 * flowLevel else flowLevel;

end LiquidSource;
