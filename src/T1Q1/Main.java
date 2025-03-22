/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q1;

/**
 *
 * @author Dawna Dowe
 */
public class Main {
    public static void main(String[] args) {
        Telephone[] telephones = new Telephone[5];
        
        String areaCode = "03";
        int number = 79676300;
        
        for (int i=0; i<telephones.length; i++){
            telephones[i] = new Telephone (areaCode, number+i);
        }
        
        for (Telephone t :telephones){
            System.out.println(t.makeFullNumber());
        }
        
        System.out.println("Number of telephone objects: "+ Telephone.getNumberOfTelephoneObject());
    }
}
