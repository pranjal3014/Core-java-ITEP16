import java.util.Scanner;
class Q28{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number(in mm): ");
        float mm = sc.nextFloat();

        double inch = mm / 25.4;
        System.out.println("Number (in inch): "+inch);
    }
}