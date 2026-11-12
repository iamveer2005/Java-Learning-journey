public class Stringsbasics3 {
    public static void main(String[] args) {
        // 13. How to seperate string using arrays.
        String myLocation = "Hyderabad, Pune, Bangalore, Noida";
        String myLocationlist[] = myLocation.split(",");
// through this we can split the whole string on basis of wherever commas are there.
        for (String myLocationlist1 : myLocationlist) {
            System.out.print(myLocationlist1 + " ");
        }
        
        // 13. How to seperate one middle small string from main string
        String email = "pranjulguptaknp@gmail.com";
        String emailArr[] = email.split("@");
        String lastPart = emailArr[emailArr.length - 1];
         int dotIndex = lastPart.lastIndexOf('.');
         System.out.println(lastPart.substring(0, dotIndex));
    }
}
