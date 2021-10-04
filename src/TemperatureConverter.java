import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celsius , Fahrenheit;
        System.out.print("input Fahrenheit : ");
        Fahrenheit =input.nextDouble();
        celsius = .55*Fahrenheit-32;
        System.out.println("celsius : "+celsius);
    }
}
