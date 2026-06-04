package basics;


public class Variable 
{
// Variable is an identifier that denotes a storage location used to store a data value 
// Constants are fixed value which do not change during execution
    public static void main(String args[])
    {
        // these are all Primitive datatypes 
        int a= 20;  
        long b = 41105224069L;
        float c = 3.14f;
        double d = 3.1415926;
        char e = 'A';
        boolean h = true;

        System.out.println( "A is an integer datatype : " +a); 
        System.out.println( "B is a long datatype : " +b);
        System.out.println( "C is a float datatype : " +c);
        System.out.println( "D is a double datatype : " +d);
        System.out.println( "E is a character datatype : " +e);
        System.out.println( "H is a boolean datatype : " +h);

        // these are non primitive datatype

        // This is a string datatype it is mostly used 
        String name = "Pranjul";
        System.out.println("My name is "+name);

        // This is an array datatype it refers to a block of memory
        int[] marks = {30,40,50};
        System.out.println("Marks obtained by 3 students are : " + marks[0] + " " + marks[1] + " " + marks[2]);
        // to sum
        System.out.println("total marks combined are :" +(marks[0]+ marks[1]+ marks[2]));

    }
}