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
        long startTime1 = System.currentTimeMillis();
        array = inDepthGnomeSortAlgorithm(array);
        long endTime1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println("Timer(ms): " + (endTime1 - startTime1) + "\n");

        System.out.println("Non-In Depth Sorts:");
        int[] array2 = {2, 567, 7823, 45, 237, 3546, 435, 9834, 4563, 235, 6, 34, 67, 22, 656, 23};
        long startTime2 = System.currentTimeMillis();
        array2 = gnomeSortAlgorithm(array2);
        long endTime2 = System.currentTimeMillis();
        System.out.println(Arrays.toString(array2));
        System.out.println("Timer(ms): " + (endTime1 - startTime1) + "\n");
        
        System.out.println("Randomized Array Sort:");        
        int[] randomArray = new int[10000];
        Random randgen = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            int tempNum = randgen.nextInt(100000);
            randomArray[i] = tempNum;
        }
        long startTime3 = System.currentTimeMillis();
        randomArray = gnomeSortAlgorithm(randomArray);
        long endTime3 = System.currentTimeMillis();
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Timer(ms): " + (endTime3 - startTime3));

    }
}
