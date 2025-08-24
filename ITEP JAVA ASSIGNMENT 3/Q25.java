import java.util.Scanner;
class Q25{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter four digit Number: ");
         int n = sc.nextInt();
         int num = n;
         int temp = n;
         int count = 0;
         int sum = 0;

         while(n!=0){
            count++;
            n /= 10;
         }
        for(int i=1; i<=count; i++){
            int digit = num%10;
            sum = sum + digit;
            num /= 10;
        }
        System.out.println("Sum of all the Three digits: "+sum);
    }
}