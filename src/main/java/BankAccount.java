import java.time.LocalDate;

public class BankAccount {

    // Properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private double interest;

    // Constructor
    public BankAccount(
            String inputfirstName,
            String inputlastName,
            LocalDate dateOfBirth,
            int accountNumber){
        this.firstName = inputfirstName;
        this.lastName = inputlastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

// Getters & Setters
// firstName
    public String getfirstName(){
        return this.firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

// lastName
    public String getlastName(){
        return this.lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
// LocalDate dateOfBirth
    public LocalDate getdateOfBirth(){
        return this.dateOfBirth;
    }

    public void setdateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

// int accountNumber;
    public int getaccountNumber(){
        return this.accountNumber;
}
    public void setaccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

// private int balance;

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Behaviours/Methods
    //deposit()
    public void deposit(double amount){
        balance += amount;
    }

    //withdrawl()
    public void withdrawl(double amount){
        balance -= amount;
    }

    //payInterest()
    public void payInterest(double interestRates) {
        interest = balance * interestRates;
        balance = balance + interest;
    }
    public String generateBio(){
        return "My name is " + this.firstName + " " + this.lastName + "." + " My Date of birth is "
                + this.dateOfBirth;
    }
}



