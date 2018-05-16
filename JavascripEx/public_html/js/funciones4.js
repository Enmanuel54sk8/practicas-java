/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Muy similar a java guao xd
function sumar() {
    try {
        var operando1 = prompt("Sr, Usuario deme el valor a: ", " ");//si no proporciona nada nosotros proporcionaremos el segundo
        //la funcion isNaN valida a ver si no es un numero  //con una cadena vacia
        if (!operando1 || isNaN(operando1)) {
            throw new Error("Valor invalido de a: " + operando1);
        }

        var operando2 = prompt("Sr, Usuario deme el valor b: ", " ");
        if (!operando2 || isNaN(operando2)) {
            throw new Error("Valor invalido de a: " + operando2);
        }

        var resultado = parseInt(operando1) + parseInt(operando2);
        alert("La Suma es: "+resultado);
    } catch (e) {
        alert("El error es: " + e.message);
    }
}