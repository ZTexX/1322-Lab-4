public class Checking extends Account { 
  public Checking(float balance) {
    super(balance);
  }

  public Checking() {
    super();
  }

  @Override
  public void withdrawal(float amount) {
    super.withdrawal(amount);

    if (super.getAccountBalance() < 0.00f) {
      System.out.println("Charging an overdraft fee of $20 because account is below $0.");

      super.withdrawal(20);
    }
  }
}