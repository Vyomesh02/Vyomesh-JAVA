package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CustomerModel;
import com.util.DBUtil;

public class CustomerDao {

	Connection cn= null;
	int x=0;
	public int customerRegistration(CustomerModel rmodel) {
		
		cn= new DBUtil().getConnectionData();
		String qry="insert into student(firstname,lastname,gender,mobno,address,email,password) values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getGender());
			st.setString(4, rmodel.getMobno());
			st.setString(5, rmodel.getAddress());
			st.setString(6, rmodel.getEmail());
			st.setString(7, rmodel.getPassword());
		
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
	CustomerModel model=null;
	public CustomerModel doLogin(CustomerModel lmodel)
	{
		
		cn= new DBUtil().getConnectionData();
		String qry="select * from student where email=? and password=?";
		try {
			PreparedStatement st = cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs= st.executeQuery();
			if(rs.next())
			{
				model = new CustomerModel();
				model.setCustomerid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
		        model.setGender(rs.getString(4));
		        model.setMobno(rs.getString(5));
		        model.setAddress(rs.getString(6));
		        model.setEmail(rs.getString(7));
		        model.setPassword(rs.getString(8));
				
		}
			cn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return model;
		
	}
	
}
