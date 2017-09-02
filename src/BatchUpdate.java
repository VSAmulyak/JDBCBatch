
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"  ,"system","12345");
			Statement st = con.createStatement();
			st.addBatch("insert into newtable values(2,'Pinky',95)");
			st.addBatch("update newtable set sname ='Amulya' where sno=1");
			int[] NoOfRows = st.executeBatch();
			int NoOfEffectedRows = 0;
			for(int i:NoOfRows)
			{
				NoOfEffectedRows+=i;
			}
			  System.out.println("number of effected rows "+ NoOfEffectedRows);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

