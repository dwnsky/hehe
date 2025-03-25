/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q2;

/**
 *
 * @author Dawna Dowe
 */
public class Person {
 public Person() {
 System.out.println("(1) Performs Person's tasks");
 }
}
class Employee extends Person {
 public Employee() { //no arg constructor
 this("(2) Invoke Employee's overloaded constructor");
 System.out.println("(3) Performs Employee's tasks ");
 }
 public Employee(String s) {
 System.out.println(s); //flexibility overload for constructing instance with accepting a different parameter
 }
}
class Faculty extends Employee {
 public Faculty() {
 System.out.println("(4) Performs Faculty's tasks");
 }
 public static void main(String[] args) {
 new Faculty();
 }
}
