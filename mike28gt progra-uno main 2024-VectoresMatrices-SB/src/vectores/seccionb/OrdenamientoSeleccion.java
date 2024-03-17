/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class OrdenamientoSeleccion {
    
    public void ordenamientoSeleccion(int[] datos) {
        
        // itera a través de datos.length - 1 elementos
        for (int i = 0; i < datos.length - 1; i++) {
            int datoMenor = i; // primer índice del resto del arreglo
            
            // se itera para buscar el índice del elementos más pequeño
            for (int indice = i + 1; indice < datos.length; indice++) {
                if (datos[indice] < datos[datoMenor]) {
                    datoMenor = indice;        
                }
            }    
            
            intercambiar(datos, i, datoMenor);
            
            imprimirIteracion(datos, i + 1, datoMenor);
        }
    }
    
    private void intercambiar(int[] datos, int primero, int segundo) {
        
        int temporal = datos[primero];
        datos[primero] = datos[segundo];
        datos[segundo] = temporal;
    }
    
    private void imprimirIteracion(int[] datos, int iteracion, int indice) {
        
        System.out.printf("después de iteracion %2d: ", iteracion);
        
        // imprime elementos hasta el elemento seleccionado
        for (int i = 0; i < indice; i++) {
            System.out.printf("%d ", datos[i]);
        }
        
        // indica intercambio
        System.out.printf("%d* ", datos[indice]);
        
        // termina de imprimir el arreglo en pantalla
        for (int i = indice + 1; i < datos.length; i++) {
            System.out.printf("%d ", datos[i]);
        }
        
        System.out.printf("%n ");
        
        // indica la cnatidad del arreglo que está ordenada
        for (int j = 0; j < iteracion; j++) {
            System.out.print("-- ");
        }
        
        System.out.println();
    }
    
}
