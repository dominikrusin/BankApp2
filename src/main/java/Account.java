import java.util.Scanner;

public class Account {
    private String name;
    private String surname;
    private String accNumber;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname = surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
        public String getAccNumber(){
                return accNumber;
        }
        public void setAccNumber(String accNumber) {
            this.accNumber = accNumber;
        }
            public long getBalance(){
        return balance;
            }
            public void setBalance (long balance){
        this.balance = balance;
            }
            public void createAccount(){
                System.out.println("Enter your name");
                name = scanner.next();
                System.out.println("Enter your surname");
                surname = scanner.next();
                System.out.println("Enter your account number");
                accNumber = scanner.next();
                System.out.println("Enter your balance");
                balance = scanner.nextLong();
            }

}