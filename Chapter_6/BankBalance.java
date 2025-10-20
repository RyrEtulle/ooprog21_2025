import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance;
        double interestRate = 0.03; // 3%
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = sc.nextDouble();

        do {
            System.out.print("Do you want to see next year's balance? \nEnter 1 for yes or any other number for no >> ");
            choice = sc.nextInt();

            if (choice == 1) {
                year++;
                balance += balance * interestRate;
                System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, interestRate, balance);
            }

        } while (choice == 1);

        System.out.println("\njGRASP: Operation complete.");
        sc.close();
    }
}
