import java.util.Scanner;
class Q27{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number(in feet): ");
        float feet = sc.nextFloat();

        double meter = feet * 0.30;
        System.out.println("Number (in meter): "+meter);
    }
}