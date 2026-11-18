import java.util.*;
public class StringsQ7 {
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int count = 0;
        System.out.print("Enter the character to search for: ");
//Create a datatype target in which store the target character you want to search 
        char target = sc.next().charAt(0);
//charAt(0) means if the user by mistake enter a whole word then it Takes the word entered by the user and extract its first character (index 0).
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
// ch stores the current character; if it matches target (ch==target), the counter increases by 1.
            if(ch == target){
                count++;
            }
        }
        System.out.println(target + " is repeated "+ count+ " times.");
    }
}
