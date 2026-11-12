// Strings are immutable, which means once a String object is created, its original value cannot be changed.
// BUT
// StringBuilder is a class in java that allows you to modify a string without creating a new obj for every modification so it is mutable.

public class Stringsbasics4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
// here, append() is used for modifying the existing StringBuilder object instead of creating a new String object for the appended text.

       StringBuilder str = new StringBuilder("how are you?");
       str.insert(0, "Hi ");
       str.insert(str.length()-1, " I'm fine");
       System.out.println(str);
// here, insert() is used for adding content at a specific index.

       StringBuilder str2 = new StringBuilder("Hey wanna have some Pizza and lemonade");
       str2.delete( 25,str2.length());
       System.out.println(str2);
// here delete() is used for removing characters from one given start index to end index

       StringBuilder str3 = new StringBuilder("Hey,Naman how are you doing?");
       str3.reverse();
       System.out.println(str3);
// here reverse() is used to reverse character sequence.

       StringBuilder str4 = new StringBuilder("Hey Ankit,");
       str4.append("is your leg ok now?");
       String str5 = str4.toString();
       System.out.println(str5);
    }
}
