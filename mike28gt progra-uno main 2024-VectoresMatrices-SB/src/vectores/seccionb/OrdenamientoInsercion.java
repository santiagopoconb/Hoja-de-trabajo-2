/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class OrdenamientoInsercion {
    
    public void ordenamientoInsercion(Libros[] libro) {
        
        // itera a través de datos.length - 1 elementos
        for (int siguiente = 1; siguiente < libro.length; siguiente++) {
            
            // valor a insertar
            int insercion = libro[siguiente].ISBN;
            // posición en donde se va a colocar el elemento
            int moverElemento = siguiente;
            
            // busca posición para colocar el elemento actual
            while (moverElemento > 0 && libro[moverElemento - 1].ISBN > insercion) {
            
                // desplaza el elemento una posición a la derecha
                libro[moverElemento] = libro[moverElemento - 1];
                moverElemento--;
            }
            
            // coloca el elemento insertado
            libro[moverElemento].ISBN = insercion;
            //imprime la iteración del algoritmo
            imprimirIteracion(libro, siguiente, moverElemento);
        }
    }
    
    private void imprimirIteracion(Libros[] libro, int iteracion, int indice) {
        
        System.out.printf("despues de iteración %2d: ", iteracion);
        
        // imprime los elementos hasta el elemento intercambiado
        for (int i = 0; i < indice; i++) {
            System.out.printf("%d ", libro[i]);
        }
        
        // indica intercambio
        System.out.printf("%d* ", libro[indice]);
        
        // termina de imprimir el arreglo en pantalla
        for (int i = indice + 1; i < libro.length; i++) {
            System.out.printf("%d ", libro[i]);
        }
        
        System.out.printf("%n ");
        
        // indica la cantidad del arreglo que está ordenado
        for (int i = 0; i <= iteracion; i++) {
            System.out.printf("-- ");
        }
        System.out.println();
    }
}
