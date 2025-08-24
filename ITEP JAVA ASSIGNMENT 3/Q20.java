import java.util.Scanner;
class Q20{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math marks: ");
        double math = sc.nextInt();

        System.out.print("Enter Science marks: ");
        double science = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        double che= sc.nextInt();

        System.out.print("Enter English marks: ");
        double eng= sc.nextInt();

        System.out.print("Enter Hindi marks: ");
        double hin= sc.nextInt();

        double obtain = math + science + che + eng + hin;
        double total = 500;

        double percentage = (obtain / total) * 100;

        System.out.println("Total Marks Obtained: "+obtain);
        System.out.println("Percentage: "+percentage+"%");

        if(percentage >= 75 && percentage<=100){
            System.out.println("Grade A");
        }
        if(percentage >= 60 && percentage<75){
            System.out.println("Grade B");
        }
        if(percentage >= 50 && percentage<60){
            System.out.println("Grade C");
        }
        if(percentage >= 33 && percentage<50){
            System.out.println("Grade D");
        }
        else
        System.out.println("Fail");
    }
}