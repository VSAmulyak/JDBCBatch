import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"system","12345");
		 PreparedStatement pst = con.prepareStatement("insert into newtable values(?,?,?)");
		 pst.setInt(1, 6);
		 pst.setString(2, "sravya");
		 pst.setInt(3,93);
		 pst.executeUpdate();
		 System.out.println("record inserted");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
