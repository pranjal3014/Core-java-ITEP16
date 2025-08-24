import java.util.Scanner;
class Q2{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle, Rate and Time: ");
        int p = sc.nextInt();   
        int r = sc.nextInt();   
        int t = sc.nextInt();   

        int SI = (p * r * t) / 100;

        System.out.println("Simple Intrest is: "+SI);
    }
}