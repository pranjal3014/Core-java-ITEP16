import java.util.Scanner;
class Q4{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
            System.out.println("Its a Alphabet");
        }
        else{
            System.out.println("Its NOT a Alphabet");
        }
    }
}