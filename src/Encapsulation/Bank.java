package Encapsulation;

class BankAccount {
    private double balance;
    // Write code for parametarized constructor here
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    
    // code for withdraw method here
    public void withdraw(double amountToWithdraw){
        if(amountToWithdraw<=this.balance){
            this.balance-=amountToWithdraw;
        }
    }
    
    // code for deposit method here
    public void deposit(double amountToDeposit){
        this.balance+=amountToDeposit;
    }
    
    // code for checkBalance method here 
    public double checkBalance(){
        return this.balance;
    }
    
}

public class Bank {
    public static void main(String[] args) {
        // complete this object creation statement 
        BankAccount myAccount = new BankAccount(1000.0);
        // write code to deposit 500 in bank account
        myAccount.deposit(300.0);
        myAccount.withdraw(2000.0); // If you had directly deducted the balance instead, it wouldn't have been possible to tackle this problematic behavior 
        
        System.out.println("Current balance: " + myAccount.checkBalance());
    }
}

