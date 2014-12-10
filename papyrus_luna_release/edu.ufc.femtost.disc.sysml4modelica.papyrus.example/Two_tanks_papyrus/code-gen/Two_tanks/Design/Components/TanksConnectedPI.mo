within Two_tanks.Design.Components;

model TanksConnectedPI
/* Generated with the plugin UFC - SysML4Modelica
	@ReqID: 1.0 : The system must fulfill two tanks. 
*/
	Two_tanks.Design.Components.LiquidSource source (flowLevel = 0.02);
	Two_tanks.Design.Components.Tank tank1 (area = 1);
	Two_tanks.Design.Components.Controller controller1 (ref = 0.25);
	Two_tanks.Design.Components.Tank tank2 (area = 1.3);
	Two_tanks.Design.Components.Controller controller2 (ref = 0.4);
equation
	connect(source.qOut, tank1.qIn);

	connect(controller1.cOut, tank1.tActuator);

	connect(controller1.cIn, tank1.tSensor);

	connect(tank1.qOut, tank2.qIn);

	connect(controller2.cIn, tank2.tSensor);

	connect(controller2.cOut, tank2.tActuator);


end TanksConnectedPI;
