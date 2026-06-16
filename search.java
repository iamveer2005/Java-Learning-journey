//Take an array as input from the user. Search for a given number x and print the  index at which it occured
// this type of searching is called linear search 

import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//Takes the size of the array from user
        System.out.print("Enter size array :");
        int size = sc.nextInt();
//Creates an array of given size
        int []numbers = new int[size];
        System.out.print("Enter array elements :");

        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();  //Store each input value from user in array
        }
//Takes the input from user which number to search 
        System.out.print("Enter number to search :");
        int x = sc.nextInt();
//Travesal loops it traverse and search for that number
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x) {
                System.out.print("x found at index :" + i);
            }
        }
    }
}
