import java.util.Scanner;
class Q7{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character: "+ch);

        char res = (ch >= 65 && ch<= 90)?
        Character.toLowerCase(ch) :
        'N';
        
       String final_ans = (res == 'N')?
        "No, its not Uppercase" :
        "After Update: "+res;

        System.out.println(final_ans);
    }
}