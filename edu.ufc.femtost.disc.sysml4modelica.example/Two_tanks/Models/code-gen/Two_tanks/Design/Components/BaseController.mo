within Two_tanks.Design.Components;

partial model BaseController
	parameter Real K = 2.0;
	parameter Real T = 10.0;
	parameter Real ref;
	Real error;
	Real outCtr;
	Two_tanks.Design.Interface.ReadSignal cIn;
	Two_tanks.Design.Interface.ActSignal cOut;
equation
	error = ref - cIn.val;
	cOut.act = outCtr;

end BaseController;
