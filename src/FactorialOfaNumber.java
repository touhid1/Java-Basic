import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 1;
        System.out.print("Enter a number : ");
        n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            sum = sum * i;
            // System.out.println(sum);
        }
        System.out.println("Result = " + sum);
    }
}
