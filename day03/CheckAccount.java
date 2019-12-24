import java.io.*;

public class CheckAccount{
    private double  balance;
    private int     number;

    public CheckAccount(int number){
        this.number = number;
    }

    public void deposite(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount <= balance){
            balance -= amount;
        }
        else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBanlance() {
        return balance;
    }
    public int getNumber(){
        return number;
    }
}