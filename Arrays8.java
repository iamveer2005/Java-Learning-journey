// Write a program that takes 5 numbers and prints them in reverse order.
import java.util.*;
public class Arrays8 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter elements : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("The reverse of array is : ");

        for(int i=numbers.length-1 ; i>=0 ; i--){
            int reverse = numbers[i];
            System.out.println(reverse);
        }                    
    }
}
