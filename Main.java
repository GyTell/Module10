//Module 10 Glenney Tello 11/14/2022

package database;
//imports necessary to allow commands to work
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Main {

	public static void main(String[] args) throws Exception {
	//Code below generated through the help of the learning materials video
	//https://www.youtube.com/watch?v=KRhv4iPgzHE   &
	//https://www.youtube.com/watch?v=e8g9eNnFpHQ
		getConnection();  
	}

	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/wordoccurrences";	
			String username = "root";
			String password = "SimpleSQL95!";
			Class.forName(driver); 
			
				Connection conn= DriverManager.getConnection(url,username,password);
				System.out.println("Connected");
	Statement statement = conn.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from word");
	while (resultSet.next()) {
	System.out.println(resultSet.getString("word"));
	}
				return conn;
	}catch(Exception e) {System.out.println(e);}
	return null;
	
}	
}
