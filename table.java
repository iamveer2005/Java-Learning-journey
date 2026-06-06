// print the table of a number given input by the user


package Practice;

import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for(int i=1 ; i<11 ; i++){
            System.out.println(i*n);
        }
    }
}
 