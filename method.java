package functions;
//A method is a block of code that performs a specific task and can be called whenever needed, it helps in avoiding code repetition

public class method {
    
    //Method 1
    public static void greet(){   //when there is void it takes no input and return nothing(void)
        System.out.println("Welocme to java");  //it simply prints the method
    }

    //Method 2
    public static int add(int a , int b){  //takes 2 input a and b and returns an integer that's why there is no void
        return a+b;  //return sends the result back to where the method was called.
    }
    
    public static void main(String[] args) {
        greet(); //Method 1 is called

        int sum = add(10,20);  //calling method 2
        System.out.println("Sum = " + sum);
    }
}
