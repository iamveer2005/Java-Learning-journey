package Practice;



import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int sum =0;  // the variable sum will store the total
        for(int i=1; i<5 ; i++){
          sum = sum + i;  //it adds the current value of i to sum during each iteration
        }
         System.out.println(sum);
    }
}
