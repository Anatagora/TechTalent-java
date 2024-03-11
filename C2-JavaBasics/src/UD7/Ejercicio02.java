package UD7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) { 
        HashMap<String, Map<String, Object>> compra = new HashMap<>();
        
        boolean agregarMasArticulos = true;
        
        while(agregarMasArticulos) {
            String nombre = articulo(); 
            double precio = precioArticulo();
            double iva =iva(precio);
            double precioFinal= precioFinal(precio,iva);
            double devolucion = aPagar(precioFinal); 
            
            agregarDatos(compra, nombre, precioFinal, devolucion); 
            agregarMasArticulos = preguntarAgregarMasArticulos();
        }
        
        imprimirTicket(compra);
    }
    
    public static String articulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del articulo");
        return sc.next(); 
    }
    
    public static double precioArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del articulo");
        double precio= sc.nextDouble(); 
        return precio;
    }
    
    public static double iva(double precio) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("¿Qué tipo de IVA se aplica al producto? (21% o 4%)");
        double iva = sc.nextDouble(); 
         double precioIva= precio * (iva / 100);
         return precioIva;
    }
    
    public static double precioFinal(double precio,double iva) {
    	double precioF= precio +iva; 
    	return precioF;
    }
    
    public static double aPagar(double precioF) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Cantidad de € que te da el cliente"); 
        double q€ = sc.nextDouble(); 
        return q€ - precioF;
    }
    
    public static void agregarDatos(HashMap<String, Map<String, Object>> compra, String nombre, double precioFinal, double devolucion) {
        Map<String, Object> detallesArticulo = new HashMap<>();
        detallesArticulo.put("PrecioFinal", precioFinal);
        detallesArticulo.put("Devolucion", devolucion);
        compra.put(nombre, detallesArticulo);
    }
    
    public static void imprimirTicket(Map<String, Map<String, Object>> compra) {
        System.out.println("----- Ticket de Compra -----");
        for (Map.Entry<String, Map<String, Object>> entry : compra.entrySet()) {
            String nombre = entry.getKey();
            Map<String, Object> detallesArticulo = entry.getValue();
            double precioFinal = ((Number) detallesArticulo.get("PrecioFinal")).doubleValue();
            double devolucion = ((Number) detallesArticulo.get("Devolucion")).doubleValue();

            System.out.println("Nombre: " + nombre);
            System.out.println("Precio con IVA: " + precioFinal);
            System.out.println("Devolución: " + devolucion);
            System.out.println("----------------------------");
        }
    }
    
    public static boolean preguntarAgregarMasArticulos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea agregar más artículos? (Sí/No)");
        String respuesta = sc.next().toLowerCase();
        return respuesta.equals("si") || respuesta.equals("sí");
    }
}

