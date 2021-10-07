import java.util.Scanner;

public class PrintEvenNumberFrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter a Positive number : ");
        m = input.nextInt();
        n = input.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 1)
                sum = sum + i;
        }
        System.out.println(sum);
    }
}
