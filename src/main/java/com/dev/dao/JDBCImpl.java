package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dev.beans.UserInfo;



public class JDBCImpl implements UserInfoDAO{

	@Override
	public boolean CreateProfile(UserInfo user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			/*File file = new File("C:\\Users\\Suyash\\Desktop\\ss.properties.txt");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);*/
			System.out.println("okay");	
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("okay1");
			String dburl = "jdbc:mysql://localhost:3306/xforce_db?user=root&password=manoj";
			con = DriverManager.getConnection(dburl);
			System.out.println("connected");
			
			String query  = "insert into user_info values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, user.getUser_id());
			pstmt.setString(2,user.getFirstname());
			pstmt.setString(3, user.getLastname());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5,user.getPassword());
			
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			}
			else
			{
                return false;
			}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try 
	    	 {
	    	  if(con!=null) {
	    		  con.close();
	    	  }
	    	  if(pstmt!=null) {
	    		  pstmt.close();
	    	  }
	    	
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
		return false;
	}

	@Override
	public UserInfo SearchStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdatePassword(int id, String Opassword, String npass, String npass2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUser(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/*public boolean CreateProfile(UserInfoDAO user) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			File file = new File("C:\\Users\\Suyash\\Desktop\\ss.properties.txt");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
				
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost:3306/xforce";
			con = DriverManager.getConnection(dburl,prop);
			System.out.println("connected");
			
			String query  = "insert into user_info values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, user.getUser_id());
			pstmt.setString(2,user.getFirstname());
			pstmt.setString(3, user.getLastname());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5,user.getPassword());
			
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			}
			else
			{
                return false;
			}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try 
	    	 {
	    	  if(con!=null) {
	    		  con.close();
	    	  }
	    	  if(pstmt!=null) {
	    		  pstmt.close();
	    	  }
	    	
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
		return false;
	}
			
	

	@Override
	public UserInfo SearchStudent(int id) {
		
		Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UserInfo us = new UserInfo();
        try {
        	
        	File file = new File("C:\\Users\\Suyash\\Desktop\\ss.properties.txt");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
        Class.forName("com.mysql.jdbc.Driver");
        
        String dburl = "jdbc:mysql://localhost:3306/xforce";
        con = DriverManager.getConnection(dburl,prop);
        
        String query = "select regno,firstname,lastname,email from user_info "
        		+ " where regno=?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1,id);
        rs = pstmt.executeQuery(); 
       
        if(rs.next()) {
			int regno1 = rs.getInt("regno");
			String firstname = rs.getString("firstname");
			String lastname = rs.getString("lastname");
			String email = rs.getString("email");

			us.setUser_id(regno1);
			us.setFirstname(lastname);
			us.setLastname(lastname);
			us.setEmail(email);
        }}
        catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			 try 
	    	 {
	    	  if(con!=null) {
	    		  con.close();
	    	  }
	    	  if(pstmt!=null) {
	    		  pstmt.close();
	    	  }
	    	
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
		return us;
		
		
		
			
	}

	@Override
	public boolean UpdatePassword(int regno,String pass, String pass1, String pass2 ) {
		
		
		if(pass1.equals(pass2)) {
			
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			File file = new File("C:\\Users\\Suyash\\Desktop\\ss.properties.txt");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
		Class.forName("com.mysql.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/xforce";
		con = DriverManager.getConnection(dburl,prop);
		
		String query = "update user_info set password=? where regno=? and password=?";
		pstmt = con.prepareStatement(query);
		pstmt.setString(1,pass1);
		pstmt.setInt(2,regno);
		pstmt.setString(3,pass);
		
		int count = pstmt.executeUpdate();
		
		if(count>0)
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("unsuccessfull");
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			 try 
	    	 {
	    	  if(con!=null) {
	    		  con.close();
	    	  }
	    	  if(pstmt!=null) {
	    		  pstmt.close();
	    	  }
	    	
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
		}
		
		
		
		else {
			System.out.println("password mismatch");
			
		}
		
		
		
		return false;
	}

	@Override
	public boolean DeleteUser(int id, String password) {
		
		Connection con = null;
	     PreparedStatement pstmt = null;
	     
	     try {
	    	File file = new File("C:\\Users\\Suyash\\Desktop\\ss.properties.txt");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
	    	 Class.forName("com.mysql.jdbc.Driver");
				
			 String dburl = "jdbc:mysql://localhost:3306/xforce";
			 con = DriverManager.getConnection(dburl,prop);
			
			 String query = "Delete from user_info where regno=? and password=?";
			 pstmt = con.prepareStatement(query);
			 pstmt.setInt(1,id);
			 pstmt.setString(2,password);
			 
			 int count = pstmt.executeUpdate();
			 
			 if(count>0)
			 {
				 System.out.println("successfull");
			 }
			 else {
				 System.out.println("unsuccessfull");
			 }
			 
				
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }finally {
	    	 try 
	    	 {
	    	  if(con!=null) {
	    		  con.close();
	    	  }
	    	  if(pstmt!=null) {
	    		  pstmt.close();
	    	  }
	    	
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
		
		return false;
	}
	public String toString()
	{
	return "JDBC";	
	}
*/
}
