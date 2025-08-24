import java.util.Scanner;
class Q29{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();

        double TA = (10/100f) * basic;
        double PF = (7.8/100f) * basic;
        int DA = 500;

        double grossSalary = basic + DA + TA;
        double netSalary = grossSalary - PF;

        System.out.println("Basic Salary: "+basic+"\nGross Salary: "
        +grossSalary+"\nNet Salary: "+netSalary);
    }
}