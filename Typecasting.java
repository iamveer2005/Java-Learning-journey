// Typecasting is the process of converting datatype of one variable to another but is should be valid

package basics;

public class Typecasting {
    public static void main(String args[]){
       int a = 75; // this helps in converting the value of x which is in float to int
       double b = a;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        
        // To check the type, you must use Wrapper classes
        System.out.println("Type of b is: " + ((Object)b).getClass().getSimpleName());
    }
}