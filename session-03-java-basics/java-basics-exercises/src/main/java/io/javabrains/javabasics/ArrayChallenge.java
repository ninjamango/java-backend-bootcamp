package io.javabrains.javabasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayChallenge {

    public static void main(String[] args) {
        // Step 1: Create an array of integers

        int[] arr = {1,2,3,4,5};
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).average());
        System.out.println(Arrays.stream(arr).max());


        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
            
        System.arraycopy(array1,0,array2,0,5);

        for (int j : array2) {
            System.out.println(j);
        }
        ;

        array2 = array1 ;



    }
}
