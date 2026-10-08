// Find the smallest element in an array
import java.util.*;
public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter the elements of the array : ");
            numbers[i] = sc.nextInt();
        }
        int smallest = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest numbers is :" + smallest);
    }
}
