// Write a program that takes 5 numbers as input and takes another number from the user to search and checks whether that number exists in the array
import java.util.*;
public class Arrays7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int []numbers = new int[5];
// Take 5 numbers as input.
       for(int i=0; i<numbers.length; i++){
        System.out.print("Enter elements : ");
        numbers[i] = sc.nextInt();
       }
// Take the input of number you want to search
       System.out.print("Enter the number to search : ");
       int search = sc.nextInt();
// Initially assume that the number is not present
       boolean found = false;
// Search through every element of the array
       for(int i=0; i<numbers.length; i++){
// Check whether current element matches search result
        if(numbers[i] == search){
            found = true;
        }
       }
       if(found){
        System.out.print(search +" is found in the array.");
       }else{
        System.out.print(search +"is not found in the array.");
       }
    }
}
