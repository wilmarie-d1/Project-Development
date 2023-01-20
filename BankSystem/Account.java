package BankSystem;

import java.util.Date;

public class Account implements Comparable {
//Variables
    static  int nextAcctNo = 10; //class variable
    int accNo;
    String owner;
    City city;
    char gender;
    double balance;
    Date openDate;


    //Constructor

    public Account() {
    }

    public Account(String owner, City city, char gender) {
       accNo = nextAcctNo;
       nextAcctNo += 10;
        this.owner = owner;
        this.city = city;
        this.gender = gender;

        balance = 0.0;
        openDate = null; //System.currentDate();
    }

    public Account(int accNo, String owner, City city, char gender, double balance) {
        this.accNo = accNo;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        this.balance = balance;
        setBalance(balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int compareTo(Object o){
        return  0;
    }
}
