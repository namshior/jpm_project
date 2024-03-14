package com.tnsif.jdbcprogram;
import java.sql.*;
import javax.sql.*;    //step 1 import pakages

import com.mysql.cj.protocol.Resultset;

public class JdbcSelect {
	
	public static void main(String[] args) {
		
		
		//step 2:load and register the driver (or) we can go for direct establish coonection
		
		//step 3:establish the connection
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","karg_123a");
			
			
		//step 4: create statement
			
		Statement st=conn.createStatement();
		
		
		//step 5: Exceute query
		
		String strselect="select booktitle,price,qty from books";
		System.out.println("the sql statement is :"+strselect);
		
		//process the result to display
		
		ResultSet rst=st.executeQuery(strselect);
		System.out.println("the records are");
		
		int rowcount=0;
		while(rst.next()) {
			String booktitle=rst.getString("booktitle");
			int price=rst.getInt("price");
			int qty=rst.getInt("qty");
			
			System.out.println(booktitle+" "+price+" "+qty);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
