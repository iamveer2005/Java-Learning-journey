// remove spaces from the strings
import java.util.*;
public class StringsQ8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String space = sc.nextLine();
//Create a string named result which will no value as it will be used to print the new string.
        String result = "";

        for(int i=0; i<space.length(); i++){
            char ch = space.charAt(i);
// Check the current character; if it is not a space, add it to result.
            if(ch != ' '){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
