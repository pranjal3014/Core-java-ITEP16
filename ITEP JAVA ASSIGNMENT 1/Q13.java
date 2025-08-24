import java.util.Scanner;
class Q13{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Lowercase: ");
        String ch = sc.next();

        System.out.println("Lowercase: "+ch+"\nUppercase: "+ch.toUpperCase());
    }
}