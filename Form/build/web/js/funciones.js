/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForma(form1) {

    //validamos el usuario
    var usuario = form1.usuario;

    //si esta vacio o tiene el mensaje por defecto
    if (usuario.value == "" || usuario.value == "Escribe tu usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    //validamos el pass
    var password = form1.password;
    //si esta vacio o tiene el mensaje por defecto
    if (password.value == "" || password.value.length <= 7) {
        alert("La contraseña debe proporcionar un valor mayor a 8 caracteres!");
        // password.focus();
        password.select();
        return false;
    }

    //validamos los checkbox
    var tecnologias = form1.tecnologia;
    var checkSeleccionado = false;

    for (var i = 0; tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe proporcionar una tecnologia");
        return false;
    }

    //validamos el radio button
    var generos = form1.genero;
    var radioSeleccionado = false;
    for (var i = 0; generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar el genero!");
        return false;
    }

    //ocupacion
    var ocupacion = form1.ocupacion;
    if (ocupacion.value == "") {
        alert("Dene seleccionar una ocupacion");
        return false;
    }

    alert("Todo listo");
    return true;

}



    