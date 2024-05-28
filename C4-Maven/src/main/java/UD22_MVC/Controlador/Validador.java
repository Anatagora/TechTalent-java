package UD22_MVC.Controlador;


public class Validador {

    public static boolean validarNombre(String nombre) {
        // Validar que el nombre no esté vacío y no contenga caracteres especiales
        return !nombre.isEmpty() && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚ]+");
    }

    public static boolean validarApellido(String apellido) {
        // Validar que el apellido no esté vacío y no contenga caracteres especiales
        return !apellido.isEmpty() && apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚ]+");
    }

    public static boolean validarDNI(String dni) {
        // Validar que el DNI contenga exactamente 8 dígitos numéricos
        return dni.matches("\\d{8}");
    }

    public static boolean validarFecha(String fecha) {
        // Puedes implementar una validación más avanzada para la fecha si es necesario
        // Por ejemplo, verificar el formato de la fecha
        return true; // Por ahora, simplemente devolvemos true
    }
}

