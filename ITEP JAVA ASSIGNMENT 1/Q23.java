import java.util.Scanner;
class Q23{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
   
        String result = (n%2 == 0) ? "Even" : "Odd";
        System.out.println(n+" is "+result);
    }
}