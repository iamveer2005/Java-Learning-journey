
package Practice;


import java.util.*;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : if(button == 1);
            System.out.println("Hello");
            break;

            case 2 : if(button ==2);
            System.out.println("Namaste");
            break;

            case 3 : if (button == 3);
            System.out.println("Bonjour"); 
            break;

            case 4 : if (button == 4);
            System.out.println("Invalid Greetings");
            break;
        }
    }
}
