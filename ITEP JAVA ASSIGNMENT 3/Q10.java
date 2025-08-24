import java.util.Scanner;
class Q10{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();
   
        if(n1 == n2){
            System.out.println("Both the numbers are equal");
        }
        else{
            int num = (n1>n2) ? n1 : n2;
            System.out.println("Greater number is : "+num);
        }
    }
}