import java.util.Scanner;
class Q12{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println(n+" is Positive");
        }
        else if(n<0){
            System.out.println(n+" is Negative");
        }
        else if(n == 0){
            System.out.println(n+" is Neutral");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}