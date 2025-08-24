import java.util.Scanner;
class Q35{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 Digit number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        for(int i=1; i<=4; i++){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        if(sum > 9){
            int newSum = 0;
            for(int i=1; i<=4; i++){
            int digit  = sum%10;
            newSum += digit;
            sum /= 10;
        }
        sum = newSum;
        System.out.print("Sum of Digit: "+sum);
        }
        else{
        System.out.print("Sum of Digit: "+sum);
        }
    }
}