/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnomesorttest;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author joklu7045
 */
public class GnomeSortTest extends InDepthGnomeSortAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In Depth Sort:");
        int[] array = {4, 9, 2, 5, 8, 21, 7};
        array = inDepthGnomeSortAlgorithm(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Non-In Depth Sorts:");
        int[] array2 = {2, 567, 7823, 45, 237, 3546, 435, 9834, 4563, 235, 6, 34, 67, 22, 656, 23};
        array2 = gnomeSortAlgorithm(array2);
        System.out.println(Arrays.toString(array2));

        int[] randomArray = new int[25];
        Random randgen = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            int tempNum = randgen.nextInt(1000);
            randomArray[i] = tempNum;
        }
        randomArray = gnomeSortAlgorithm(randomArray);
        System.out.println(Arrays.toString(randomArray));

    }
}
