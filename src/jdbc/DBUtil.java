package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库工具类
 * @author zx
 *
 */
public class DBUtil {
	
	private static final  String CLASS_NAME="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static final String URL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=";
	
	private static final String USER="sa";
	
	private static final String PASSWORD="";
   
	private DBUtil(){}//保证此工具类不会实例化；
	
	/**
	 * 数据库连接操作；
	 * @param tableName 数据库名
	 * @return
	 * @throws Exception
	 */
	public static Connection dbCon(String dbName) throws Exception{
		String newUrl=URL+dbName;
		Class.forName(CLASS_NAME);
		System.out.println("驱动加载成功");
		Connection con=DriverManager.getConnection(newUrl, USER, PASSWORD);
		System.out.println("数据库连接成功");
		return con;
		}
	public static void dbClose(Connection con) throws Exception{
		con.close();
		}

}
