package academy.learnprogramming;

import java.util.Scanner;

// Find the coordinates  whether it is inside the circle or not.
public class math_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter value of x ");
        int x = myObj.nextInt();
        System.out.println("Enter value of y");
        int y = myObj.nextInt();
        System.out.println("Enter the radius");
        int r = myObj.nextInt();
        int l =  (x-3)^2 + (y-0)^2;
        int m = r^2;
        if (l == m){
            System.out.println("Theses coordinates are in the circle");
        }
    }
}
