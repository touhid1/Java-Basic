import java.util.Scanner;

public class ArrayfindingMaximumandMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.println("Plese Enter a number : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        double avg = sum / number.length;

        System.out.println("Sum = " + sum);
        System.out.println("Avg Number = " + avg);
        double max = number[0];
        double min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Max Number = " + max);

        // for (int i = 1; i < number.length; i++) {
        // if (min > number[i]) {
        // min = number[i];
        // }
        // }
        System.out.println("Min Number = " + min);
    }
}
