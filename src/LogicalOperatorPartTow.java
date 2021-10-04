import java.util.Scanner;

public class LogicalOperatorPartTow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character : ");
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This is a small letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a Capatile letter");
        } else {
            System.out.println("This is not a number");
        }

    }
}
