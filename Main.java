import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Checking checking = new Checking();
    Savings savings = new Savings();

    String menu = "1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit";

    int choice = 0;
    do {
      System.out.println(menu);
      choice = Integer.parseInt(br.readLine());

      switch (choice) {
        case 1:
          System.out.println("How much would you like to withdraw from Checking?");

          if (true) {
            float withdrawAmount = Float.parseFloat(br.readLine());
            checking.withdrawal(withdrawAmount);
          }
          break;
        case 2:
          System.out.println("How much would you like to withdraw from Savings?");
          
          if (true) {
            float withdrawAmount = Float.parseFloat(br.readLine());
            savings.withdrawal(withdrawAmount);
          }
          break;
        case 3:
          System.out.println("How much would you like to deposit into Checking?");

          if (true) {
            float depositAmount = Float.parseFloat(br.readLine());
            checking.deposit(depositAmount);
          }
          break;
        case 4:
          System.out.println("How much would you like to deposit into Savings?");
          
          if (true) {
            float depositAmount = Float.parseFloat(br.readLine());
            savings.deposit(depositAmount);
          }
          break;
        case 5:
          System.out.println("Your balance for checking " + checking.getAccountNumber() + " is " + checking.getAccountBalance());
          break;
        case 6:
          System.out.println("Your balance for savings " + savings.getAccountNumber() + " is " + savings.getAccountBalance());
          break;
        case 7:
          savings.addInterest();
        case 8:
          break;
        default:
          System.out.println("That is not a valid choice.");
          break;
      }
    } while (choice != 8);
  }
}