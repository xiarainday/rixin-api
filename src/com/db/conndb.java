package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class conndb {
	private Connection ct=null;
	  
	  public Connection getConn(){
	   try{
		   //1.加载驱动
		   Class.forName("com.mysql.jdbc.Driver");
		   //2.得到链接
		   ct=DriverManager.getConnection("jdbc:mysql://192.168.1.204:3306/lorry_db","root","123456");
	   } catch(Exception e){
		   //一定要写上
		   e.printStackTrace();
		   //TODO:handle exception
	   }
		   return ct;
	  }
}