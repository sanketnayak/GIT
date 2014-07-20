function stack () {
    this.stack = new Array();
    this.stkptr = 10;
    this.push = function (v) {
        this.stkptr= this.stkptr - 1;
        if(this.stkptr==-1){
            document.getElementById("status").innerHTML = "<b> STACK FULL !!!! ";
            return;
        }
        this.stack[this.stkptr]=v;
    }
    this.pop = function () {
        if(this.stkptr>=10) {
            document.getElementById("status").innerHTML = "<b> STACK EMPTY !!!! ";
            return;
        }
        if(this.stkptr<0)
            this.stkptr=0;
        var m = this.stack[this.stkptr];
        this.stack[this.stkptr] = undefined;
        this.stkptr = this.stkptr + 1;
        document.getElementById("status").innerHTML = "<b> The last value popped is "+m;
    }
}

var s1 = new stack ();