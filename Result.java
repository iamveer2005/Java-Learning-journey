package functions;
//take the input (marks) of user and then tell whether he is pass or fail 

import java.util.*;
public class Result {
    public static void checkresult (int marks) {

        if (marks >= 40)
            System.out.print("The student is pass");
        else
            System.out.print("The student is fail");
    }

    public static void main(String []args) {
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        checkresult(marks);

        sc.close();
    }

}