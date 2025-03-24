/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q3;
import java.util.ArrayList;
/**
 *
 * @author Dawna Dowe
 */
public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions;

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        this.transactions = new ArrayList<>();
    }
    
    
    @Override
    public double deposit(double amount, double balance) {
        double updatedbalance = super.deposit(amount, super.getBalance()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        super.setBalance(updatedbalance);
        transactions.add(new Transaction('D', amount, updatedbalance, "Deposit of " + amount));
        return updatedbalance;
    }

    @Override
    public double withdraw(double amount, double balance) {
        double updatedbalance = super.withdraw(amount, super.getBalance()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        super.setBalance(updatedbalance);
        transactions.add(new Transaction('W', amount, updatedbalance, "Withdrawal of " + amount));
        return updatedbalance;
    }
    
    public void summary(){
        System.out.println("Summary: ");
        System.out.println("Name: " + name);
        System.out.println("Annual Interest Rate: "+ getAnnualInterestRate()+"%");
        System.out.println("Monthly Interest Rate: "+ getMonthlyInterestRate(getAnnualInterestRate())+"%");
        System.out.println("Balance: "+ getBalance());
        for (Transaction t:transactions){
            System.out.println(t);
        }
    }
}
