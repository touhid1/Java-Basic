import java.util.Scanner;

public class SeresPartOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter a Positive number : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
            // System.out.println(sum);
        }
        System.out.print("Result = " + sum);
    }
}
