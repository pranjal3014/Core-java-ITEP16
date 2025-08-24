import java.util.Scanner;
class Q13{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n%75 == 0){
            System.out.println(n+" is Divisible by 75");
        }
        else{
            System.out.println(n+" is NOT Divisible by 75");
        }
    }
}