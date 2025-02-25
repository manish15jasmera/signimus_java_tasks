// Implement a banking system where multiple threads withdraw money from a shared account, ensuring that withdrawal does not exceed balance.

class BankAccount {
  private int balance;

  public BankAccount(int balance) {
      this.balance = balance;
  }

  public synchronized void withdraw(int amount, String threadName) {
      if (amount <= balance) {
          System.out.println(threadName + " is withdrawing " + amount);
          balance -= amount;
          System.out.println("New balance after " + threadName + "'s withdrawal: " + balance);
      } else {
          System.out.println(threadName + " attempted to withdraw " + amount + " but insufficient balance.");
      }
  }

  public int getBalance() {
      return balance;
  }
}

class WithdrawThread extends Thread {
  private BankAccount account;
  private int amount;

  public WithdrawThread(BankAccount account, int amount, String name) {
      super(name);
      this.account = account;
      this.amount = amount;
  }

  @Override
  public void run() {
      account.withdraw(amount, getName());
  }
}

public class BankingSystem {
  public static void main(String[] args) {
      BankAccount account = new BankAccount(500);

      Thread t1 = new WithdrawThread(account, 200, "Thread-1");
      Thread t2 = new WithdrawThread(account, 300, "Thread-2");
      Thread t3 = new WithdrawThread(account, 100, "Thread-3");

      t1.start();
      t2.start();
      t3.start();
  }
}
