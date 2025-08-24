import java.util.Scanner;

class Q28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five digit Value : ");
        int num = sc.nextInt();

        int Firstdigit = num/10000;
        int Lastdigit = num%10;
        int Middledigit = (num%10000)/10;

        int res = (Lastdigit * 10000)+(Middledigit * 10) + Firstdigit;
        System.out.print("After first nd last diit Swapping : " + res);


    }
}