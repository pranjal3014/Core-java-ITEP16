import java.util.Scanner;
class Q32{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Digit number: ");
        int n = sc.nextInt();

        int roundOff = ((n+5)/10) * 10;
        System.out.println("Round Off : "+roundOff);
    }
}