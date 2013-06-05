within Two_tanks.Design.Components;

model Tank
	parameter Real area (unit = "m2") = 0.5;
	parameter Real flowGain (unit = "m2/s") = 0.05;
	parameter Real minV = 0.0;
	parameter Real maxV = 10.0;
	Real h (start = 0.0, unit = "m");
	Two_tanks.Design.Interface.ReadSignal tSensor;
	Two_tanks.Design.Interface.ActSignal tActuator;
	Two_tanks.Design.Interface.LiquidFlow qIn;
	Two_tanks.Design.Interface.LiquidFlow qOut;
equation
	assert(minV >=  0, "minV - minimum Valve level must be >= 0");
	der(h) = (qIn.lflow - qOut.lflow) / area;
	qOut.lflow = limitValue(minV, maxV, -flowGain * tActuator.act);
	tSensor.val = h;

end Tank;
