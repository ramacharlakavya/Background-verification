package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.capgemini.bean.UserBean;

public class UserDAO {
	public static int addUser1(UserBean userBean) {
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
			con=UserDB.getConnection();
			pst=con.prepareStatement("insert into login values(?,?,?,?)");
			pst.setInt(1,userBean.getEmpid());
			pst.setString(2,userBean.getEmpName());
			pst.setString(3,userBean.getPassword());
			pst.setInt(4,userBean.getRoleid());
			
			
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}

		
	}


