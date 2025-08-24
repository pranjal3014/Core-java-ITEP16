import java.util.Scanner;
class Q2{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println("Its a Uppercase Character");
        }
        else{
            System.out.println("Its NOT a Uppercase Character");
        }
    }
}