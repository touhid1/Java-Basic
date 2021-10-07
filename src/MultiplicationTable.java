import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.print("Enter a  number : ");
        m = input.nextInt();
        n = input.nextInt();

        /*
         * for (int i = 1; i <= 10; i++) { System.out.println(num + "x" + i + " = " +
         * num * i); }
         */
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
            }
            System.out.println("\n\n");
        }
    }
}
