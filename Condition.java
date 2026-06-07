
package loops;
import java.util.*;
public class Condition {
    public static void main(String[] args) {
        // To take input we always use scanner class
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        if(x%2 == 0) {    // if value of x is divided by and gives reminder zero then it is even
            System.out.println("Even");
        }else {           // if value of x is divided by and it does not gives reminder zero then it is odd
            System.out.println("Odd");
        }
    }
}
