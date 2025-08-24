import java.util.Scanner;
class Q15{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n1 = sc.nextInt();

        if(n1>=50 && n1<=100){
            System.out.println("The Number in between 50 and 100");
        }
        else{
            System.out.println("The Number is not lie between 50 and 100");
        }
    }
}