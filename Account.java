
public class Account {
    private int account_no;
    String holder_name;
    private double balance;

    public Account(int account_no, String holder_name, double balance) {
        this.holder_name = holder_name;
        this.account_no = account_no;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("\n------------------------------------");
        System.out.println("Account Holder name : " + holder_name);
        System.out.println("Account no : " + account_no);
        System.out.println("Account balance : " + balance);
        System.out.println("------------------------------------\n");

    }

    double depositMoney(double money) {
        if (money <= 0) {
            System.out.println(money + " shoud be greater than zero rupees");
            return balance;
        }
        balance = balance + money;
        System.out.println(
                "deposit successful , amout " + money + " credited to your  current account \n your balance is :");
        return balance;
    }

    double withdrawMoney(double money) {
        if (money > balance) {
            System.out.println("Insufficient baance");
            return balance;
        } else {
            balance = balance - money;
            System.out.println("Widhdraw successful , amout " + money + " debited from current account  \n" + //
                    "your balance is : " + balance);
            return balance;
        }

    }

    public int getNumber() {
        return account_no;

    }

    public double getBalance() {
        return balance;
    }

}
