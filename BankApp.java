import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Boolean app = true;

        while (app) {
            System.out.println("Smart ATM\n");
            System.out.println("-------------------------");

            System.out.println("1. Create Account ");
            System.out.println("2. Check Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.println("--------------------------\n");

            System.out.println("Enter the option you want to perform : ");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter a account holder name : ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.println("Enter a account number : ");
                    int no = scan.nextInt();
                    System.out.println("Enter your preference basic balance : ");
                    double balance = scan.nextDouble();
                    accounts.add(new Account(no, name, balance));
                    System.out.println("Account Creation Completed \n");

                    break;
                case 2:
                    if (accounts.size() <= 0) {
                        System.out.println("kindly create a account , choose option 1 \n");
                        break;
                    }

                    for (Account element : accounts) {
                        element.displayDetails();
                    }
                    break;
                case 3:
                    if (accounts.size() <= 0) {
                        System.out.println("kindly create a account , choose option 1 \n");
                        break;
                    }

                    for (Account element : accounts) {
                        System.out.println("Enter your account no:");
                        int num = scan.nextInt();
                        Account selected = null;

                        if (element.getNumber() == num) {
                            selected = element;
                        } else {
                            System.out.println("Please check your account number");
                        }

                        if (selected != null) {
                            System.out.println("Enter the amount you want to deposit :");
                            double money = scan.nextDouble();
                            element.depositMoney(money);
                        } else {
                            System.out.println("Account not found");
                        }
                    }
                    break;
                case 4:
                    if (accounts.size() <= 0) {
                        System.out.println("\nkindly create a account , choose option 1 \n");
                        break;
                    }
                    for (Account element : accounts) {
                        System.out.println("Enter your account no:");
                        int num = scan.nextInt();
                        Account selected = null;

                        if (element.getNumber() == num) {
                            selected = element;
                        } else {
                            System.out.println("Please check your account number");
                        }

                        if (selected != null) {
                            System.out.println("Enter the amount you want to debit :");
                            double money = scan.nextDouble();
                            element.withdrawMoney(money);
                        } else {
                            System.out.println("Account not found");
                        }
                    }
                    break;
                case 5:
                    System.out.println(" Exiting from Application ");
                    app = false;
                    break;

                default:
                    System.out.println("Enter a valid options");
                    break;
            }

        }

    }
}