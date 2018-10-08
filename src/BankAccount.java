public class BankAccount {
    private String accNum;
    private double balance;
    private Person customer;

    public BankAccount(){
        this("3245",5000.0,new Person());
    }
    public BankAccount(String accNum, double balance, Person customer){
        setAccNum(accNum);
        setBalance(balance);
        setCustomer(customer);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public Person getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Account Number: "+accNum+"\nBalance: "+balance+"\nCustomer: "+customer.getPerson();
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }
}
