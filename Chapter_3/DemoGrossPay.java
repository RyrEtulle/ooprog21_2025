import java.util.Scanner;

public class DemoGrossPay {

    public static void calculateGross(double hoursWorked) {
        final double HOURLY_RATE = 22.75;
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println("Gross Pay: $" + grossPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        
        calculateGross(hoursWorked);
        
        scanner.close();
    }
}
