//Array is a collection of variables of the same data type stored under a single name 

public class Arrays {
 public static void main(String[] args) {
//this is how you declare the arrays
     int marks[] = new int[3];  //All the values are stored in 1 variable called marks
    //  int numbers[] = {94,92,95}; you can also give input like this
    marks[0] = 97;
    marks[1] = 94;
    marks[2] = 91;

// this is how you print the arrays
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

//This is how you print the arrays if they are too much in number(using loops)
    for(int i=0; i<3; i++){
        System.out.println(marks[i]);
    }
 }
}                         
