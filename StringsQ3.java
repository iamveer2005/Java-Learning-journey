// Take a input from user and count how many vowels are there.
import java.util.*;
public class StringsQ3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter String: ");
        String vowel = sc.nextLine();

        int count = 0;

        for(int i=0; i<vowel.length(); i++){
            char ch = vowel.charAt(i);
// Take the character at index i from the String and store that character in the variable ch.
            if((Character.isLetter(ch))||(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u')){ 
                count++;
            }
        }
        System.out.println("Total vowels in given string are: " + count);
    }
}
