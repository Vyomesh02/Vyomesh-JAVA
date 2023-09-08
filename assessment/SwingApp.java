package com.assessment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



class GuiApp implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2,t3,t4,t5;
	JPasswordField p1;
	JButton b1,b2,b3,b4;
	
	public GuiApp()
	{
		frame= new JFrame("Java Swing APP");
		frame.setLayout(new GridLayout(8,2));
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1= new  JLabel("ID         : ");
		l2 = new JLabel("FIRST NAME : ");
		l3 = new JLabel("LAST NAME  : ");
        l4 = new JLabel("EMAIL      : ");
		l5 = new JLabel("MOBILE     : ");
		msg=new JLabel(" ");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(15);
		t5 = new JTextField(15);
		
		
		b1=new JButton("Insert");
		b2= new JButton("Update");
		b3= new JButton("Search");
		b4= new JButton("Delete");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(l4);
		frame.add(t4);
		frame.add(l5);
		frame.add(t5);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String id=t1.getText();
//		String fname=t2.getText();
//		String lname=t3.getText();
//		String email=t4.getText();
//		String mobile=t5.getText();
		if(e.getSource()==b1)
		{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			System.out.println("connection established....");


			Statement st = cn.createStatement();
			String qry = "insert into students values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
			int x=st.executeUpdate(qry);
			if(x>0) 
			{
				msg.setText("User record inserted....");
			}
			else
			{
				msg.setText("User record not inserted...");
			}
			cn.close();
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
	}
		else if(e.getSource()==b2)
		{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				System.out.println("connection established....");

				
				Statement st=cn.createStatement();
				String qry="update students set FIRSTNAME ='"+t2.getText()+"',LASTNAME ='"+t3.getText()+"',EMAIL ='"+t4.getText()+"',MOBILE ='"+t5.getText()+"'where ID ='"+t1.getText()+"' ";
				int x=st.executeUpdate(qry);
				if(x>0) {
					msg.setText("Student record updated....");
				}else {
					msg.setText("Student record not updated...");
				}
				cn.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==b3)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				System.out.println("connection established....");
				Statement st = cn.createStatement();
				String qry = "select * from students where ID='"+t1.getText()+"'";
				ResultSet rs= st.executeQuery(qry);
				while(rs.next())
				{
					System.out.println("Student ID is "+rs.getString(1));
					System.out.println("First Name is "+rs.getString(2));
					System.out.println("Last Name  is "+rs.getString(3));
					System.out.println("Email is      "+rs.getString(4));
					System.out.println("Mobile No is  "+rs.getString(5));

					System.out.println();
				}
				cn.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				System.out.println("connection established....");
				Statement st = cn.createStatement();
				String qry = "delete from students where ID='"+t1.getText()+"'";
				int x=st.executeUpdate(qry);
				if(x>0) {
					msg.setText("Student record deleted...");
				}
				else {
					msg.setText("Student record not deleted..");
				}
				cn.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}

public class SwingApp {

	public static void main(String[] args) {
		new GuiApp();
	}

}
