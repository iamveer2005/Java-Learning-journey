// Check whether a string is palindrome or not

import java.util.*;

public class StringsQ6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String palindrome = sc.nextLine();

        String reverse = "";

        // Creating reverse of the String, name.charAt(i)- it is used to access the elements
        for(int i = palindrome.length() - 1; i >= 0; i--){
            reverse = reverse + palindrome.charAt(i);
        }

        // Comparing original and reverse
        if(palindrome.equals(reverse)){
            System.out.println("The String is a palindrome.");
        }
        else{
            System.out.println("The String is not a palindrome.");
        }

        System.out.println("The reverse of String is: " + reverse);
    }
}