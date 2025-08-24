import java.util.Scanner;
class Q34{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println(year+" is a leap year");
        }
        else
        System.out.println(year+" is NOT a leap year");
    }
}