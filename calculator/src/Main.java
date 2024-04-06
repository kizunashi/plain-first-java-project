import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Welcome to the Calculator application.");
        System.out.println("Please select the desired calculation method.");
        System.out.println("    [1]Addition");
        System.out.println("    [2]Subtraction");
        System.out.println("    [3]Multiplication");
        System.out.println("    [4]Division");
        System.out.println("Operation number: ");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        if(answer == 1){
            addition app1 = new addition();
            app1.run();
        }
        if(answer == 2){
            subtraction app2 = new subtraction();
            app2.run();
        }
        if(answer == 3){
            multiplication app3 = new multiplication();
            app3.run();
        }
        if(answer == 4) {
            division app4 = new division();
            app4.run();
        }
        }
        }
}

