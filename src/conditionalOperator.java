import java.util.Scanner;

public class conditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, large;
        System.out.println("Enter a Positive number : ");
        x = input.nextInt();
        y = input.nextInt();
        large = (x > y) ? x : y;
        System.out.println("The largest number = " + large);

    }

}
