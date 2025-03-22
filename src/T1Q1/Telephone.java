/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q1;

/**
 *
 * @author Dawna Dowe
 */
public class Telephone {
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getNumberOfTelephoneObject() {
        return numberOfTelephoneObject;
    }

    public static void setNumberOfTelephoneObject(int numberOfTelephoneObject) {
        Telephone.numberOfTelephoneObject = numberOfTelephoneObject;
    }
    
    
    
    public String makeFullNumber (){
        return areaCode+"-"+number;
    }   
}
