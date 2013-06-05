within Two_tanks.Design;

package Components
	function limitValue
	input Real pMin;
	input Real pMax;
	input Real p;
	output Real pLim;
	algorithm
		pLim:=if p > pMax then pMax else if p < pMin then pMin else p;
	end limitValue;
end Components;
