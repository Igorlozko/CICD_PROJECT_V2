public class CarLoanInp {
        private int carLoan;
        private int loanLength;
        private int interestRate;
        private int downPayment;

        public int getCarLoan() {
            return carLoan;
        }

        public void setCarLoan(int carLoan) {
            this.carLoan = carLoan;
        }

        public int getLoanLength() {
            return loanLength;
        }

        public void setLoanLength(int loanLength) {
            this.loanLength = loanLength;
        }

        public int getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(int interestRate) {
            this.interestRate = interestRate;
        }

        public int getDownPayment() {
            return downPayment;
        }

        public void setDownPayment(int downPayment) {
            this.downPayment = downPayment;
        }

        public int calculateMonthlyPayment() {
            if (loanLength <= 0 || interestRate <= 0) {
                return -1;
            }

            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            return monthlyBalance + interest;
        }

        public static void main(String[] args) {
            CarLoanInp calculator = new CarLoanInp();
            calculator.setCarLoan(10000);
            calculator.setLoanLength(3);
            calculator.setInterestRate(5);
            calculator.setDownPayment(2000);

            int monthlyPayment = calculator.calculateMonthlyPayment();
            if (monthlyPayment == -1) {
                System.out.println("Error: Zero or negative input");
            } else {
                System.out.println("Your monthly payment is: $" + monthlyPayment);
            }
        }
}
