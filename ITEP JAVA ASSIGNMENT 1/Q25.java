import java.util.Scanner;
class Q25{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person Height (in inches): ");
        float inch = sc.nextFloat();

        double cm = inch * 2.54;
        System.out.println("Person Height (in cm): "+cm);
    }
}