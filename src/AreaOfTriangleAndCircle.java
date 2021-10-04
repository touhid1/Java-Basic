import java.util.Scanner;

public class AreaOfTriangleAndCircle {
    public static void main(String[] args){
        //Triangle Area
        Scanner input = new Scanner(System.in);
        double base , hight ,area;
        System.out.print("Enter tha base Value : ");
        base = input.nextDouble();
        System.out.print("Enter tha hight Value : ");
        hight = input.nextDouble();
        area = 0.5*(base*hight);
        System.out.println("Result = "+area);
    }
}
