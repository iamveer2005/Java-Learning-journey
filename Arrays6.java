// Write a program that takes 5 numbers as input and counts how many are even and how many are odd.
import java.util.*;
public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int [5];
// This loop is for entering 5 elements. 
        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter the elements of array : ");
            numbers[i] = sc.nextInt();     
        }
        int even = 0;
        int odd = 0;
// This loop is for checking each element.
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] %2 == 0){
                even++;  //Increases even count by 1
            }else{
                odd++;  // Increases odd count by 1 
            }
        }
        System.out.println("even : "+ even);
        System.out.println("odd : " +odd);
    }
}
