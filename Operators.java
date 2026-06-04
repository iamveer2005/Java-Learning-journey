
// WAP to show all operators in java
package basics;


public class Operators{
    public static void main(String[] args) {
       int a = 10, b = 3;
// arithmetic operator
System.out.println("----------ARITHMETIC OPERATORS----------");

        System.out.println("A+B :" +(a + b));   // 13  → addition
        System.out.println("A-B :" +(a - b));   // 7   → subtraction
        System.out.println("A*B :" +(a * b));   // 30  → multiplication
        System.out.println("A/B :" +(a / b));   // 3   → division (NOT 3.33!)
        System.out.println("A%B :" +(a % b));   // 1   → modulus (remainder)  
// Relational Operator 
System.out.println("----------RELATIONAL OPERATORS----------");
        System.out.println("a is smaller than b :" + (a<b));
        System.out.println("a is greater than b :" + (a>b));
        System.out.println("a is equal to b :" + (a==b));
        System.out.println("a is less than or equal to b :" + (a<=b));
        System.out.println("a is greater than or equal to b :" + (a>=b));
        System.out.println("a is not equal to b :" + (a!=b));
// Logical Operator
// && - AND (both statements should be true)
// || - OR ( any of one statements should be true)
// !  - NOT ( both should not be true )
System.out.println("----------LOGICAL OPERATORS----------");
        System.out.println("a is less than 5 AND b is greater than 1 :" + (a>5 && b>1));
        System.out.println("a is less than 5 OR b is greater than 1 :" + (a>55 || b>1));

// Assignment Operator 
System.out.println("----------ASSIGNMENT OPERATORS----------");
       System.out.println("a is equal to :" +a);
       System.out.println("a plus 1 is equal to :" + (a+=1));
       System.out.println("a minus 1 is equal to :"+ (a-=1));
       System.out.println("a multiplies by 2 is equal to :" + (a*=2));
       System.out.println("a mod 2 is equal to :"+ (a%=2));
       System.out.println("a divided by 2 is equal to :"+ (a/=2));

// Increment/Decrement operator
System.out.println("----------INCREMENT/DECREMENT OPERATORS----------");
      System.out.println("a is equal to :" +a);
      System.out.println(" a is increased by 1 :"+ (a++)); a=10;
      System.out.println(" a is decresed by 1 :"+ (a--));
    }
}

// While in input you'll notice that value of a is varying and the second operation carries the value of A 
// so to solve this simply write a=10; after each opertion to save the value of a as 10 for next operation.
