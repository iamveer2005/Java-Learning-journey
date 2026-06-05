package Practice;


import java.util.Scanner;

// Take input of 2 variable from user and tell whether a=b or a<b or a>b
class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==b){
            System.out.println("equal");
        } else {
            if(a>b){
                System.out.println("a is greater than b");
            } else {
                System.out.println("a is lesser");
            }
        }
    }
}

