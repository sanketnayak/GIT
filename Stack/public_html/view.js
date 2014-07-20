function showView () {
    if(document.getElementsByTagName("table").length != 0)
        document.getElementById('body').removeChild(document.getElementsByTagName("table")[0]);
    var tbl = document.createElement("table");
    var tr = document.createElement("tr");
    for (var i = 0;  i <s1.stack.length; i++) {
       
       if(s1.stack[i]!=undefined) {
            tbl.id = 'stack';
            tbl.align='center';
            tbl.setAttribute("style","border: 2px black solid");
            tr.id = i;
            var td = document.createElement("td");
            td.innerHTML = s1.stack[i];
            tr.appendChild(td);
            tbl.appendChild(tr);
        }
         
    }
    document.getElementById('body').appendChild(tbl);
}