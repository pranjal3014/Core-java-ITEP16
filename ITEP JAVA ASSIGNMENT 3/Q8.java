import java.util.Scanner;
class Q8{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character: "+ch);

        char res = (ch >= 97 && ch<= 122)?
        Character.toUpperCase(ch) :
        'N';
        
       String final_ans = (res == 'N')?
        "No, its not Lowercase" :
        "After Update: "+res;

        System.out.println(final_ans);
    }
}