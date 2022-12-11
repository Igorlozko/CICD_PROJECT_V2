import java.util.Scanner;

public class CarLoanUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        int carLoan = input.nextInt();

        System.out.print("Enter loan length (in years): ");
        int loanLength = input.nextInt();

        System.out.print("Enter interest rate: ");
        int interestRate = input.nextInt();

        System.out.print("Enter down payment: ");
        int downPayment = input.nextInt();

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error: Zero or negative input");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment is: $" + monthlyPayment);
        }
    }
}
