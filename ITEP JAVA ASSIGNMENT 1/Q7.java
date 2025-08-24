import java.util.Scanner;
class Q7{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int r = sc.nextInt();

        System.out.print("Enter Height: ");
        int h = sc.nextInt();

        double volumeCylinder = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder: "+volumeCylinder);
    }
}