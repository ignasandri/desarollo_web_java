//document.write("<h1>Titulo</h1>");
//document.write("<input type='button' id='boton' value='Nada'/>");

//jQuery("body").append("<h1> Titulo JQuery");
//jQuery("body").html("<h1>Titulo jQuery</h1>");

//document.getElementById("marco").innerHTML = "Otro desde JS";
//$("#marco").html($("#marco").html() + "<br/> Otro texto desde jQuery");

var arrayLIs = document.getElementsByClassName("unaClase");
for (var i = 0; i < arrayLIs.length;i++) {
    arraysLIs[i].innerHTML += " - " + i + " !!! ";
}

$(".unaClase").html("Cambiar valor");