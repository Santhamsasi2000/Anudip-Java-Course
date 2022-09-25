package Jdpc;
import java .sql.*; //1)import the package

public class Test02  {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3308/using_where";
		String UserName="root";
		String PassWord="Santhamsasi2000";
		String Query="select * from Students";
		Class.forName("com.mysql.jdbc.Driver");//2)b)Register the driver
		Connection con=DriverManager.getConnection(url,UserName,PassWord);   //3)Establish Connector
		Statement st =con.createStatement(); // 4) Create the Statement
		ResultSet rs= st.executeQuery(Query); // 5)Execute the Query
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+ ":" + rs.getInt(2)+ ":" +rs.getInt(3) + rs.getInt(4));
			
		}
		
		
		
		st.close();
		con.close();
		
		
	}

}
