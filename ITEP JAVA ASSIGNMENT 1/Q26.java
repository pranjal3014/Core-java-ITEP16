import java.util.Scanner;
class Q26{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number(in meter): ");
        float meter = sc.nextFloat();

        double feet = meter * 3.28;
        System.out.println("Number (in feet): "+feet);
    }
}