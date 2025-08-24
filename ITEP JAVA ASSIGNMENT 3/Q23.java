import java.util.Scanner;
class Q23{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        int amount = sc.nextInt();

        int count1000 = 0, count500 = 0, count100 = 0, count50 = 0, count20 = 0,
        count10 = 0, count5 = 0, count2 = 0, count1 = 0;

        while(amount != 0){
        if(amount>=1000){
            amount = amount - 1000;
            count1000++;
        }
        else if(amount<1000 && amount >= 500){
            amount = amount - 500;
            count500++;
        }
        else if(amount<500 && amount>=100){
            amount = amount - 100;
            count100++;
        }
        else if(amount<100 && amount>=50){
            amount = amount - 50;
            count50++;
        }
        else if(amount<50 && amount>=20){
            amount = amount - 20;
            count20++;
        }
        else if(amount<20 && amount>=10){
            amount = amount - 10;
            count10++;
        }
        else if(amount<10 && amount>=5){
            amount = amount - 5;
            count5++;
        }
        else if(amount<5 && amount>=2){
            amount = amount - 2;
            count2++;
        }
        else if(amount<2 && amount>=1){
            amount = amount - 1;
            count1++;
        }
        }
        System.out.println("1000: "+count1000);
        System.out.println("500: "+count500);
        System.out.println("100: "+count100);
        System.out.println("50: "+count50);
        System.out.println("20: "+count20);
        System.out.println("10: "+count10);
        System.out.println("5: "+count5);
        System.out.println("2: "+count2);
        System.out.println("1: "+count1); 
    }
}