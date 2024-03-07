package UD7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T7Ejercicio02 {

    public static void main(String[] args) { 
        HashMap<String, Map<String, Object>> compra = new HashMap<>();
        
        boolean agregarMasArticulos = true;
        
        while(agregarMasArticulos) {
            String nombre = articulo(); 
            double precioConIva =iva();
            double devolucion = aPagar(precioConIva); 
            
            agregarDatos(compra, nombre, precioConIva, devolucion); 
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
        return sc.nextDouble(); 
    }
    
    public static double iva() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("¿Qué tipo de IVA se aplica al producto? (21% o 4%)");
        double iva = sc.nextDouble(); 
        return precioArticulo() * (iva / 100);
    }
    
    
    public static double aPagar(double precioConIva) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Cantidad de € que te da el cliente"); 
        double q€ = sc.nextDouble(); 
        return q€ - precioConIva;
    }
    
    public static void agregarDatos(HashMap<String, Map<String, Object>> compra, String nombre, double precioConIva, double devolucion) {
        Map<String, Object> detallesArticulo = new HashMap<>();
        detallesArticulo.put("PrecioConIva", precioConIva);
        detallesArticulo.put("Devolucion", devolucion);
        compra.put(nombre, detallesArticulo);
    }
    
    public static void imprimirTicket(Map<String, Map<String, Object>> compra) {
        System.out.println("----- Ticket de Compra -----");
        for (Map.Entry<String, Map<String, Object>> entry : compra.entrySet()) {
            String nombre = entry.getKey();
            Map<String, Object> detallesArticulo = entry.getValue();
            double precioConIva = ((Number) detallesArticulo.get("PrecioConIva")).doubleValue();
            double devolucion = ((Number) detallesArticulo.get("Devolucion")).doubleValue();

            System.out.println("Nombre: " + nombre);
            System.out.println("Precio con IVA: " + precioConIva);
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

