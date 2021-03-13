package catchup_20;

import java.io.*;
import java.util.*;
import java.sql.*;

//利用IO流，JDBC把数据写入到数据库  : For input string: ""  异常
public class IOJDBC_3 {

	public List<String> readTxtFileIntoStringArrList(String filePath) {

		List<String> list = new ArrayList<String>();
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists() && file.canRead()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;

				while ((lineTxt = bufferedReader.readLine()) != null) {
					list.add(lineTxt);
				}
				bufferedReader.close();
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

		return list;
	}

	public void InsertDataToMySQL(List<String> list)
			throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (
				Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/sales", "root", "123456");
				Statement stmt = conn.createStatement();
				)
		{
			int insert_total = 0;
			for (String lineTxt : list) {
				String[] values = lineTxt.split(" ", 0);

				insert_total += stmt.executeUpdate(
						"insert into product_tbl (product_name,price,onboard_date,produce_city,product_type_id) values ('"
								+ values[0] + "',"
								+ Double.parseDouble(values[1]) + ",'"
								+ (values[2]) + "','" + values[3] + "',"
								+ Integer.parseInt(values[4]) + ");");

				System.out.println("Total insert rows:" + insert_total);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\dummydata.txt";
		IOJDBC_3 fts = new IOJDBC_3();
		List<String> list = fts.readTxtFileIntoStringArrList(filePath);
		fts.InsertDataToMySQL(list);
	}
}