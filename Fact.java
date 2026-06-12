package functions;

import java.util.*;
public class Fact {
    public static double printFactorial(double  n) {
// Ngeative numbers ka factorial nahi hota  
         if (n < 0 ){
            System.out.println("Invalid Number ");
            return 0  ;  //Exit this method immediately 
        }
        double factorial = 1;

        for(double i=n ; i>=1 ; i--) {
        factorial = factorial * i;
//Loop n se leke 1 tak chalegi aur i ki jo bhi current vlue hogi use factorial se multiply karegi
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double n =sc.nextDouble();

        System.out.print("The factorial of given no. is : " + printFactorial(n));

        sc.close();
    }
}