import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"system","12345");
				 Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				 ResultSet rs = st.executeQuery("select * from newtable");
				 while(rs.next())
				 {
					 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				 }
				    System.out.println("Last Record");
				    rs.last();
				    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				    System.out.println("first record");
				    rs.first();
				    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				    System.out.println("Absolute Record");
				    rs.absolute(2);
				    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
                catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
	}

}
