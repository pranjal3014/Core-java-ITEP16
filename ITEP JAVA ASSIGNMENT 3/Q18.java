import java.util.Scanner;
class Q18{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year>0){
            if(year%4 == 0){
                System.out.println(year+" is a leap year");
            }
        else{
            System.out.println("Its NOT a leap year");
        }
        }
        else{
            System.out.println("Invalid Enter");
        }
    }
}