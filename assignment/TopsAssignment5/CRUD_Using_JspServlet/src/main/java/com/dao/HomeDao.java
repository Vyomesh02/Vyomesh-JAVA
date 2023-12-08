package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.StudentModel;
import com.util.DBUtil;

public class HomeDao {
	
	Connection cn= null;
	StudentModel model=null;
	public StudentModel verifyUser(int userid)
	{
		cn= new DBUtil().getConnectionData();
		String qry="select * from students where userid=?";
		try {
			PreparedStatement st= cn.prepareStatement(qry);
			st.setInt(1, userid);
			ResultSet rs= st.executeQuery();
			//StudentModel model=new StudentModel();
		if(rs.next())
		{
			//model=new StudentModel();
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
	int x=0;
	public int updateUser(StudentModel homemodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="update students set fname=?,lname=?,email=?,mobile=?,gender=?,password=? where userid=?";
		try {
			PreparedStatement st= cn.prepareStatement(qry);
			st.setString(1, homemodel.getFname());
			st.setString(2, homemodel.getLname());
			st.setString(3, homemodel.getEmail());
			st.setString(4, homemodel.getMobile());
			st.setString(5, homemodel.getGender());
			st.setString(6, homemodel.getUsername());
			st.setString(7, homemodel.getPassword());
			x= st.executeUpdate();
			cn.close();

	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
}
	public int deleteUser(int userid)
	{
		x=0;
		cn=new DBUtil().getConnectionData();
		String qry="delete from students where userid=?";
		try {
			PreparedStatement st= cn.prepareStatement(qry);
			st.setInt(1, userid);
			x= st.executeUpdate();
			cn.close();

	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
}

}
