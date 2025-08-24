import java.util.Scanner;
class Q14{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();

        if(n1%n2 == 0){
            System.out.println("First number is divisible by second");
        }
        else{
            System.out.println("First number is NOT divisible by second");
        }
    }
}