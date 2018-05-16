/* 
 * @author Emmanuel
 */


window.onload = cargarImagenes;

function cargarImagenes() {
    //El largo de imagenes
    for (var i = 0; i < document.images.length; i++) {
        //las que su nodopadre que es un hipervinculo
        if (document.images[i].parentNode.tagName == "A") {
            configuraRollover(document.images[i]);
        }
    }
}

function configuraRollover(imagen) {
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "cancel.png";
    imagen.onmouseout = cambiaOff;

    imagen.imagenOn = new Image();
    imagen.imagenOff.src = "send.png";
    imagen.onmouseover = cambiaOn;
}
//Son de tipo handlers ya que depende de uin boton que se presione y no al iniciar
//la pagina
function cambiaOff() {
    this.src = this.imagenOff.src;//tomamos los valores ya asociados
}
function cambiaOn() {
    this.src = this.imagenOn.src;//tomamos los valores ya asociados a esta imagen
    //es hacer el cambio dependioendo del tipo de evento 
}


