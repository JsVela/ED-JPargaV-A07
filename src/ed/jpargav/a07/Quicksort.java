/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a07;

import java.util.Arrays;

/**
 *
 * @author JESUS PARGA VELA
 */
public class Quicksort {

    /**
     *
     * @param vector
     * @param inicio
     * @param fin
     */
    public static void qsort(int[] vector, int inicio, int fin) {
        int i, j, pivote, aux;
        i = inicio; j = fin;/* */// inicializamos i, j con los valores de inicio y final del vector.

        pivote = vector[(inicio+fin)/2]; // colocamos el pivote a la mitad del vector.
        
        do {
            while (vector[i] < pivote) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(vector));
        } while (i <= j);
        if (inicio < j) {
            qsort(vector, inicio, j);
        }
        if (i < fin) {
            qsort(vector, i, fin);
        }
    }
}
