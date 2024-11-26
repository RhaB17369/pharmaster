package connections;

import java.sql.Connection;
import java.sql.DriverManager;


public class conector {
	Connection con;
	public conector(){
		try{
		Class.forName("com.mysql.jdbc.Driver")	;
		con=DriverManager.getConnection("jdbc:mysql://localhost/basepharm","root","");
		System.out.println("connection ?tablie!");
		}
		catch(Exception e){
			System.out.println("erreur de connexion!!");
		}
		
		
	}
	public Connection connect(){
		return con;
	}

}
