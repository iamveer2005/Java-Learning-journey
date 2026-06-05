// how to take input by a scanner class
package basics;

import java.util.*;
public class Input {
    public static void main(String[] args) {
        // Input
        Scanner sc= new Scanner(System.in);
        String name = sc.next();   // one word will be printed
        String College = sc.nextLine();  // one sentence will be printed
// Input can be taken by nextInt(), nextFloat() etc.
        System.out.println(name);
        System.out.println(College);
    }
}
