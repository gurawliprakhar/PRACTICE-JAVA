import java.util.Scanner;

class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public Account() {
    }

    public Account(String accName, String accNo, String bankName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
    }

    protected void display() {
        System.out.println("Account Name: " + accName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Bank Name: " + bankName);
    }
}

class CurrentAccount extends Account {
    private String tinNumber;

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        super(accName, accNo, bankName);
        this.tinNumber = tinNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public void display() {
        super.display();
        System.out.println("TIN Number: " + tinNumber);
    }
}

class SavingsAccount extends Account {
    private String orgName;

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        super(accName, accNo, bankName);
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        super.display();
        System.out.println("Organization Name: " + orgName);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account account = null;
        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        System.out.println("Enter the details in comma separated format (Account name, Account number, Bank name)");

        String input = scan.nextLine();
        String[] details = input.split(",");

        if (choice == 1) {
            System.out.println("Enter Organization Name:");
            String orgName = scan.nextLine();
            account = new SavingsAccount(details[0], details[1], details[2], orgName);
        } else if (choice == 2) {
            System.out.println("Enter TIN Number:");
            String tinNumber = scan.nextLine();
            account = new CurrentAccount(details[0], details[1], details[2], tinNumber);
        }

        account.display();
        scan.close();
    }
}
