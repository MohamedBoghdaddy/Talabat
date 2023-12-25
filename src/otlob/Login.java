/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otlob;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Login extends User
{
    
    public void userlogin() throws IOException 
    {
        ArrayList<String> userlogin = new ArrayList();
        User u1 = new User();
        Scanner in = new Scanner(System.in);
        String tempuser;
        String temppass;
        System.out.println("enter your username");
        tempuser = in.nextLine();
        System.out.println("enter your password");
        temppass = in.nextLine();

        try {
            FileReader user = new FileReader("userdata.txt");
            
            BufferedReader file = new BufferedReader(user);
            String line;
            while ((line = file.readLine()) != null) {
                userlogin.add(line);
            }
            file.close();
            user.close();
        } catch (IOException ex) {
            System.out.println("file not found");
        }
        for (int i = 0; i < userlogin.size(); i++) {
            if (userlogin.get(i).equals(tempuser) && userlogin.get(i + 1).equals(temppass)) {
                System.out.println("welcome");
                return;
            }
        }
        System.out.println("erorr");

    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
