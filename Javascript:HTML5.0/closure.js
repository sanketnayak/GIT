function f1 () {

	var i = 0;
	f1.f2 = function  () {
		i++;
		debug(i);
	};

	f1.f3 = function f3 () {
		i--;
		debug(i);
	};
	//f1.f2();
}

f1();
f1.f2();
f1.f2();
f1.f2();
f1.f3();
var g1 = f1.f2;
var g2 = f1.f3;
g1();
g2();
f1();
f1.f2();
g1();
