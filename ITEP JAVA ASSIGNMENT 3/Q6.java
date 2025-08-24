import java.util.Scanner;
class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int ch = sc.nextInt();

        if(ch == 36){
            System.out.print("It's  a $ ascii value");
        }
        else if(ch == 64){
            System.out.print("It's  a @ ascii value");

        }
        else{
            System.out.print(" Invalid value");

        }
    }
}