/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dawna Dowe
 */
public class Q22 {
    public static void main(String[] args) {
        String filename = "text2.txt";
        reader(filename);
        System.out.println("");
        remove(filename);
    }
    
    public static void reader (String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error reading file.");
        }
    }
    
    public static void remove (String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            StringBuilder modify = new StringBuilder();
            int totalchar=0;
            while((line = br.readLine())!=null){
                String modified = line.replaceAll("[, ]", "");
                System.out.println(modified);
                
                totalchar += modified.length();
            }
            System.out.println("Total characters: "+totalchar);
        }catch(IOException e){
            System.out.println("Error reading file.");
        }       
    }
}
