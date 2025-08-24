import java.util.Scanner;
class Q40{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        int num = n;
        int temp = n;
        int rev = 0;
        int count = 0;

        while(n != 0){
            count++;
            n /= 10;
        }

        for(int i=1; i<=count; i++){
            int digit = num%10;
            rev = (rev*10)+digit;
            num /= 10;
        }
        
        if(temp == rev){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is NOT Palindrome");
        }
    }
}