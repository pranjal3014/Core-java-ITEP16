import java.util.Scanner;

class Q31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five didgit value : ");
        int num = sc.nextInt();

       int f1 = num/10000;
       int l1 = num%10;
       int m = (num%10000)/10;
       int f2 = m/100;
       int l2 = m%10;
       int mm = (m%100)/10;

       int res = (f1 * 10000) + (l2 * 1000) + (mm*100) + (f2*10) + l1;
       System.out.println("After Swapping : " + res );
    }
}