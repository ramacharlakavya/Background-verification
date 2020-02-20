package com.capgemini.service;


import com.capgemini.bean.UserBean;
import com.capgemini.dao.UserDAO;

public class UserService 
{

public int addUser(int	empid,String empName,String password,int roleid) 
	{
	if(password.equals("swathi"))
	{
		System.out.println("Authentication is success");
			
	 UserDAO userDAO=new UserDAO();
		UserBean userBean=new UserBean();
		
		userBean.setEmpid(empid);
		
		userBean.setEmpName(empName);
		
		userBean.setPassword(password);
		
		userBean.setRoleid(roleid);
		int updateResult=0;

		 
		try
		{
			updateResult=UserDAO.addUser1(userBean);	
			return updateResult;
		}
		catch(Exception e)
		{
		System.out.println("exeception resolved");	
		}
	}
	else
	{
		System.out.println("Password is incorrect.Please enter the  correct password");
	}
			
		return 0;
	     
		 
		
		

}
}

