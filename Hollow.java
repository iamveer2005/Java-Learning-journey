package patterns;

//in this programm hollow, Instead of printing *everywhere, we only print * on the 
//boundary (border) of the rectangle and print spaces inside it.

public class Hollow {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //outer loop controls the 4 rows
        for( int i=1; i<=n; i++ ){

        //inner loop controls the 5 columns
        for (int j=1; j<=m; j++){
            if( i==1 || j==1 || i==n || j==m){
// this condition checks whether the current position is on the border
// it checks if i=1 or j=1 or i=n or j=m if any condition is true print *
            System.out.print("*");
            }else {
//if the condition is false then print nothing but a black space
            System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
}
