public class Account {
  private int accountNumber;
  private float accountBalance;

  private static int incrementalId = 10000;

  public Account(float accountBalance) {
    incrementalId++;
    this.accountNumber = incrementalId;
    this.accountBalance = accountBalance;
  }

  public Account() {
    this(0.0f);
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public float getAccountBalance() {
    return this.accountBalance;
  }

  public void setAccountBalance(float balance) {
    this.accountBalance = balance;
  }

  public void withdrawal(float amount) {
    this.accountBalance -= amount;
  }

  public void deposit(float amount) {
    this.accountBalance += amount;
  }
}