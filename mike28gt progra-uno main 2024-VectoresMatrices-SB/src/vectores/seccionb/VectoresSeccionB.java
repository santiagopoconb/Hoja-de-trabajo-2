/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores.seccionb;

import java.util.Arrays;

/**
 *
 * @author miguelcatalan
 */
public class VectoresSeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libros [] libro=new Libros [5];
        libro[0]= new Libros(5);
        libro[1]= new Libros(10);
        libro[2]= new Libros(8);
        libro[3]= new Libros(6);
        libro[4]= new Libros(3);
        
        /*
        //Busqueda lineal con la clase libros.       
        int llave = 8;
        BusquedaLineal l = new BusquedaLineal();
        int idx = l.busquedaLineal(libro, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);

        
        //Busqueda binaria con la clase libros
        BusquedaBinaria bb = new BusquedaBinaria();
        int llave2 = 5;
        int idx = bb.busquedaBinaria(libro, llave2);
        System.out.println("El elemento " + llave2 + " se encuentra en el índice: " + idx);
        
        
        //Ordenamiento Combinado con la clase libros.
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(libro));
        OrdenamientoCombinacion ordenamientoCombinacionObj = new OrdenamientoCombinacion();
        ordenamientoCombinacionObj.ordenamientoCombinacion(libro);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(libro));
        */
        
        //Ordenamiento por inserción con la clase libros.
        
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(libro));
        OrdenamientoInsercion ordenamientoInsercionObj = new OrdenamientoInsercion();
        ordenamientoInsercionObj.ordenamientoInsercion(libro);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(libro));
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoSeleccion ordenamientoSeleccionObj = new OrdenamientoSeleccion();
        ordenamientoSeleccionObj.ordenamientoSeleccion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoInsercion ordenamientoInsercionObj = new OrdenamientoInsercion();
        ordenamientoInsercionObj.ordenamientoInsercion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoCombinacion ordenamientoCombinacionObj = new OrdenamientoCombinacion();
        ordenamientoCombinacionObj.ordenamientoCombinacion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] z = {2, 3, 5, 10, 27, 30, 34, 51, 56, 65, 77, 81, 82, 93};
        BusquedaBinaria bb = new BusquedaBinaria();
        int llave = 65;
        int idx = bb.busquedaBinaria(z, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);
        */
        
        /*
        int [] g = {34, 56, 2, 10, 77, 51, 93, 30, 5, 52};
        int llave = 93;
        BusquedaLineal l = new BusquedaLineal();
        int idx = l.busquedaLineal(g, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);
        */
    }
    
}
