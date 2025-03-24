/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q3;
import java.util.Date;
/**
 *
 * @author Dawna Dowe
 */
public class Main {
    public static void main(String[] args) {
        
        double annualInterestRate;
        double monthlyInterestRate;
        
        Account acc = new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        monthlyInterestRate = acc.getMonthlyInterestRate(acc.getAnnualInterestRate());
        System.out.println("Monthly interest rate: "+monthlyInterestRate+"%");
        System.out.println("Monthly interest: "+(acc.getMonthlyInterest(monthlyInterestRate)));
        System.out.println("Withdraw 2500 balance: RM"+(acc.withdraw(2500, acc.getBalance())));
        System.out.println("Deposit 3000 balance: RM"+(acc.deposit(3000, acc.getBalance())));
        System.out.println("Date: "+acc.getDateCreated());        
        
        System.out.println("");
        
        Account1 acc1 = new Account1("George",1123,1000);
        acc1.setAnnualInterestRate(1.5);
        monthlyInterestRate = acc1.getMonthlyInterestRate(acc1.getAnnualInterestRate());
        System.out.println("Monthly interest rate: "+monthlyInterestRate+"%");
        System.out.println("Monthly interest: "+(acc1.getMonthlyInterest(monthlyInterestRate)));
        System.out.println("Deposit 30 balance: RM"+(acc1.deposit(30, acc1.getBalance())));
        System.out.println("Deposit 40 balance: RM"+(acc1.deposit(40, acc1.getBalance())));
        System.out.println("Deposit 50 balance: RM"+(acc1.deposit(50, acc1.getBalance())));
        System.out.println("Withdraw 5 balance: RM"+(acc1.withdraw(5, acc1.getBalance())));
        System.out.println("Withdraw 4 balance: RM"+(acc1.withdraw(4, acc1.getBalance())));
        System.out.println("Withdraw 2 balance: RM"+(acc1.withdraw(2, acc1.getBalance())));
        System.out.println("Date: "+acc1.getDateCreated());      
        
        System.out.println("");
        acc1.summary();
    }
   
}
