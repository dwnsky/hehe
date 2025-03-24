/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package L1Q3;
import java.util.Date;
/**
 *
 * @author Dawna Dowe
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }
    
    public double getMonthlyInterestRate(double annualInterestRate){
        return (annualInterestRate/12);
    }
   
    public double getMonthlyInterest(double monthlyRate){
        double monthlyInterest = balance * (monthlyRate/100);
        return monthlyInterest;
    }
    
    public double withdraw(double amount, double balance){
        if (balance >= amount){
            balance -= amount;
            setBalance(balance);
        }else{
            System.out.println("Amount more than balance.");
        }
        return balance;
    }
    
    public double deposit(double amount, double balance){
        balance += amount;
        setBalance(balance);
        return balance;
    }
    
}
