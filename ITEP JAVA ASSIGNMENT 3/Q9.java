import java.util.Scanner;
class Q9{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        String ch = sc.nextLine();

        if(ch.length() == 1 && Character.isDigit(ch.charAt(0))){
            System.out.println("Its a Digit");
            ch = "*";
            System.out.println("After Update: "+ch);
        }
        else{
            System.out.println("Its NOT a Digit");
        }
    }
}