package com.itcs214.assignment1;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        //Check - Question A Part i 
        Person firstPerson =  new Person("Ahmed" , "Ebrahim" , "36427000" , 'm' , 210472010);
        
        //Check - Question B Part i
        Savingsccount firstPersonSavingsccount = new Savingsccount(firstPerson, 20197531, 334.895, 4.8);
        
        //Check All Set Methods
        System.out.println("You Will Show All Sets Method After Finishing Programme");
        
        //Create Small System To Check All Methods It's Working Or Not 
        System.out.println("Welcome to IT Bank");
        while(true){
        System.out.println("Which Service you want?");
        System.out.println("1 for Update Balance \n2 for Cash Withdrawal \n3 for Deposit \n4 for Print All Information \n5 for Check All Set Methos It's Working or Not \n6 for Exit");
        int p1 = kbd.nextInt();
        if(p1==1){
            System.out.println("How much do you want to update your balance? ");
            double UpdateBalance = kbd.nextDouble();
            
            //Check - Question C Part iii  
            firstPersonSavingsccount.updateBalance(UpdateBalance);
            
            System.out.println("Do you want print your balance?");
            System.out.println("1 for Yes\n2 for No");
            int p1f1 = kbd.nextInt();
            if(p1f1==1){
                
                //Check Print Method (toString() Method)
                System.out.println(firstPersonSavingsccount.toString());
            }
            
            System.out.println("Do you want other service?");
            System.out.println("1 for Yes\n2 for No");
            int p1f2 = kbd.nextInt(); 
            if(p1f2==1){
                continue;
            }
            else if(p1f2==2){
                break;
            }
        }
        else if(p1==2){
            System.out.println("How much do you want to cash withdrawal from your balance? ");
            double withdrawal = kbd.nextDouble();
            
            //Check - Question C Part iv
            firstPersonSavingsccount.withdraw(withdrawal);
            
            System.out.println("Do you want print your balance?");
            System.out.println("1 for Yes\n2 for No");
            int p1f1 = kbd.nextInt();
            if(p1f1==1){
                System.out.println(firstPersonSavingsccount.toString());
            }
            System.out.println("Do you want other service?");
            System.out.println("1 for Yes\n2 for No");
            int p1f2 = kbd.nextInt(); 
            if(p1f2==1){
                continue;
            }
            else if(p1f2==2){
                break;
            }
        }
        else if(p1==3){
            System.out.println("How much do you want to deposit to your balance? ");
            double Deposit = kbd.nextDouble();
            
            //Check - Question C Part v
            firstPersonSavingsccount.deposit(Deposit);
            
            System.out.println("Do you want print your balance?");
            System.out.println("1 for Yes\n2 for No");
            int p1f1 = kbd.nextInt();
            if(p1f1==1){
                System.out.println(firstPersonSavingsccount.toString());
            }
            System.out.println("Do you want other service?");
            System.out.println("1 for Yes\n2 for No");
            int p1f2 = kbd.nextInt(); 
            if(p1f2==1){
                continue;
            }
            else if(p1f2==2){
                break;
            }
        }
        else if(p1==4){
            System.out.println(firstPersonSavingsccount.toString());
            
            System.out.println("Do you want other service?");
            System.out.println("1 for Yes\n2 for No");
            int p1f2 = kbd.nextInt(); 
            if(p1f2==1){
                continue;
            }
            else if(p1f2==2){
                break;
            }
            
        }
        else if(p1==5){
            //Check All Set Methods
            firstPerson.setFirstName("Ali");
            firstPerson.setLastName("Ebrahim");
            firstPerson.setMobile("36664428");
            firstPerson.setGender('m');
            firstPerson.setCpr(200300400);
            firstPersonSavingsccount.setAccountHolder(firstPerson);
            firstPersonSavingsccount.setAccountNum(20197531);
            firstPersonSavingsccount.setBalance(36587.369);
            firstPersonSavingsccount.setInterestRate(3.6);
            System.out.println(firstPersonSavingsccount.toString());
            
            System.out.println("Do you want other service?");
            System.out.println("1 for Yes\n2 for No");
            int p1f2 = kbd.nextInt(); 
            if(p1f2==1){
                continue;
            }
            else if(p1f2==2){
                break;
            }
        }
        else if(p1==6){
            break;
        }
        else{
            System.out.println("Error!");
        }
        }
        System.out.println("Thank you for using IT Bank");
        
        
    }
}


