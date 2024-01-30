package DBMS_PROJECT.LOGIN_FORM.SINGUP_FORM;
import School_DBMS_MINI_PROJECT.Registration_form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class singup implements ActionListener {
    JFrame jFrame;
    JLabel jLabel_first_name,jLabel_last_name,jLabel_user_id,jLabel_password,jLabel_email;
    JTextField jTextField_first_name,jTextField_last_name,jTextField_user_id,jTextField_password,jTextField_email;
    JButton jButton_sign_up;
    public  singup(){
        JFrame jFrame = new JFrame();
        jFrame.setBounds(70, 70, 1014, 550);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        //ImageIcon imageIcon = new ImageIcon("C:\Users\HP\OneDrive\Pictures\Saved Pictures\lion.img.jpg");

        Font font = new Font("Arial",Font.BOLD,50);

//        JLabel jLabel_username = new JLabel();
//        jLabel_username.setText("SignUp Form");
//        jLabel_username.setBounds(100,50,200,20);


        jLabel_first_name = new JLabel();
        jLabel_first_name.setBounds(100,120,300,20);
        jLabel_first_name.setText("First name");
        jLabel_first_name.setFont(font);


        jLabel_last_name = new JLabel();
        jLabel_last_name.setBounds(100,190,300,20);
        jLabel_last_name.setText("Last name");
        jLabel_last_name.setFont(font);

        jLabel_user_id = new JLabel();
        jLabel_user_id.setBounds(100,260,300,20);
        jLabel_user_id.setText("User Id");
        jLabel_user_id.setFont(font);


        jLabel_password= new JLabel();
        jLabel_password.setBounds(100,330,300,20);
        jLabel_password.setText("Password");
        jLabel_password.setFont(font);

        jLabel_email = new JLabel();
        jLabel_email.setBounds(100,400,300,20);
        jLabel_email.setText("Conform Password");
        jLabel_email.setFont(font);


        jTextField_first_name = new JTextField();
        jTextField_first_name.setBounds(300,120,200,30);
        jTextField_first_name.setFont(font);

        jTextField_last_name = new JTextField();
        jTextField_last_name.setBounds(300,180,200,30);
        jTextField_last_name.setFont(font);

        jTextField_user_id = new JTextField();
        jTextField_user_id.setBounds(300,250,200,30);
        jTextField_user_id.setFont(font);

        jTextField_password = new JTextField();
        jTextField_password.setBounds(300,320,200,30);
        jTextField_password.setFont(font);

        jTextField_email = new JTextField();
        jTextField_email.setBounds(300,390,200,30);
        jTextField_email.setFont(font);


        jButton_sign_up = new JButton();
        jButton_sign_up.setBounds(280,460,200,50);
        jButton_sign_up.setBackground(Color.green);
        jButton_sign_up.setText("Signup");







       // jFrame.add(jLabel_username);
        jFrame.add(jLabel_first_name);
        jFrame.add(jLabel_last_name);
        jFrame.add(jLabel_user_id);
        jFrame.add(jLabel_password);
        jFrame.add(jTextField_first_name);
        jFrame.add(jTextField_last_name);
        jFrame.add(jTextField_user_id);
        jFrame.add(jTextField_password);
        jFrame.add(jTextField_email);
     //   jLabel_username.setFont(font);
        jFrame.add(jButton_sign_up);

        jFrame.add(jLabel_email);
        jButton_sign_up.addActionListener(this);
    }

    public static void main(String[] args) {
        Swing_gui.myfirst_gui.myfirst_frame ms = new Swing_gui.myfirst_gui.myfirst_frame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            // load a driver class from the java
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connecting with database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/signupform?useTimezone=true&serverTimezone=UTC",
                    "root", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery("select * from signup ");
            rs.next();
            try{
                String fistname = jTextField_first_name.getText();
                if(fistname.equals("")){
                    JOptionPane.showMessageDialog(null,"please fill the name");
                }
            }catch (Exception ex){
                System.out.println("invalid");
            }

            String fistname = jTextField_first_name.getText();
            String lastname = jTextField_last_name.getText();
            String user = jTextField_user_id.getText();
            String password = jTextField_password.getText();
            String email = jTextField_email.getText();
            PreparedStatement ps = con.prepareStatement("insert into signup(firstname ,lastname,userid,password,email) values(?,?,?,?,?)");
            ps.setString(1,fistname);
            ps.setString(2,lastname);
            ps.setString(3,user);
            ps.setString(4,password);
            ps.setString(5,email);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"data added");
            Registration_form op = new Registration_form();

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}

