import java.util.Scanner;
class Q9{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextInt();

        System.out.print("Enter side b: ");
        double b = sc.nextInt();

        System.out.print("Enter side c: ");
        double c = sc.nextInt();

        double s = (a+b+c) / 2f;

        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of Triangle: "+area);
    }
}