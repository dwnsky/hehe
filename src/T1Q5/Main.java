/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q5;

/**
 *
 * @author Dawna Dowe
 */
public class Main {
    public static void main(String[] args) {
        BankAccount Ali = new BankAccount(1000);
        
        System.out.println("Balance: "+ Ali.balance);
        System.out.println("Balance after deposit: " + Ali.deposit(500));
        System.out.println("Withdraw less than balance: "+ Ali.withdraw(200));
        System.out.println("Balance: "+ Ali.balance);
        System.out.println("Withdraw more than balance: "+ Ali.withdraw(10000));
        System.out.println("Balance: "+ Ali.balance);
        
    }
}
