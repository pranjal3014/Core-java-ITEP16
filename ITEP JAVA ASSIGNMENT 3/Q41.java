import java.util.Scanner;
class Q41{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        int num = n;
        int temp = n;
        int sum =0;
        int count = 0;

        while(n != 0){
            count++;
            n /= 10;
        }

        while(num != 0){
        int res = 1;
        int digit = num%10;
        for(int i=1; i<=count; i++){
            res =res *digit;
        }
        sum = sum + res;
        num /= 10;
        }
        
        if(temp == sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is NOT Armstrong");
        }
    }
}