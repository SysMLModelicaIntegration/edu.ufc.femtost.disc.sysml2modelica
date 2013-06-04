within Two_tanks.Design.Components;

model TanksConnectedPI
	Two_tanks.Design.Components.LiquidSource source (flowLevel = 0.02);
	Two_tanks.Design.Components.Tank tank1 (area = 1.0);
	Two_tanks.Design.Components.Tank tank2 (area = 1.3);
	Two_tanks.Design.Components.PIcontinuousController piContinuous1 (ref = 0.25);
	Two_tanks.Design.Components.PIcontinuousController piContinuous2 (ref = 0.4);
equation
	connect(piContinuous1.cOut, tank1.tActuator);
	connect(piContinuous2.cIn, tank2.tSensor);
	connect(piContinuous2.cOut, tank2.tActuator);
	connect(source.qOut, tank1.qIn);
	connect(tank1.tSensor, piContinuous1.cIn);
	connect(tank1.qOut, tank2.qIn);

end TanksConnectedPI;
