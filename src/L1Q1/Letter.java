package L1Q1;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Dawna Dowe
 */
public class Letter {
    public static void main(String[] args) {
        String file="DawnaDowe_23002262.txt";
        reader(file);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Append to letter: ");
        append(file);
        System.out.println("-------------------------------------------------------------------------------------");
        reader(file);
    }
        
    public static void reader(String file){    
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File reading error");
        }
    }
    
    public static void append(String file){
        try (FileWriter writer = new FileWriter(file, true)){
            while (true) {
                    Scanner sc = new Scanner(System.in);
                    String appendLetter = sc.nextLine(); // Read a line of input
                    if (appendLetter.equalsIgnoreCase("exit")) {
                        break; // Stop reading when user types 'exit'
                    }
                    writer.write("\n"+appendLetter);

                }


            System.out.println("Letter appended successfully.");
        }catch(IOException e){
            System.out.println("Problem appending letter.");
        }
    }
}