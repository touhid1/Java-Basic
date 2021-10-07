import java.util.Scanner;

public class SericePartTow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, Result = 1;
        System.out.print("Enter a Positive number : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            Result = Result * i;
            // System.out.println(sum);
        }
        System.out.println("Result = " + Result);
    }
}
