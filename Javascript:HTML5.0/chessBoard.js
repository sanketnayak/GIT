function table (height,width,color,border) {
	this.tbl  = document.createElement("table");
	this.tbl.height = height;
	this.tbl.width = width;
	this.tbl.bgcolor = color;
	this.tbl.border = border;
}

function row(i) {
	this.tr1 = document.createElement("tr");
	this.tr1.id = i ;
}

function tds (i) {
	this.td = document.createElement("td");
	this.td.innerHTML = i;
}