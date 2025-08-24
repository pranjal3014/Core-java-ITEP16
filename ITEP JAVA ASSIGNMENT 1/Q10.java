import java.util.Scanner;
class Q10{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Addition: "+(a+b));
        System.out.println("Sub: "+(a-b));
        System.out.println("Multiple: "+(a*b));
        System.out.println("Divide: "+(a/b));
        System.out.println("Mod: "+(a%b));
    }
}