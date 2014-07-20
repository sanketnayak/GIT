
			 function deposit (v) { this.bal = this.bal + v;
						   this.lt = v;
							  			}

			 function withdraw(v) {  if(v<=this.bal) {
							      		  this.bal = this.bal - v;
										  this.lt = -v;
  				 						  }
						  	  debug("No enough Balance"); 
						  }

			 function stmt(v) {	debug("Balance = "+this.bal);
						debug("Last Transaction = "+this.lt);
					}

		



function piggybank(balance) {
	var  v = {  bal : 0,
				lt  : 0
			 }; 

	

	this.deposit = function deposit (val)
				   {
				   		v.deposit(val);
				   }

	this.withdraw = function withdraw (val)
				   {
				   		v.withdraw(val);
				   }

	this.stmt = function stmt ()
				   {
				   		v.stmt();
				   }

	balance==undefined ? bal = lt = 0 : v.bal = v.lt = balance;
	
}



var piggbank1  = new piggybank (100);
// var piggbank2  = new piggybank (500);
// var piggybank3 = new piggybank ();

//piggbank1.deposit(200);

// piggbank1.withdraw(20);
 piggbank1.stmt();


// piggbank2.withdraw(500);
// piggbank2.stmt();


// piggybank3.deposit(300);
// piggybank3.withdraw(50);
// piggybank3.stmt();

