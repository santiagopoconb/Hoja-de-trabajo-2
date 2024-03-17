/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class BusquedaBinaria {
    
    public int busquedaBinaria(Libros[] libro, int llave2) {
        int limiteInferior = 0; // límite inferior del área de búsqueda
        int limiteSuperior = libro.length - 1; // límite superior del área de búsqueda
        int medio = (limiteInferior + limiteSuperior + 1) / 2; // mitad del área de búsqueda
        int ubicacion = -1; // valor de retorno; -1 si la llave no se encuentra
        
        do { // bucle para buscar la llave
             // imprime los elementos restantes del vector
             System.out.print(elementosRestantes(libro, limiteInferior, limiteSuperior));
             
             // imprime espacios en blanco para alinear los valores
             for (int i = 0; i < medio; i++) {
                 System.out.print(" ");
             }
             System.out.println(" * "); // indica el valor del medio del vector en la presenta iteración
             
            // si la llave se encuentra en medio del vector
            if (llave2 == libro[medio].ISBN) {
                ubicacion = medio; // ubicacion
            }
            else if (llave2 < libro[medio].ISBN) { // elemento del medio es mayor
                limiteSuperior = medio - 1; // elimina la mitad superior
            }
            else { // elemento del medio es menor
                limiteInferior = medio + 1; // elimina la mitad inferior
            }
            
            medio = (limiteInferior + limiteSuperior + 1) / 2; // recalcula el medio
        } while ((limiteInferior <= limiteSuperior) && (ubicacion == -1));
        
        return ubicacion; // retorna la ubicación de la llave
    }
    
    // método para mostrar los valores del array
    private String elementosRestantes(Libros[] libro, int limiteInferior, int limiteSuperior) {
        StringBuilder temporal = new StringBuilder();
        
        // agrega espacios para alinear los elementos
        for (int i = 0; i < limiteInferior; i++) {
            temporal.append(" ");
        }
        
        // agrega los elementos restantes del venctor
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            temporal.append(libro[i] + " ");
        }
        
        return String.format("%s%n", temporal);
    }
}
