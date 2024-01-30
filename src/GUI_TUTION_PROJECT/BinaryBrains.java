package GUI_TUTION_PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class BinaryBrains implements ActionListener {
    JFrame jFrameid, jFrameform;

    JTextField jTextFieldid, jTextFieldpassword, jTextFieldname, jTextFieldcollegename, jTextFieldsem,
            jTextFieldbranch, jTextFieldcourse, jTextFieldref, jTextFieldemail, jTextFieldmob;
    JLabel jLabelid, jLabelpass, jLabelname, jLabelcollegename, jLabelsem, jLabelbranch, jLabelcourse,
            jLabelref, jLabelemail, jLabelmob,jLabelimage;
    JButton jButtonok, jButtonsubmit, jButtonclear;



    Connection con;
    Statement stmt;
    ResultSet rs;

    public BinaryBrains()
    {
        //region font
        Font font1 = new Font("Caliri", Font.BOLD, 18);
        Font font2 = new Font("Calibri", Font.BOLD, 16);
        //endregion

        //region frameid
        jFrameid = new JFrame();
        jFrameid.setBounds(50, 40, 500, 500);
        jFrameid.setTitle("Welcomes To Binary Brains ");
        jFrameid.setVisible(true);
        jFrameid.setLayout(null);
        jFrameid.getContentPane().setBackground(Color.orange);
        jFrameid.setFont(font1);
        //endregion

        //region frame-form

        jFrameform = new JFrame();
        jFrameform.setBounds(0, 0, 600, 600);
        jFrameform.setTitle("Welcomes To Binary Brains Enquire Desk");

        jFrameform.setLayout(null);
        jFrameform.getContentPane().setBackground(Color.CYAN);
        jFrameform.setFont(font1);

        jLabelid = new JLabel();
        jLabelid.setBounds(30, 70, 100, 20);
        jLabelid.setText("User-Id");
        jLabelid.setFont(font1);

        jLabelpass = new JLabel();
        jLabelpass.setBounds(30, 110, 100, 20);
        jLabelpass.setText("Password");
        jLabelpass.setFont(font1);

        jLabelname = new JLabel();
        jLabelname.setBounds(30, 30, 100, 20);
        jLabelname.setText("Name");
        jLabelname.setFont(font1);

        jLabelcollegename = new JLabel();
        jLabelcollegename.setBounds(30, 80, 100, 20);
        jLabelcollegename.setText("College Name");
        jLabelcollegename.setFont(font1);


        jLabelsem = new JLabel();
        jLabelsem.setBounds(30, 130, 100, 20);
        jLabelsem.setText("Sem");
        jLabelsem.setFont(font1);


        jLabelbranch = new JLabel();
        jLabelbranch.setBounds(30, 180, 100, 20);
        jLabelbranch.setText("Branch");
        jLabelbranch.setFont(font1);


        jLabelcourse = new JLabel();
        jLabelcourse.setBounds(30, 230, 100, 20);
        jLabelcourse.setText("Course");
        jLabelcourse.setFont(font1);


        jLabelref = new JLabel();
        jLabelref.setBounds(30, 280, 100, 20);
        jLabelref.setText("Reference");
        jLabelref.setFont(font1);


        jLabelmob = new JLabel();
        jLabelmob.setBounds(30, 330, 100, 20);
        jLabelmob.setText("Mob no.");
        jLabelmob.setFont(font1);


        jLabelemail = new JLabel();
        jLabelemail.setBounds(30, 380, 100, 20);
        jLabelemail.setText("Email Id");
        jLabelemail.setFont(font1);


        ImageIcon img = new ImageIcon("bb.png");
        jLabelimage = new JLabel("",img,JLabel.CENTER);
        jLabelimage.setBounds(50, 40, 500, 500);


        //endregion

        //region TextField

        jTextFieldid = new JTextField();
        jTextFieldid.setBounds(135, 70, 270, 25);
        jTextFieldid.setForeground(Color.RED);
        jTextFieldid.setFont(font1);

        jTextFieldpassword = new JTextField();
        jTextFieldpassword.setBounds(135, 110, 270, 25);
        jTextFieldpassword.setForeground(Color.BLUE);
        jTextFieldpassword.setFont(font1);

        jTextFieldname = new JTextField();
        jTextFieldname.setBounds(135, 30, 270, 25);
        jTextFieldname.setForeground(Color.RED);
        jTextFieldname.setFont(font1);

        jTextFieldcollegename = new JTextField();
        jTextFieldcollegename.setBounds(135, 80, 270, 25);
        jTextFieldcollegename.setForeground(Color.BLUE);
        jTextFieldcollegename.setFont(font1);

        jTextFieldsem = new JTextField();
        jTextFieldsem.setBounds(135, 130, 270, 25);
        jTextFieldsem.setForeground(Color.RED);
        jTextFieldsem.setFont(font1);

        jTextFieldbranch = new JTextField();
        jTextFieldbranch.setBounds(135, 180, 270, 25);
        jTextFieldbranch.setForeground(Color.BLUE);
        jTextFieldbranch.setFont(font1);

        jTextFieldcourse = new JTextField();
        jTextFieldcourse.setBounds(135, 230, 270, 25);
        jTextFieldcourse.setForeground(Color.BLUE);
        jTextFieldcourse.setFont(font1);

        jTextFieldref = new JTextField();
        jTextFieldref.setBounds(135, 280, 270, 25);
        jTextFieldref.setForeground(Color.BLUE);
        jTextFieldref.setFont(font1);

        jTextFieldmob = new JTextField();
        jTextFieldmob.setBounds(135, 330, 270, 25);
        jTextFieldmob.setForeground(Color.BLUE);
        jTextFieldmob.setFont(font1);

        jTextFieldemail = new JTextField();
        jTextFieldemail.setBounds(135, 380, 270, 25);
        jTextFieldemail.setForeground(Color.BLUE);
        jTextFieldemail.setFont(font1);

        //endregion TextField

        //region Button

        jButtonsubmit = new JButton();
        jButtonsubmit.setBounds(300, 210, 90, 25);
        jButtonsubmit.setText("Submit");
        jButtonsubmit.setFont(font2);

        jButtonok = new JButton();
        jButtonok.setBounds(300, 430, 90, 25);
        jButtonok.setText("Submit");
        jButtonok.setFont(font2);

        jButtonclear = new JButton();
        jButtonclear.setBounds(150, 430, 90, 25);
        jButtonclear.setText("Clear");
        jButtonclear.setFont(font2);


        //endregion

        //region adding JFrame Components

        jFrameid.add(jLabelid);
        jFrameid.add(jLabelpass);
        jFrameid.add(jTextFieldid);
        jFrameid.add(jTextFieldpassword);
        jFrameid.add(jButtonsubmit);



        //endregion

        //region adding JFrame From Components

        jFrameform.add(jLabelname);
        jFrameform.add(jLabelcollegename);
        jFrameform.add(jLabelsem);
        jFrameform.add(jLabelbranch);
        jFrameform.add(jLabelcourse);
        jFrameform.add(jLabelref);
        jFrameform.add(jLabelmob);
        jFrameform.add(jLabelemail);

        jFrameform.add(jTextFieldname);
        jFrameform.add(jTextFieldcollegename);
        jFrameform.add(jTextFieldsem);
        jFrameform.add(jTextFieldbranch);
        jFrameform.add(jTextFieldcourse);
        jFrameform.add(jTextFieldref);
        jFrameform.add(jTextFieldmob);
        jFrameform.add(jTextFieldemail);
        jFrameform.add(jButtonok);
        jFrameform.add(jButtonclear);


        //endregion

        //region action

        jButtonsubmit.addActionListener(this);
        jButtonok.addActionListener(this);

        //endregion


    }


    //region Connection

    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/binarybrains",
                    "root", "");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //endregion


    //region Password Check

    public void checkid() {
        try {
            connection();
            String str1, str2;
            str1 = (jTextFieldid.getText());
            str2 = (jTextFieldpassword.getText());

            rs = stmt.executeQuery("select * from useridpass where id='" + str1 + "' and pass='" + str2 + "'");

            if (rs.next())
                jFrameform.setVisible(true);

            else
                JOptionPane.showMessageDialog(jFrameid, "no");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //endregion


    //region Data-Insert-Enquiry

    public void insert() {
        try {

            connection();
            double sem;
            long mob;
            String name, clgname, branch, ref, mail, course;


            mob = Long.parseLong(jTextFieldmob.getText());
            name = jTextFieldname.getText();
            course = jTextFieldcourse.getText();
            clgname = jTextFieldcollegename.getText();
            branch = jTextFieldbranch.getText();
            mail = jTextFieldemail.getText();
            ref = jTextFieldref.getText();
            sem = Double.parseDouble(jTextFieldsem.getText());
            String insqry = "insert into enquiry(name,clgname,sem,branch,course,ref,mobile,email) values ('" + name + "','" + clgname + "','" + sem + "','" + branch + "','" + course + "','" + ref + "','" + mob + "','" + mail + "')";


            PreparedStatement p = con.prepareStatement(insqry);
/*
            p.setString(1,name);
            p.setString(2,clgname);
            p.setDouble(3,sem);
            p.setString(4,branch);
            p.setString(5,course);
            p.setDouble(6,mob);
            p.setString(7,mail);

*/
            int n = p.executeUpdate(insqry);
            if (n > 0) {
                JOptionPane.showMessageDialog(jFrameform, "Data Inserted Successfully");
                JOptionPane.showMessageDialog(jFrameform,"Thank You Visit Again");

            } else {
                JOptionPane.showMessageDialog(jFrameid, "Data Insertion Error");
            }
            rs.next();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //endregion


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jButtonsubmit) {

                checkid();
            } else if (e.getSource() == jButtonok) {
                jFrameid.setVisible(false);
                insert();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
