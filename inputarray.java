
import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];

        System.out.print("Enter First number :");
        arr[0] = sc.nextInt();

        System.out.print("Enter second number :");
        arr[1] = sc.nextInt();
        
        System.out.print("Enter third number :");
        arr[2] = sc.nextInt();

        System.out.print("Numbers stored in array : ");

        // System.out.print(arr[0]);
        // System.out.print(arr[1]);
        // System.out.print(arr[2]);

        for( int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
    }
}
