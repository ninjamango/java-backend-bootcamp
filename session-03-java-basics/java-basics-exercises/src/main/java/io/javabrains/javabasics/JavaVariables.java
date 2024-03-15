package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types

        // int variable to store an integer value
        int a = 45;
        // long variable to store a long value
        long foo = 343434;
        // float variable to store a floating-point value
        float hi = 4.35f;
        // double variable to store a double value
        double b = 3.14;
        // char variable to store a single character
        char number = '3';
        // boolean variable to store a boolean value
        boolean ishere = true;
        // String variable to store a string of characters
        String Hello = "IAMBATMAN";
        // Step 2: Print the values of the variables to the console

        System.out.println(a);
        System.out.println(hi);
        System.out.println(b);
        System.out.println(number);
        System.out.println(ishere);
        System.out.println(Hello);

        // Step 3: Modify the values of the variables and print the updated values
        a = a+1;
        hi = hi+1;
        b = b + 1 ;
        number = (char) (number + 1);
        ishere = false ;
        Hello = Hello + foo ;
        foo = foo + 1;

        System.out.println(a);
        System.out.println(hi);
        System.out.println(b);
        System.out.println(number);
        System.out.println(ishere);
        System.out.println(Hello);







    }
}
