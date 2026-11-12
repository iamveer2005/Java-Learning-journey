// A string is a sequence of characters
import java.util.*;
public class Stringsbasics1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. CREATING A STRING
        String name = "Pranjul";
        System.out.println("String: "+ name);

        // 2. STRING INDEX starts from 0 
        System.out.println("Characters at index 0: " + name.charAt(0));
        System.out.println("Characters at index 3: " + name.charAt(3));

        // 3. HOW TO FIND STRING LENGTH (number of characters in a string)
        System.out.println("Length of String: "+ name.length());

        // 4. HOW TO FIND LAST INDEX
        System.out.println("Last Character: "+ name.charAt(name.length() - 1));

        // 5. HOW TO TAKE STRING INPUT
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
// next() will only read one word 
        System.out.println("Your name is: "+ firstName);
// nextLine() will read the whole sentence so prefer using nextline()
        // this sc.nextLine() make the next sentence to start from another line
        sc.nextLine(); 
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Full name: " + fullName);
    }
}
