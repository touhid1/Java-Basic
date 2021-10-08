import java.util.Scanner;

public class PrimeNumbersFrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, totalPrimeNumber = 0;
        System.out.println("Plese Enter a number");
        m = input.nextInt();
        System.out.println("Plese Enter a number");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                totalPrimeNumber++;
            }
            count = 0;
        }
    }
}
