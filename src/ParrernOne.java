import java.util.Scanner;

public class ParrernOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Plese Enter a colum");
        n = input.nextInt();
        for (int col = 1; col <= n; col++) {
            for (int row = 1; row <= col; row++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }
}
