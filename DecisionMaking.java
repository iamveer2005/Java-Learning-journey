package loops;
// Decision making statements are used to execute diffrent block of code based on a condition

public class DecisionMaking
{
    public static void main(String[] args)
    {
        int marks = 85;

// if statement - it executes the block of code only if given condition is true

        if(marks > 80)
        {
            System.out.println("Excellent Performance");
        } //if marks are more thab 80 then print excellent performance

// if-else statement - executes one block if condition is true and another block if condition is false 

        if(marks >= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        } // if marks are more or equal to 40 then pass if less then fail

// else-if ladder - used to check mutliple conditions sequentially
        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        } //if marks are more or equal to 90 then grade A 
         // if marks are greater than or equal to 75 then grade B
         // if marks are greater than or equal to 50 then grade C
         // or grade D

// switch statement - used to select one block of code from multiple choices
        int day = 3;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
// Break statement is use to immediately terminate a loop 
            default:
                System.out.println("Invalid Day");
        }
    }
}