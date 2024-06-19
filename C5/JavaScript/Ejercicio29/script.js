// Define la función para mostrar "Hola" seguido del nombre
function mostraNom(nombre) {
    return "Hola " + nombre;
}

// Llama a la función con el nombre "Antonio" y actualiza el contenido del elemento con id 'demo'
document.getElementById("demo").innerHTML = mostraNom("Antonio");
