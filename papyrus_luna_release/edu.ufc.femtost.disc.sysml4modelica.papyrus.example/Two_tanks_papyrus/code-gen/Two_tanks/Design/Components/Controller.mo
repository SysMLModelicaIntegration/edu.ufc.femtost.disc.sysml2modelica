within Two_tanks.Design.Components;

model Controller
	extends Two_tanks.Design.Components.BaseController(T = 10, K = 2);
/* Generated with the plugin UFC - SysML4Modelica
	@ReqID: 1.2 : After 350 sec, the liquid height must be stabilized in both tanks.
*/
	Real x;
	Two_tanks.Design.Interface.ActSignal cOut;
	Two_tanks.Design.Interface.ReadSignal cIn;
equation
	der(x) = error / T;
	outCtr = K * (error + x);

end Controller;
