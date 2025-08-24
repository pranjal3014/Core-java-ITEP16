import java.util.Scanner;
class Q12{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Uppercase: ");
        String ch = sc.next();

        System.out.println("Uppercase: "+ch+"\nLowercase: "+ch.toLowerCase());
    }
}