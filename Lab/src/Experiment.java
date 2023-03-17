import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Experiment
{
    public static void StudentInfo(){
        JFrame f = new JFrame("Student Details Form");
        JLabel l1, l2, l3, l4;
        JTextField t1, t2, t3, t4;
        JButton b1, b2;

        //creating labels and setting bounds
        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Email ID:");
        l2.setBounds(50, 120, 120, 30);
        l3 = new JLabel("Reg No:");
        l3.setBounds(420, 120, 50, 30);
        l4 = new JLabel("Contact Number:");
        l4.setBounds(370, 50, 100, 30);


        // Creating the textfields and
        // setting the bounds for textfields
        t1 = new JTextField();
        t1.setBounds(150, 50, 130, 30); //name text field
        t2 = new JTextField();
        t2.setBounds(150, 120, 230, 30); //email text field
        t3 = new JTextField();
        t3.setBounds(490, 120, 130, 30); // RegNo text field
        t4 = new JTextField();
        t4.setBounds(490, 50, 130, 30); // Contact text field

        //creating one button for saving
        //and one for reseting
        b1 = new JButton("Save");
        b1.setBounds(200, 300, 70, 30);
        b2 = new JButton("Clear");
        b2.setBounds(400, 300, 70, 30);

        //adding action listener
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting text from text fields
                //and copyinig it to strings
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = t3.getText();
                String s4 = t4.getText();
                if(e.getSource() == b1){
                    try{
                        //creating text file
                        //and saving data into the file
                        FileWriter w = new FileWriter("Student_info.txt", true);
                        w.write(s1+"\n");
                        w.write(s2+"\n");
                        w.write(s3+"\n");
                        w.write(s4+"\n");
                        w.close();
                    }
                    catch(Exception ae){
                        System.out.println(ae);
                    }
                }

                //popup to show information is saved
                JOptionPane.showMessageDialog(f, "Succesfuly saved");
            }
        });

        //action listener for 2nd button
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

        //adding default option
        //to close window
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        //ading created objects to frame
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setSize(700, 600);
        f.setVisible(true);
    }

    //driver code
    public static void main(String[] args){
        StudentInfo();
    }

}