import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        /*
         * If ConditionalOperator // if (num>0) { // System.out.println("Postive"); }
         */

        /*
         * if (num>0) { System.out.println("Positive"); } else {
         * System.out.println("Negative"); }
         */

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}