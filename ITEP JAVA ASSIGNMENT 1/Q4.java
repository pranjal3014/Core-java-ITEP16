import java.util.Scanner;
class Q4{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        int c = sc.nextInt();

        int f = (c * 9 / 5) + 32;

        System.out.println("Fahrenheit: "+f);
    }
}