within Two_tanks.Design.Components;

model PIcontinuousController
	extends Two_tanks.Design.Components.BaseController (K = 2, T = 10);
	Real x;
equation
	der(x) = error / T;
	outCtr = K * (error + x);

end PIcontinuousController;
