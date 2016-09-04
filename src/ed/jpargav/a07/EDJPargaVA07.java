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
public class EDJPargaVA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] v = {20, -3, 1, 3, 7, -11, 43};
        System.out.println("Antes de ordenar");
        System.out.println(Arrays.toString(v));
        Quicksort.qsort(v, 0, v.length - 1);
    }
    
}
