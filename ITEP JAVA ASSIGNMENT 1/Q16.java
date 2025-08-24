import java.util.Scanner;
class Q16{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

      String res =   (ch >= 97 && ch<= 122)?
        "Yes, its Uppercase Character" :
        "No, its not Uppercase";
        
        System.out.print(res);
    }
}