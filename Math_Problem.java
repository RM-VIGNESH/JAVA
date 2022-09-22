package academy.learnprogramming;

import java.util.ArrayList;


// QUESTION!?
// if f(x) = x^2 and the x is in the range of -10 <= x <= 10. find the minimum value of the x in the function.

public class Math_Problem {
    public static void main(String[] args) {
        int [] arr= {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        // PRINTING THE DEFAULT ARRAY
        for (int value : arr) {
            System.out.print(" "+value);
        }
        // OUR FUNCTION VALUE IS X^2 SO WE NEED TO SQUARE THE ARRAY.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        System.out.println();
        System.out.println(" The array of f(x) is");

        // PRINTING THE SQUARED ARRAY
        for (int value : arr) {
            System.out.print(" "+value);
        }

        // FINDING MINIMUM VALUE
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println();
        System.out.println(" Smallest element present in given array: " + min);
    }
}

