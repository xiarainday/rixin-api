package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class conndb {
	private Connection ct=null;
	  
	  public Connection getConn(){
	   try{
		   //1.��������
		   Class.forName("com.mysql.jdbc.Driver");
		   //2.�õ�����
		   ct=DriverManager.getConnection("jdbc:mysql://192.168.1.204:3306/lorry_db","root","123456");
	   } catch(Exception e){
		   //һ��Ҫд��
		   e.printStackTrace();
		   //TODO:handle exception
	   }
		   return ct;
	  }
}