import java.util.Scanner;
class Q36{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 Digit number: ");
        int n = sc.nextInt();
        int lowest = 9;
        int greatest = 0;

        for(int i=1; i<=4; i++){
            int digit = n%10;
            if(digit > greatest){
                greatest = digit;
            }
            if(lowest > digit){
                lowest = digit;
            }
            n /= 10;
        }
        System.out.println("Greatest Digit: "+greatest);
        System.out.println("Lowest Digit: "+lowest);
    }
}