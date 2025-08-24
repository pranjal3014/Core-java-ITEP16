import java.util.Scanner;
class Q34{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Five digit Number: ");
        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        int num = n;

        for(int i = 1; i<=5; i++){
            int digit = n%10;
            if(digit%2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
            n /= 10;
        }
        System.out.println("In this Number "+num+" how many number are Even or Odd?");
        System.out.println("Even Number: "+countEven+" Odd Number: "+countOdd);
        
    }
}