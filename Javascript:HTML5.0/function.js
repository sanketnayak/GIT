function f1 (num1,num2)
{

	var sum = num1 + num2;
	debug(sum);
}
function f2 (num1,num2)
{

	var diff = num1 - num2;
	debug(diff);
}
function f3 (num1,num2)
{

	var mul = num1 * num2;
	debug(mul);
}
function f4 (num1,num2)
{

	var div = num1 / num2;
	debug(div);
}

f1(10,20);
f2(20,10);
f3(10,20);
f4(100,10);
f1();
var s = undefined;
debug(typeof(s));