// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class circumference{
    public static Double getCircumference(Double radius){
    return 2* 3.14 * radius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        Double radius = sc.nextDouble();

        System.out.print(getCircumference(radius));
    }
}