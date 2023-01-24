import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "Mark",
                "Dolan",
                LocalDate.of(1999,02,03),
                1234);
                bankAccount.deposit(1000);
                bankAccount.withdrawl(100);
                bankAccount.payInterest(0.10);
                String statement = bankAccount.generateBio();
                System.out.println(bankAccount.generateBio());
                System.out.println("You have a balance of " + bankAccount.getBalance());
    }
}
