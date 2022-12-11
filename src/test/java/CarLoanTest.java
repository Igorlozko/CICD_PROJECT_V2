
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarLoanTest {
    private int carLoan;
    private int loanLength;
    private int interestRate;
    private int downPayment;

    @BeforeEach
    public void setUp() {
        // Set up test variables
        carLoan = 10000;
        loanLength = 3;
        interestRate = 5;
        downPayment = 2000;
    }

    @AfterEach
    public void tearDown() {
        // Clean up test variables
        carLoan = 0;
        loanLength = 0;
        interestRate = 0;
        downPayment = 0;
    }


}