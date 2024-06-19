// Crear las variables 'x' y 'y' como strings
var x = "6";
var y = "9";

// Convertir las variables a números y luego realizar la multiplicación
var resultado = parseInt(x) * parseInt(y);

// Mostrar el resultado de la multiplicación en el elemento con id 'mult'
document.getElementById("mult").innerHTML = "La multiplicación de " + x + " y " + y + " es: " + resultado;
