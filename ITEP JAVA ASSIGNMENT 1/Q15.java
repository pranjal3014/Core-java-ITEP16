import java.util.Scanner;
class Q15{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

      String res = (ch >= 65 && ch<= 90)?
        "Yes, its Uppercase Character" :
        "No, its not Uppercase";
        
        System.out.print(res);
    }
}