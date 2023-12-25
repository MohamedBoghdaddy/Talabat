/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otlob;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OTLOB 
{

   
    public static void main(String[] args) {
      

        int choice;
        String type; 
        Login signin = new Login();
        Register signup = new Register();
        Restaurants a1 = new Restaurants();
        Admin a2 = new Admin();
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.print ("\t\t\t__________________\n\n");
	System.out.print ( "\t\t\t             welcome to the login page           \n\n");
	System.out.print ( "\t\t\t_____           Menu          _____\n\n");
         System.out.println ( "\t\t\t\t| Admin or User  |");
        System.out.println ( "\t\t\t\t| press 1 to Register   |");
	System.out.println ( "\t\t\t\t| press 2 to LOGIN      |" );
	System.out.print ( "\t please enter your choice : ");
        type = y.nextLine();
        choice=x.nextInt();
        
       while(y == "Admin")
       {
           
           
       }
        
        
        
        
        
//        switch(type)
//        {
//            case "Admin":
//            {
//                 signin.Login();
//             
//                  
//                
//            }
//            case "User":
//            {
//               
//                    signup.Register();
//                 
//              
//            }
            
//            case 3:
//            {
//                a3.addEmployee();
//            }
//            case 4:
//            {
//                a3.deleteEmployee();
//            }

        }   
    }
    
 }
    

