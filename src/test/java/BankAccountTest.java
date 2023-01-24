import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BankAccountTest {
    @Test
    public void deposittest() {
        BankAccount bankAccount = new BankAccount(
                "Mark",
                "Dolan",
                LocalDate.of(1999, 02, 03),
                1234);
    }

        @Test
        public void withdrawaltest() {
            BankAccount bankAccount = new BankAccount(
                    "Mark",
                    "Dolan",
                    LocalDate.of(1999, 02, 03),
                    1234);
        }
}
