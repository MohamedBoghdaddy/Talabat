/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otlob;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Restaurants 
{
    
    public void readmenu()
    {
       
        try {
            FileReader menu = new FileReader("menu1.txt");
            BufferedReader file2 = new BufferedReader(menu);
            String sandName;
            try {
                while ((sandName = file2.readLine()) != null) {
                    System.out.println(sandName);
                }
            } catch (IOException ex) {
                System.out.print(" ");
            }
            try {
                menu.close();
            } catch (IOException ex) {

            }
            System.out.print(" ");
            try {
                file2.close();
            } catch (IOException ex) {
                System.out.print(" ");
            }
        } catch (FileNotFoundException ex) {
            System.out.print("File not found");
        }
        
        try {
            FileReader menu = new FileReader("menu2.txt");
            BufferedReader file2 = new BufferedReader(menu);
            String sandName;
            try {
                while ((sandName = file2.readLine()) != null) {
                    System.out.println(sandName);
                }
            } catch (IOException ex) {
                System.out.print(" ");
            }
            try {
                menu.close();
            } catch (IOException ex) {

            }
            System.out.print(" ");
            try {
                file2.close();
            } catch (IOException ex) {
                System.out.print(" ");
            }
        } catch (FileNotFoundException ex) {
            System.out.print("File not found");
        }
        
        
    }  
}

