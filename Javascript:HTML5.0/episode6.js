var a = { x :10,
		  y : "hello",
		  f : function(){ debug(200); }
		  };

function copy(b) {
	var c = {};
	c.x = b.x;
	c.y = b.y;
	return c;
}
debug(a.x);
debug(a.y);
var b = copy(a);
debug(b.x);
b.x=20;
debug(a.x);
b.f = a.f;
a.f();
b.f ();
