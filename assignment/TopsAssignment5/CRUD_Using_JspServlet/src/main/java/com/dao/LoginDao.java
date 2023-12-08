package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.model.StudentModel;
import com.util.DBUtil;

public class LoginDao {

	Connection cn= null;
	StudentModel model=null;
	public StudentModel getLogin(StudentModel lmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from students where username=? and password=?";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getUsername());
			st.setString(2, lmodel.getPassword());
			ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			model=new StudentModel();
			model.setUserid(rs.getInt(1));
			model.setFname(rs.getString(2));
			model.setLname(rs.getString(3));
			model.setEmail(rs.getString(4));
			model.setMobile(rs.getString(5));
			model.setGender(rs.getString(6));
         	model.setUsername(rs.getString(7));
			model.setPassword(rs.getString(8));
		}
		cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
		
	}
	
}
