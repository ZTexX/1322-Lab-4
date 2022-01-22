public class Savings extends Account {
  private int deposits = 0;

  public Savings(float balance) {
    super(balance);
  }

  public Savings() {
    super();
  }

  @Override
  public void withdrawal(float amount) {
    super.withdrawal(amount);

    if (super.getAccountBalance() < 500f) {
      System.out.println("Charging a fee of $10 because you are below $500.");

      super.withdrawal(10);
    }
  }

  @Override
  public void deposit(float amount) {
    deposits++;
    
    System.out.println("This is deposit " + deposits + " to this account.");
    super.deposit(amount);

    if (deposits > 5) {
      System.out.println("Charging a fee of $10.");
      super.withdrawal(10);
    }
  }

  public void addInterest() {
    float interest = 1.5f;
    float balance = super.getAccountBalance();
    float amountToDeposit = (balance / 100) * interest;

    System.out.println("Customer earned " + (double) amountToDeposit + " in interest");

    super.deposit(amountToDeposit);
  }
}