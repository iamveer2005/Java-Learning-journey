package functions;
import java .util.*;
public class multiply {
    public static int calculatemult(int a , int b){
    int multiply = a * b;
    return multiply;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int multiply = calculatemult(a ,b);
        System.out.println("The multiply of two numbers will be :"+ calculatemult(a, b));
    }
}
