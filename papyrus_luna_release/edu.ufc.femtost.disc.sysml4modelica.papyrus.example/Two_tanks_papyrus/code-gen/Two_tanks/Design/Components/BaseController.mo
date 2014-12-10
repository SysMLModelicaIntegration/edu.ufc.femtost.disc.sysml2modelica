within Two_tanks.Design.Components;

partial model BaseController
/* Generated with the plugin UFC - SysML4Modelica
*/
	parameter Real K = 2.0;
	parameter Real T (unit = "s") = 10.0;
	parameter Real ref;
	Real error;
	Real outCtr;
equation
	error = ref - cIn.val;
	cOut.act = outCtr;

end BaseController;
