package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.UserService;

public class UserUI {
public static void main(String[] args) {
		
	int	empid=0;
	 String empName=" ";
 String password=" ";
 int roleid=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the empid");
		empid=sc.nextInt();
		
		System.out.println("enter the empname");
		empName=sc.next();
		
		System.out.println("enter the password");
		password=sc.next();
		
		System.out.println("enter the roleid");
		roleid=sc.nextInt();
		
		
		
		UserService userService=new UserService();
        int updateCount=userService.addUser(empid,empName,password,roleid);
        System.out.println(updateCount);
		
				

	}

}




