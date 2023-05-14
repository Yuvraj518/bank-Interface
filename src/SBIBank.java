import java.util.UUID;

public class SBIBank implements Bank{
    private String name;
    private int balance;
    private String accountNumber;
    private String password;
    private int roi=5;    // each bank have their default roi

    public SBIBank(String name, String password) {
        this.name = name;
        this.password = password;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }
    public SBIBank(String name,String password,int balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }


    @Override
    public int checkBalance() {
        System.out.println("Account "+this.accountNumber+" balance: "+this.balance);
        return this.balance;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(money>=this.balance){
            this.balance-=money;
            return true;
        }
        System.out.println("Insufficient Balance");
        return false;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int loanAmount, int timeInYears) {
        return loanAmount*this.roi*timeInYears/100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getRoi() {
        return roi;
    }
}
