import java.io.*;

public class BankDemo{
    public static void main(String []args){
        CheckAccount c = new CheckAccount(101);
        System.out.println("depositing $500...");
        c.deposite(500.00);
        try{
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        }catch(InsufficientFundsException e){
            System.out.println("sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}