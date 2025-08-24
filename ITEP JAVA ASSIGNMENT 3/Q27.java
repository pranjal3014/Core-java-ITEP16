import java.util.Scanner;
class Q27{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Six digit Number: ");
         int n = sc.nextInt();
         int num = n;
         int temp = n;
         int count = 0;
         int last = 0;
         int first = 0;
         int digit = 0;

         while(n!=0){
            count++;
            n /= 10;
         }
        for(int i=1; i<=count; i++){
            digit = num%10;
            if(i == 1){
            last = digit;
            }
            if(i == 5){
            first = digit;
            digit = last;
            }
            num /= 10;
        }
        System.out.println("Sum of all the Three digits: "+digit);
    }
}