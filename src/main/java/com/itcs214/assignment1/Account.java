package com.itcs214.assignment1;
public abstract class Account {
    
    //Question B
    private Person accountHolder;
    private long accountNum;
    private double balance;
    
    //Question B Part i
    public Account(Person accountHolder, long accountNum, double balance) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    //Question B Part ii
    public Person getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }
    
    //Question B Part iii
    public abstract void updateBalance(double newBalance);
    
    //Question B Part iv
    public abstract void withdraw(double withdraw);
    
    //Question B Part v
    public abstract void deposit(double deposit);
    
    //Question B Part vi
    @Override
    public String toString(){
        return super.toString() + "\nAccount Holder: " + this.accountHolder + "\nAccount Number: " +  this.accountNum 
                                + "\nBalance: " + this.balance +"BD\n_________________________"; 
    }
}
