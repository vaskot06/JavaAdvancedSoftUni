public class BankAccount {
    private static int idCounter = 0;
    private static final double RATE_DEFAULT_VALUE = 0.02d;

    private int id;
    private double balance;
    private static double interestRate;

    public BankAccount(){
        this.id = idCounter++;
    }


    public int getId(){
        return idCounter;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterest (int years){
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
}
