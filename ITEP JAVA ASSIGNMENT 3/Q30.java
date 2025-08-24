import java.util.Scanner;
class Q30{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Five digit number: ");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;

        for(int i=1; i<=5; i++){
            int digit = n%10;
            rev = (rev*10)+digit;
            n /= 10;
        }

        System.out.println("Reverse: "+rev);
    }
}