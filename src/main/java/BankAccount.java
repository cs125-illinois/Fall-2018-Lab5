import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings type.
         */
        CHECKINGS,

        /**
         * Savings type.
         */
        SAVINGS,

        /**
         * Student type.
         */
        STUDENT,

        /**
         * Workspace type.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Account type.
     */
    private BankAccountType accountType;

    /**
     * Account balance.
     */
    private double accountBalance;

    /**
     * Owner name.
     */
    private String ownerName;

    /**
     * Interest rate.
     */
    private double interestRate;

    /**
     * Interest earned.
     */
    private double interestEarned;

    /**
     * Contstructor taking name and account category.
     * @param name Name.
     * @param accountCategory Account Category
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }
}
