/* 
 * @author Emmanuel
 */

window.onload = iniciaDatos;

//Al cargar la pagina

function iniciaDatos(){
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;
}

//Valida Salir

function validaSalir(){
    if (confirm("Desea salir del sitio")){
        alert("Nos vamos a google");
        return true;//salimos
    } else {
        alert("Nos quedamos aqui");
        return false;
    }
}

function busqueda(){
    var respuesta = prompt("Escribe la cadena a buscar:", "");
    //prompt capturamos la informacion del usuario
    
    if(respuesta){
        alert("Tu respuesta fue:" +respuesta);
        
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo Link:" +respuesta);
        
        //redireccionamos
        window.location=nuevoLink;
        return false;//regresamos false sino nos lleva al linmk originalmente
    } else {
        alert("No proporcionaste nada");
        return false;
    }
    
}


