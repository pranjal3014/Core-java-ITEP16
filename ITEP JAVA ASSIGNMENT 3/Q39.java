import java.util.Scanner;

class Q39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x for (a): ");
        int x = sc.nextInt();
        int y = x - 2 + 3 * x - 7;
        System.out.println("a Value of y = " + y);

        System.out.print("\nEnter value of x for b: ");
        x = sc.nextInt();
        y = x++ + ++x;
        System.out.println("b Value of x = " + x);
        System.out.println("b Value of y = " + y);

        System.out.print("\nEnter values of x and y for (c): ");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = x++ - --y - --x + x++;
        System.out.println("c Value of x = " + x);
        System.out.println("c Value of y = " + y);
        System.out.println("c Value of z = " + z);

        System.out.print("\nEnter boolean values (true/false) for x and y (for d): ");
        boolean bx = sc.nextBoolean();
        boolean by = sc.nextBoolean();
        boolean bz = (bx && by) || !(bx || by);
        System.out.println("d Value of z = " + bz);

        
    }
}