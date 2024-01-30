package pack_jdbc_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Dbms1 implements ActionListener {

    JFrame jFrame;
    JTextField jTextFieldRoll, jTextFieldName, jTextFieldCourse, jTextFieldFees;
    JLabel jLabelRoll, jLabelName, jLabelCourse, jLabelFees;
    JButton jButtonFirst, jButtonNext, jButtonPrevious, jButtonLast, jButtonClear, jButtonInsert,
            jButtonUpdate, jButtonDelete;
    Font font1, font2;

    Connection con;
    Statement stmt;
    ResultSet rs;


    //region Constructor called
    public Dbms1() {
        //region font
        font1 = new Font("Caliri", Font.BOLD, 18);
        font2 = new Font("Calibri", Font.BOLD, 16);
        //endregion

        //region frame
        jFrame = new JFrame();
        jFrame.setBounds(50, 40, 500, 500);
        jFrame.setTitle("~Welcome to first DBMS prog...");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.getContentPane().setBackground(Color.orange);
        jFrame.setFont(font1);
       // jFrame.setResizable(false);
        //endregion

        //region label
        jLabelRoll = new JLabel();
        jLabelRoll.setBounds(60, 70, 70, 20);
        jLabelRoll.setText("R.No");
        jLabelRoll.setFont(font1);

        jLabelName = new JLabel();
        jLabelName.setBounds(60, 110, 70, 20);
        jLabelName.setText("Name");
        jLabelName.setFont(font1);

        jLabelCourse = new JLabel();
        jLabelCourse.setBounds(60, 150, 70, 20);
        jLabelCourse.setText("Course");
        jLabelCourse.setFont(font1);

        jLabelFees = new JLabel();
        jLabelFees.setBounds(60, 190, 70, 20);
        jLabelFees.setText("Fees");
        jLabelFees.setFont(font1);
        //endregion

        //region TextFields
        jTextFieldRoll = new JTextField();
        jTextFieldRoll.setBounds(135, 70, 270, 25);
        jTextFieldRoll.setForeground(Color.RED);
        jTextFieldRoll.setFont(font1);

        jTextFieldName = new JTextField();
        jTextFieldName.setBounds(135, 110, 270, 25);
        jTextFieldName.setForeground(Color.BLUE);
        jTextFieldName.setFont(font1);

        jTextFieldCourse = new JTextField();
        jTextFieldCourse.setBounds(135, 150, 270, 25);
        jTextFieldCourse.setForeground(Color.RED);
        jTextFieldCourse.setFont(font1);

        jTextFieldFees = new JTextField();
        jTextFieldFees.setBounds(135, 190, 270, 25);
        jTextFieldFees.setForeground(Color.BLUE);
        jTextFieldFees.setFont(font1);
        //endregion

        //region Buttons
        jButtonFirst = new JButton();
        jButtonFirst.setBounds(60, 250, 90, 25);
        jButtonFirst.setText("First");
        jButtonFirst.setFont(font2);

        jButtonNext = new JButton();
        jButtonNext.setBounds(160, 250, 90, 25);
        jButtonNext.setText("Next");
        jButtonNext.setFont(font2);

        jButtonPrevious = new JButton();
        jButtonPrevious.setBounds(260, 250, 90, 25);
        jButtonPrevious.setText("Prev");
        jButtonPrevious.setFont(font2);

        jButtonLast = new JButton();
        jButtonLast.setBounds(360, 250, 90, 25);
        jButtonLast.setText("Last");
        jButtonLast.setFont(font2);

        jButtonClear = new JButton();
        jButtonClear.setBounds(60, 290, 90, 25);
        jButtonClear.setText("Clear");
        jButtonClear.setFont(font2);

        jButtonInsert = new JButton();
        jButtonInsert.setBounds(160, 290, 90, 25);
        jButtonInsert.setText("Insert");
        jButtonInsert.setFont(font2);

        jButtonUpdate = new JButton();
        jButtonUpdate.setBounds(260, 290, 90, 25);
        jButtonUpdate.setText("Update");
        jButtonUpdate.setFont(font2);

        jButtonDelete = new JButton();
        jButtonDelete.setBounds(360, 290, 90, 25);
        jButtonDelete.setText("Delete");
        jButtonDelete.setFont(font2);


        //endregion

        //region adding Components
        jFrame.add(jLabelRoll);
        jFrame.add(jLabelName);
        jFrame.add(jLabelCourse);
        jFrame.add(jLabelFees);

        jFrame.add(jTextFieldRoll);
        jFrame.add(jTextFieldName);
        jFrame.add(jTextFieldCourse);
        jFrame.add(jTextFieldFees);

        jFrame.add(jButtonFirst);
        jFrame.add(jButtonNext);
        jFrame.add(jButtonPrevious);
        jFrame.add(jButtonLast);
        jFrame.add(jButtonClear);
        jFrame.add(jButtonInsert);
        jFrame.add(jButtonUpdate);
        jFrame.add(jButtonDelete);
        //endregion


        jButtonNext.addActionListener(this);
        jButtonUpdate.addActionListener(this);
        jButtonPrevious.addActionListener(this);
        jButtonFirst.addActionListener(this);
        jButtonLast.addActionListener(this);
        jButtonClear.addActionListener(this);
        jButtonInsert.addActionListener(this);
        jButtonDelete.addActionListener(this);

        connectToDB();

    }


    public void connectToDB() {
        try {
            //Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connecting with database
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                    "root", "");

            getData();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getData() {
        try {

            //Creating object of statement class
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            rs = stmt.executeQuery("select * from student ");
            rs.next();
            showData();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void showData() {
        try {
            jTextFieldRoll.setText(rs.getString(1));
            jTextFieldName.setText(rs.getString(2));
            jTextFieldCourse.setText(rs.getString(3));
            jTextFieldFees.setText(rs.getString(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == jButtonNext) {
                nextData();
            } else if (e.getSource() == jButtonPrevious) {
                prevData();
            } else if (e.getSource() == jButtonClear) {
                clearAll();
            } else if (e.getSource() == jButtonInsert) {
                insertData();
            } else if (e.getSource() == jButtonFirst) {
                {
                    firstdata();
                }
            } else if (e.getSource() == jButtonLast) {
                last();
            }
            else if(e.getSource()==jButtonDelete){
                deleteData();
            }
            else if(e.getSource()==jButtonUpdate){
                updatedata();

            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public void insertData() {
        try {
            int rno;
            String name, course;
            float fee;

            rno = Integer.parseInt(jTextFieldRoll.getText());
            name = jTextFieldName.getText();
            course = jTextFieldCourse.getText();
            fee = Float.parseFloat(jTextFieldFees.getText());
            String insqry = "insert into student(rno,name,course,fees) values(" + rno + ",'" + name + "','" + course + "'," + fee + ")";

            //System.out.println(insqry);

            int n = stmt.executeUpdate(insqry);
            if (n > 0) {
                JOptionPane.showMessageDialog(jFrame, "Data Inserted Success");
                getData();
            } else {
                JOptionPane.showMessageDialog(jFrame, "Data Insertion Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void nextData() {
        try {
            if (rs.next() == true) {
                showData();
            } else {
                JOptionPane.showMessageDialog(jFrame, "LAST RECORD");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void firstdata() {
        try {

            if (rs.first() == true) {
                showData();
            } else {
                JOptionPane.showMessageDialog(jFrame, "FIRST RECORD");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void last() {
        try {
            if (rs.last() == true) {
                showData();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void prevData() {
        try {
            if (rs.previous() == true) {
                showData();
            } else {
                JOptionPane.showMessageDialog(jFrame, "LAST RECORD");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            int rno = Integer.parseInt(jTextFieldRoll.getText());
            String deleqry = "delete from student where rno=?";
            PreparedStatement de = con.prepareStatement(deleqry);
            de.setInt(1,rno);

            int f = de.executeUpdate();
            if (f==0){
                JOptionPane.showMessageDialog(jFrame,"delete");
                jTextFieldRoll.setText("");
                jTextFieldName.setText("");
                jTextFieldCourse.setText("");
                jTextFieldFees.setText("");
            }
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }

    public  void updatedata(){
        try{
            int rno;
            String name,course;
            float fee;

            rno = Integer.parseInt(jTextFieldRoll.getText());
            name = jTextFieldName.getText();
            course = jTextFieldCourse.getText();
            fee = Float.parseFloat(jTextFieldFees.getText());
            String updqry = "update student set name=?,fee=? where rno=?";
            PreparedStatement ps = con.prepareStatement(updqry);
            ps.setString(1,name);
            ps.setString(2,course);
            ps.setFloat(3,fee);
            ps.setInt(4,rno);

            int p = ps.executeUpdate();
            if(p>0){
                JOptionPane.showMessageDialog(jFrame,"inserted data");

            }
            else{
                JOptionPane.showMessageDialog(jFrame,"data not inserted");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


        public void clearAll ()
        {
            jTextFieldRoll.setText("");
            jTextFieldName.setText("");
            jTextFieldCourse.setText("");
            jTextFieldFees.setText("");
        }

    public static void main(String[] args) {
        Dbms1 mn = new Dbms1();
    }


        //endregion

    }



