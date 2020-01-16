package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
	
	public Statement connetti() {
		try{  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/universita?serverTimezone=UTC","root","ciao1234");  
			Statement stmt=con.createStatement();  
			return stmt;
		} catch(Exception e){
				System.out.println(e);
		}  
		return null;
	} 
}
