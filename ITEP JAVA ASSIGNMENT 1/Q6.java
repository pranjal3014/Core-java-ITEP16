import java.util.Scanner;
class Q6{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping \n a : "+a+" b : "+b);

       a = a+b;
       b = a-b;
       a = a-b;
        System.out.println("After Swapping \n a : "+a+" b : "+b);
    }
}