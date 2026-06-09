package Patterns;
//A NESTED LOOP is a loop inside another loop, where the inner loop repeats all its iterations each time the outer loop runs.

public class forl {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //outer loop is controlling the rows which is n
        for (int i = 1; i<=n; i++){
        //inner loop is controlling the columns which is m
            for( int j=1; j<=m; j++){
// System.out.print keeps the output in one line 
                System.out.print("*");
            }
// System.out.println() moves the cursrn to next line after printing 5 stars* in one line
            System.out.println();
        }
    }
}
