/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otlob;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moham
 */
public class Register extends User
{
     public void register() throws IOException
     {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        User u1 = new User();
        System.out.println("please enter your username");
        u1.username = in.next();
        System.out.println("please enter your password");
        u1.password = in.next();
        list.add(u1.username);
        list.add(u1.password);
        for (int i = 0; i < list.size(); i++) {
            try {
                FileWriter info = new FileWriter("userdata.txt", true);
                PrintWriter data = new PrintWriter(info);
                data.println(list.get(i));
                data.close();
                info.close();
            } catch (IOException e) {
                System.out.println("file not found");

            }

        }
    }
}
