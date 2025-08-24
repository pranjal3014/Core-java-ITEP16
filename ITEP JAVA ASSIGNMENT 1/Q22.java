import java.util.Scanner;
class Q22{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        int res = (a>b) ? a : b;
        System.out.println("Greater number is: "+((res>c) ? res : c));
    }
}