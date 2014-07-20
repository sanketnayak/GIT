function piggybank (bal) {
	var c = { };
	bal==undefined ? c.bal = c.lt = 0 : c.bal = c.lt = bal;
	c.deposit = deposit;
	c.withdraw = withdraw;
	c.stmt = stmt;
	return c;
}

function deposit(v) { this.bal = this.bal + v;
				  	  this.lt = v;
				  	}

function withdraw(v) {  if(v<=this.bal) {
				        this.bal = this.bal - v;
						this.lt = -v;
						return;
	  				 					}
			  			 debug("No enough Balance"); 
			  		  }

function stmt() {	debug("Balance = "+this.bal);
			  		debug("Last Transaction = "+this.lt);
			  	}

var piggbank1 = piggybank (100);
var piggbank2 = piggybank (500);
var piggybank3 = piggybank ();

piggbank1.withdraw(20);
piggbank1.stmt();


piggbank2.withdraw(500);
piggbank2.stmt();


piggybank3.deposit(300);
piggybank3.withdraw(50);
piggybank3.stmt();

