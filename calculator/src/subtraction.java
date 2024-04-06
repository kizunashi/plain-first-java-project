import java.util.Scanner;
class subtraction {
    public Object run;
    public static void run() {
        System.out.println("Subtraction.");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double A = in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        double B = in1.nextDouble();
        System.out.println("Result: ");
        System.out.println(A - B);
    }
}