within Two_tanks.Design.Components;

model PIcontinuousController
	extends Two_tanks.Design.Components.BaseController;
	Real x;
equation
	der(x) = error / T;
	outCtr = K * (error + x);

end PIcontinuousController;
