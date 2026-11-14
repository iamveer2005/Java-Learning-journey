// How to print each index value using loops

public class StringsQ1 {
    public static void main(String []args){
        String name = "Pranjul";
        for(int i=0; i<name.length(); i++){
            System.out.println("index " + i + " = " + name.charAt(i));
// in above loop i iterates on each character and reads it then in output line it means that index at i(element) = elements 
// means index 0 = P at index 0 value is P 
        }
    }
}
