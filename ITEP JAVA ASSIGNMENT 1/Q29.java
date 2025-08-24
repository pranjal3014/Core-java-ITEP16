import java.util.Scanner;
class Q29{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int d = sc.nextInt();

        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        if (d > greatest) {
            greatest = d;
        }
        System.out.println("Greater number is: "+greatest);
    }
}