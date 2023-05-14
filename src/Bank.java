public interface Bank {
    int checkBalance();
    Boolean addMoney(int money);
    Boolean withdrawMoney(int money);
    int getROI();     // Rate of Interest
    int totalInterest(int loanAmount,int timeInYears);
}
