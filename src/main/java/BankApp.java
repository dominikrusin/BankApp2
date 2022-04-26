import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in our bank");
        Account account = new Account();
        account.createAccount();


        int choice;
        do {
            System.out.println("1. Display account details");
            System.out.println("2. Deposite money");
            System.out.println("3. Withdrawal money");
            System.out.println("4. Exit app");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.depositeMoney();
                    break;
                case 3:
                    account.withdrawal();
                    break;
                case 4:
                    System.out.println("By by");
                    break;

            }
        }
        while (choice != 4);


    }
}
