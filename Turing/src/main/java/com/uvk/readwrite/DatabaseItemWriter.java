package com.uvk.readwrite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.uvk.model.Vendor;
import com.uvk.tokenProcessor.Tokenize;

public class DatabaseItemWriter implements ItemWriter<Vendor>{

	public void write(List<? extends Vendor> vendors) throws Exception {
		
		
		Vendor vendor = vendors.get(0);
		System.out.println("Vendor in writer : "+vendor);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			// protocol://ipaddress:portnumber/databasename
			String url = "jdbc:mysql://localhost:3306/shubhaDB";
			Connection conn = DriverManager.getConnection(url, "root", "");
			Statement stmt = conn.createStatement();
			
			String updateQuery = "UPDATE "+vendor.getTableName() + " SET accountNumber = "+
					Tokenize.tokinize(vendor.getAccountNumber()) + "where " + " accountNumber = " +vendor.getAccountNumber();
			stmt.executeUpdate(updateQuery);
			conn.close();
			
		}catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}


	}

}
