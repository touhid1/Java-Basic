import java.util.Scanner;

public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, r, sum = 0;
        System.out.print("Enter a Positive number : ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }
        if (num == sum) {
            System.out.println("This is Armstong Number");
        } else {
            System.out.println("This is not Armstong Number");
        }

    }
}
