/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gnomesorttest;

import java.util.Arrays;

/**
 *
 * @author joklu7045
 */
public class GnomeSortTest extends GnomeSortAlgorithm{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {4,9,2,5,8,21,7};
        array = gnomeSort(array);
        System.out.println(Arrays.toString(array));
        
        int[] array2 = {2,567,7823,45,237,3546,435,9834,4563,235,6,34,67,22,656,23};
        array2 = gnomeSort(array2);
        System.out.println(Arrays.toString(array2));
    }
    
}
