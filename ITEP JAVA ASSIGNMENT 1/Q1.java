import java.util.Scanner;
class Q1{
    public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1 NUmber: ");
    int n1 = sc.nextInt();

    System.out.print("Enter 2 Number: ");
    int n2 = sc.nextInt();

    System.out.print("Enter 3 Number: ");
    int n3 = sc.nextInt();

    System.out.print("Enter 4 Number: ");
    int n4 = sc.nextInt();

    System.out.print("Enter 5 Number: ");
    int n5 = sc.nextInt();

    int avg = (n1+n2+n3+n4+n5) / 5;

    System.out.println("Average of 5 Number: "+avg);
    }
}