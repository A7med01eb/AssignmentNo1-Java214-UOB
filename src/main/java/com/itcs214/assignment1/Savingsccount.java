package com.itcs214.assignment1;
public class Savingsccount extends Account{
    //Question C
    private double interestRate;
    
    //Question C Part i
    public Savingsccount(Person accountHolder, long accountNum, double balance, double intersetRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = intersetRate;
    }

    //Question C Part ii
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    //Question C Part iii
    @Override
    public void updateBalance(double newBalance) {
        super.setBalance(newBalance);
    }

    //Question C Part iv
    @Override
    public void withdraw(double withdraw) {
        if(super.getBalance() < withdraw){
            System.out.println("Error: You don't have enough balance to withdraw it.");
        }
        else{
            super.setBalance(super.getBalance() - withdraw);
        }
    }

    //Question C Part v
    @Override
    public void deposit(double deposit) {
        super.setBalance(super.getBalance()+ deposit);
    }
    
    //Question C Part vi
    @Override
    public String toString(){
        return super.toString() + "\nInterest Rate: " + getInterestRate();
    }
    
}
