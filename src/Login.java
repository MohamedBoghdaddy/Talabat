

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.* ;

public class Login extends JFrame
{
    private static String username ;
    private static String password ;
    private static String res = "" ;
    
    JPanel leftpanel = new JPanel() ;
    JPanel rightpanel = new JPanel() ;
    JLabel llogo , llogin , lusername , lpassword , message;
    JButton loginbut= new JButton ();
    JTextField usernameField = new JTextField("        ") ;
    JPasswordField passwordField = new JPasswordField("        ") ;


    // color of left panel
    Color c =new Color(250,69,0); //RGB


    Color clabel  =new Color(51,119,250) ; //RGB
    Color tborder = new Color(255,238,229);  //RGB

    //label for person image ,circle iamge
    JLabel lpersonimage =new JLabel();
    JLabel lcircleimage =new JLabel();
    JLabel leftBG = new JLabel();

    //images path
    ImageIcon login = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Login Butt.PNG");
    ImageIcon person = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Character.PNG");
    ImageIcon circle = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Circle under character.PNG");
    ImageIcon BackgroundLeft = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Right BG.PNG");

    JSeparator sep1 = new JSeparator();
    JSeparator sep2 = new JSeparator();

    public Login()
    {
        llogo = new JLabel("OZLOT");
        llogin = new JLabel("Login");
        lusername = new JLabel("Username");
        lpassword = new JLabel("Password");
        message = new JLabel("");
        this.setTitle("OZLOT");
        this.setSize(1024, 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(380, 150);


        loginbut.setIcon(login);
        loginbut.setBorderPainted(false);
        loginbut.setContentAreaFilled(false);
        loginbut.setBounds(630, 480, 238, 66);

        //Event of login button .. when the user click login button .. it will check if the user already exist or no
        loginbut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
           
        File file = new File("users.txt") ;
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
            
                Boolean validation = false;
                if(customerOrOwner.owner==true)
                {
                    message.setText("");
                    System.out.println("Owner");
                    System.out.println(usernameField.getText());
                    validation = Owner.validate_login(usernameField.getText(),passwordField.getText());

                    if(validation==true)
                    {
                        System.out.println("Login successful!");
                       dispose();
                       Main_owner MainO = new Main_owner();
                       
                    } else
                    {
                        System.out.println("NotFound");
                        message.setText("Login Failed. Username or password invalid");
                    }
                }
                else if(customerOrOwner.owner==false)
                {
                    message.setText("");
                    System.out.println("Customer");
                    System.out.println(usernameField.getText());
                    validation= Customer.validate_login(usernameField.getText(),passwordField.getText());
                    if(validation==true)
                    {
                         System.out.println("Login Successful!");
                        dispose();
                        RestaurantMain res = new RestaurantMain();
                        
                    }
                    else
                    {
                        message.setText("Login Failed.Username or password invalid");
                    }
                }

            }
        });


        //images properties
        lpersonimage.setIcon(person);
        lpersonimage.setBounds(75, 150, 351, 351);


        lcircleimage.setIcon(circle);
        lcircleimage.setBounds(70, 143, 359, 359);

        //words properties

        // properties of right panel , leftapnel
        rightpanel.setLayout(null);
        rightpanel.setBounds(424, 0, 524, 720);
        rightpanel.setBackground(tborder);
        leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 500, 720);
        leftpanel.setBackground(c);
        this.setResizable(false);

        // logo (talabat) properties
        llogo.setBounds(15, 15, 200, 50);
        llogo.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        llogo.setForeground(Color.WHITE);
        llogin.setBounds(690, 80, 450, 100);
        llogin.setFont(new Font("Cairo" , Font.BOLD,50));
        llogin.setForeground(Color.decode("#141E73"));


        message.setBounds(600,550,350,70);
        message.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        message.setForeground(Color.decode("#141E73"));


        lusername.setBounds(575, 225, 450, 50);
        lusername.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        lusername.setForeground(clabel);

        lpassword.setBounds(575, 325, 450, 50);
        lpassword.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        lpassword.setForeground(clabel);





        //text field properties
        usernameField.setBounds(585, 275, 250, 30);
         usernameField.setForeground(Color.gray);
         usernameField.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,15));
         usernameField.setBorder(null);
         usernameField.setBackground(tborder);


         passwordField.setBounds(585, 375, 250, 30);
         passwordField.setForeground(Color.gray);
         passwordField.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,15));
         passwordField.setBorder(null);
         passwordField.setBackground(tborder);


        sep1.setBounds(585, 304, 250, 20);
        sep1.setBorder(null);
        sep1.setBackground(Color.BLACK);

        sep2.setBounds(585, 404, 250, 20);
        sep2.setBorder(null);
        sep2.setBackground(Color.BLACK);



        //add components to left panel
        this.add(leftpanel);
        leftpanel.add(llogo);
        leftpanel.add(lpersonimage);
        leftpanel.add(lcircleimage);

        // add componets to right panel
        this.add(rightpanel);
        rightpanel.add(message);
        rightpanel.add(loginbut);
        rightpanel.add(llogin) ;
        rightpanel.add(lusername);
        rightpanel.add(lpassword);
        rightpanel.add( usernameField);
        rightpanel.add( passwordField);
        rightpanel.add(sep1);
        rightpanel.add(sep2);




    }




}