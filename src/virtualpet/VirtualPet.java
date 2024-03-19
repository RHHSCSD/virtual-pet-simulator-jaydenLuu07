/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Part 1: Getting Started with Java and Basic I/O
        Scanner keyboard = new Scanner(System.in);
        
        //Splash screen ASCII art
        System.out.println("        __\n   (___()'`;\n   /,    /`\n   \\\\\"--\\\\");
        System.out.println("\nJayden Dogtopia");
        
        //Starting menu
        System.out.println("\n1. Start\n2. Instructions\n3. Exit");
        System.out.print("\nChoose an option (1/2/3): ");
        int option = keyboard.nextInt();
        
        keyboard.close();
    }
    
}
