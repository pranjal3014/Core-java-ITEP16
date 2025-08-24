import java.util.Scanner;
class Q17{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if(ch>=32 && ch <= 64 || ch>=91 && 96 || ch == 123 || ch == 125){
            System.out.println("Character is Special Symbol");
        }
        else{
            System.out.println("Character is NOT a Special");
        }
    }
}