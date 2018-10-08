import javax.swing.*;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        JOptionPane.showMessageDialog(null, bankAccount.toString());
    }
}
