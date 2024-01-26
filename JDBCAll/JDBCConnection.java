package JDBCAll;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection or establishing connection.
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Siva@9866$");
		
		//create     createStatement or prepareStatement.
		//use createStatement for DDL commands.
		//For all Other types use prepareStatement.
		
		Statement st=con.createStatement();
		
		//String createTable="create table Employee(id int,name varchar(20),salary int)";
		String createTable="drop table employee";
		
		
		st.executeUpdate(createTable);
		//executeUpdate is used for all types except Select query.
		
		System.out.println("Table created");
		
		con.close();
		
		
		

	}

}
