package functions;
//Calculate the final price after applying discount on the inital price taken by user

import java.util.*;
public class discount {

    public static double discount(double price) {
    //Calculate 10% discount and subtract from initial price
    return price - (price * 10 /100);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        //Ask user to enter the original price 
        System.out.print("Enter Initial Price :");
        double Initial = sc.nextDouble();
      
        //Finalprice discount ka function call karega jise upar define kiya tha 
        double Finalprice = discount(Initial);
        
        //prints the final price after discount
        System.out.println("The Final price after discount is :" + Finalprice);
    }
}
