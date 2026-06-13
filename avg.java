// Enter three number from the user and make a function to print their avergae

import java.util.*;
public class avg {
    public static int printAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter First no. : ");
        int a = sc.nextInt();
         
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        
        System.out.print("Enter Third no. : ");
        int c = sc.nextInt();
        
        
        int average = printAverage(a, b, c);
        System.out.print("The Average of given three numbers is : " + average);
    }
}
