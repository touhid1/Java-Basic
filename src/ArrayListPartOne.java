import java.util.Scanner;

public class ArrayListPartOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        double sum = 0;
        System.out.println("Plese Enter a number : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        // number[1] = input.nextDouble();
        // number[2] = input.nextDouble();
        // number[3] = input.nextDouble();
        // number[4] = input.nextDouble();
        // number[5] = input.nextDouble();
        // number[6] = input.nextDouble();
        // number[7] = input.nextDouble();
        // number[8] = input.nextDouble();
        // number[9] = input.nextDouble();

        for (int i = 0; i < 10; i++) {
            sum = sum + number[i];
        }

        double avg = sum / number.length;

        // double sum = number[0] + number[1] + number[2] + number[3] + number[4] +
        // number[5] + number[6] + number[7]
        // + number[8] + number[9];
        System.out.println("Sum = " + sum);
        System.out.println("Avg Number = " + avg);
    }
}
