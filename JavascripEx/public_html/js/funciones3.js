/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


window.onload = configuraSelect;

function configuraSelect() {
    //para hacer refencia a la position
    //0 del arreglo
    document.getElementById("selectFaq").selectedIndex = 0;
    document.getElementById("selectFaq").onchange = cambiaPagina;

}

function cambiaPagina() {
    //recuperamos
    var elementoSelect = document.getElementById("selectFaq");
    //recoger el valor seleccionado en el select del HTML es decir la opcion. 
    //el valor de la cadena
    var nuevaPagina = elementoSelect.options[elementoSelect.selectedIndex].value;

    if (nuevaPagina !== " ") {
        //aqui hace el cambio hacia la pagina
        window.location = nuevaPagina;
    }

}

