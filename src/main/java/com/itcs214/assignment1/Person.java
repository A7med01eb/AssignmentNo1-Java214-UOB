
package com.itcs214.assignment1;
public class Person {
    
    //Question A
    private String firstName , lastName , mobile;
    private char gender;
    private long cpr;
    
    //Question A Part i
    public Person(String firstName, String lastName, String mobile, char gender, long cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.gender = gender;
        this.cpr = cpr;
    }

    //Question A Part ii
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getGender() {
        if(gender == 'm' || gender == 'M'){
            return "Male";
        }
        else if(gender == 'f' || gender == 'F'){
            return "Female";
        }
        else{
            return "";
        }
    }

    public long getCpr() {
        return cpr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCpr(long cpr) {
        this.cpr = cpr;
    }
    
    //Question A Part iii
    public String toString(){
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nGender: " + getGender() + 
               "\nCPR: " + this.cpr + "\nMobile: " + this.mobile +"\n_________________________";
    }
}
