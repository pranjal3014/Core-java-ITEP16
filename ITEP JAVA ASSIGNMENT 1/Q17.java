import java.util.Scanner;
class Q17{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

      String res = ((ch >= 97 && ch<= 122) || (ch >= 65 && ch<= 90))?
        "Yes, its a Character" :
        "No, its not a Character";
        
        System.out.print(res);
    }
}