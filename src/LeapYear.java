import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year;
        System.out.println("Ente the year : ");
        Year = input.nextInt();
        if (Year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is a not leap year");
        }
    }
}