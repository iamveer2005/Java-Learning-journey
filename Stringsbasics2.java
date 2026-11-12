public class Stringsbasics2 {
    public static void main(String[] args) {
  // 6. How to concatenate(add) two strings 
        String first = "Pranjul";
        String Last = "Gupta";
        String Full = first +" " +Last;
        System.out.println("The full name is: " + Full);

        // 7. HOW TO CONVERT TO UPPERCASE
        String city = "Delhi";
        System.out.println("Uppercase: "+ city.toUpperCase());

        // 8. CONVERT TO LOWERCASE
        String country = "INDIA";
        System.out.println("Lowercase: "+ country.toLowerCase());

        // 9. HOW TO FIND POSITION OR INDEX OF A CHARACTER
        System.out.println("Index of 'a' is: "+ country.indexOf('a'));
// single quotes 'a' for character and double quotes "a" for string.

        // 10. Check whether a string contains certain piece of string/.
        String sentence = "I am learning Java";
        System.out.println("Contains Java? " + sentence.contains("Java"));

        // 11. How to Trim() and remove spaces from beginning and end
        String text = " Hello World ";
        System.out.println("Before Trim: [" + text +"]");
        System.out.println("After Trim: [" + text.trim() + "]");

        // 12. How to convert a string into array
        String arr = "Pranjul Gupta";
        char ch[] = arr.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i] + " ");
        }
        System.out.println("\n" +ch.length);
    }
}
