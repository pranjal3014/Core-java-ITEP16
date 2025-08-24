import java.util.Scanner;
class Q22{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Car Service");

        System.out.print("You want to rent a car? [Y/N]: ");
        char rent = sc.next().charAt(0);
        double finalPrice = 0;
        double compact = 0;
        double fullsize = 0;
        double normalPrice = 0;
        char coupon = '0';

        if(rent == 'Y' || rent == 'y'){
            System.out.print("You want Compact or Fullsize? [C/F]: ");
            char choice = sc.next().charAt(0);
        
        if(choice == 'C' || choice == 'c'){
            System.out.println("The user has selected compact");
            compact = 456.56; 
            normalPrice = compact;
        }
        else if(choice == 'F' || choice == 'f'){
            System.out.println("The user has selected Fullsize");
            fullsize = 460.50;
            normalPrice = fullsize;
        }
        else{
            System.out.print("Invalid input");
        }
        
        System.out.print("You have coupon or not [Y/N]: ");
        coupon = sc.next().charAt(0);

        if(coupon == 'Y' || coupon == 'y'){
            if(choice == 'C'|| choice == 'c')
            finalPrice = compact - (compact * (7/100f));
            else if(choice == 'F' || choice == 'f')
            finalPrice = fullsize - (fullsize * (7/100));
        }            
        }
        else{
            System.out.println("You don't want to rent a car\n\tThank You!!!");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("\t    Car Service");
        System.out.println("----------------------------------------------------");
        System.out.println("Final price: "+((coupon == 'Y' || coupon == 'y')? finalPrice : normalPrice));
        System.out.println("----------------------------------------------------");
        System.out.println("\tThank you!!! Visit Again...");
        System.out.println("----------------------------------------------------");
    }
}