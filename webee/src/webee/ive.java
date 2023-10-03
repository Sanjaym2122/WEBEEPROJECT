package webee;
import java.sql.*;
public class ive {
	public static void main (String []args )throws Exception{
	
	getData();
	
}
public static void getData() throws Exception {
	
	String url="jdbc:mysql://localhost:3306/auto";
	String username="root";
	String password="Sanjay_xw5";	
   // String Query="insert into table12 values(?,?,?,?)";
	String Query="select * from colum ";
    Connection con=DriverManager.getConnection(url,username,password);
   // PreparedStatement pst=con.prepareStatement(Query);
    Statement pst =con.createStatement();
    ResultSet rst=pst.executeQuery(Query);
    while (rst.next()) {
    	System.out.println("user id:"+rst.getInt(1));
    	System.out.println("name:"+rst.getString(2));
    	System.out.println("venue:"+rst.getString(3));
    	System.out.println("age:"+rst.getInt(4));
    }
    con.close();
}


}
