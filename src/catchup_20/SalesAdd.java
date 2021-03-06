package catchup_20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalesAdd {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.108:3306/sales", "root", "123456");
			//conn.setAutoCommit(false);
			//stmt = conn.createStatement();
			PreparedStatement preparedStat = conn.prepareStatement("insert into product_tbl values(null, ?, ?, ?, ?, ?)");

			preparedStat.setString(1, "Lining");
			preparedStat.setDouble(2, 89.00);
			Date date = new Date(120, 2, 15);
			preparedStat.setDate(3, date);
			preparedStat.setString(4, "HangZhou");
			preparedStat.setInt(5, 3);
			
			// turn off auto commit
			//stmt.execute("SET autocommit=0;"); 
			//int add_rows = stmt.executeUpdate("insert into product_tbl values(null, '361du', 99.99, '2012-01-02', 'ShenYang', 3);");
			int add_rows = preparedStat.executeUpdate();
			//stmt.execute("commit;");
			//conn.commit();
			System.out.println("Row Num Added: " + add_rows);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		

	}

}
