package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.StudentModel;
import com.util.DBUtil;

public class RegistrationDao {
	public int doRegistration(StudentModel smodel) {
	int x=0;
	Connection cn=null;
	try {
	  cn=new DBUtil().getConnectionData();
	  String qry="insert into students(fname,lname,email,mobile,gender,username,password) values(?,?,?,?,?,?,?)";
	  PreparedStatement st=cn.prepareStatement(qry);
	  
	  st.setString(1,smodel.getFname());
	  st.setString(2,smodel.getLname());
	  st.setString(3,smodel.getEmail());
	  st.setString(4,smodel.getMobile());
	  st.setString(5,smodel.getGender());
	  st.setString(6, smodel.getUsername());
	  st.setString(7,smodel.getPassword());
	  x=st.executeUpdate();
      cn.close();
        } 
	   catch(Exception e) {
		e.printStackTrace();
	}
	  return x;
   }
	
}
