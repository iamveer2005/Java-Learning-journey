// Count how many number of words are in the string.
import java.util.*;
public class StringsQ9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int count = 1;
//count = 0 we are counting words by counting the spaces between them.
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.println("The total number of words are: " + count);
    }
}
