import java.util.Scanner;
class Q37{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Last month unit: ");
        int lastMonth = sc.nextInt();

        System.out.print("Enter Current month unit: ");
        int CurrentMonth = sc.nextInt();
        int FinalBill = 0;

        int unit = CurrentMonth - lastMonth;

        if(unit>0 && unit<= 100){
            FinalBill = unit * 2;
        }
        else if(unit>100 && unit<= 200){
            FinalBill = unit * 3;
        }
        else if(unit>200 && unit<= 300){
            FinalBill = unit * 4;
        }
        else if(unit>300){
            FinalBill = unit * 5;
        }
        System.out.println("The final Electricity Bill: "+FinalBill);
    }
}