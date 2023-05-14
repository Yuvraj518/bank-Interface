public class Main {
    public static void main(String[] args) {

        System.out.println("Let's start");
        Bank sbi1=new SBIBank("ashok","1234");
        sbi1.addMoney(500);
        sbi1.withdrawMoney(200);
        sbi1.addMoney(700);
        sbi1.checkBalance();
        System.out.println(sbi1.getROI());

        Bank hdfc1=new HDFCBank("deepak","9876",300);
        hdfc1.withdrawMoney(700);
        hdfc1.addMoney(1199);
        hdfc1.checkBalance();
    }
}