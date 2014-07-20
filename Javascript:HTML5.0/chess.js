function tile (file,row) {
	this.file = file;
	this.row = row;
	if(this.isCorrupt()) {
		this.file = 'a';
		this.row = 1;
	}

}

tile.prototype.print = function () {
		debug(this.file);
		debug(this.row);
	}

tile.prototype.isCorrupt = function () {
	if (this.file>='a' && this.file<='h' && this.row>=1 && this.row<=8)
		return false;
	return true;
}
function piece (color,type,location) {
	this.color = color;
	this.type = type;
	this.location = location;
	this.location.piece = this;
}

piece.prototype.print = function () {
		debug(this.color);
		debug(this.type);
		this.location.print();
	}


piece.prototype.isCorrupt = function () {
	if (this.color==true || this.color==false)
		if(this.type=="king" || this.type=="queen" || this.type=="rook" || 
		        this.type=="bishop"|| this.type=="knight" || this.type=="pawn")
			if (!this.location.isCorrupt())
				return false;
	return true;
}


function board () {
	 this.tiles = [];
	 var count = 0;
	 for (var i = 1; i <= 8; i++) {
	  	for (var j = 97; j <= 104; j++) {
	   		this.tiles[count] = new tile( String.fromCharCode(j),i);
	   		count++;
	   }; 
	 };
}


board.prototype.print = function () {
		for (var i = 0; i <= 63; i++) {
	   			this.tiles[i].print ();
	   };

}

var b = new board ();
b.print();
