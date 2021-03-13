package catchup_20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		List<ProductBean> list = new ArrayList<>();
		
		// load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.108:3306/sales", "root", "123456");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from product_tbl");) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getDate(4));
				ProductBean productBean = new ProductBean();
				productBean.setId(rs.getInt(1));
				productBean.setProduct_name(rs.getString(2));
				productBean.setPrice(rs.getDouble(3));
				productBean.setOnboard_date(rs.getDate(4));
				list.add(productBean);
			}
			System.out.println("Total Objects: " + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
