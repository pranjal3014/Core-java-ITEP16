import java.util.Scanner;
class Q3{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        int f = sc.nextInt();

        int c = (f-32) * 5 / 9;

        System.out.println("Celsius: "+c);
    }
}