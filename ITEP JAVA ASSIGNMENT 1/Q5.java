import java.util.Scanner;
class Q5{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping \n a : "+a+" b : "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping \n a : "+a+" b : "+b);
    }
}