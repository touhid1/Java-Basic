import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese Enter a colum");
        char c = input.next().charAt(0);
        for (int row = 1; row <= c; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }
    }
}
