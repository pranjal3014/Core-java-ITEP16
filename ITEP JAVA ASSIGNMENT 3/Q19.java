import java.util.Scanner;
class Q19{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Nationality(i/I): ");
        char ch = sc.next().charAt(0);

        if(ch == 'i' || ch == 'I'){
            System.out.println("User is Indian");
            System.out.print("Enter your Age: ");
            int age = sc.nextInt();

            if(age>=18){
                System.out.println("You are Eligible for Vote");
            }
            else{
                System.out.println("You are NOT Eligible for Vote");
            }
        }
        else{
            System.out.println("User is NOT Indian");
        }
    }
}