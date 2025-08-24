import java.util.Scanner;
class Q38{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maths Number: ");
        int math =  sc.nextInt();

        System.out.println("Enter Physics Number: ");
        int phy =  sc.nextInt();

        System.out.println("Enter Chemistry Number: ");
        int chy =  sc.nextInt(); 

        float avg = (math + phy + chy) / 3f;

        if(math>=75 && phy>=75 && chy>=75){
            if(avg>=80)
            System.out.print("Result : Pass");
        }       
        else{
            System.out.println("Result : Fail");
        }
    }
}