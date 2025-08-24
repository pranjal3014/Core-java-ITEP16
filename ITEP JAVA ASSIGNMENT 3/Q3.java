import java.util.Scanner;
class Q3{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch>=97 && ch<=122){
            System.out.println("Its a Lowercase Character");
        }
        else{
            System.out.println("Its NOT a Lowercase Character");
        }
    }
}