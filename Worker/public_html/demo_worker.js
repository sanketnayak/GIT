/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var i = 0;

function timedCount() {
    
    i = i + 1;
    postMessage(i);
    setTimeout("timedCount()",500);
}

timedCount();

