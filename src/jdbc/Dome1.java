package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dome1 {
	
	public  static String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public static String url="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Mydb";
	public static String user="sa";
	public static String password="";
	
	public static void main(String[] args){
		Connection con=null;
		 Statement stmt=null;
		//加载驱动；
		try {
			Class.forName(className);
			System.out.println("驱动加载成功");
		} catch (ClassNotFoundException e) {
		   e.printStackTrace();
		   System.out.println("驱动加载失败");
		}
		//连接数据库
		try {
			con=DriverManager.getConnection(url, user, password);
			 System.out.println("数据库连接成功");
			 String sql="insert into table_1 values(21,'hah',10,'sc')";
			  stmt=con.createStatement();
			 int rs=stmt.executeUpdate(sql);
			 System.out.println(rs);
			 } catch (SQLException e) {
			e.printStackTrace();
			 System.out.println("数据库连接失败");
		}finally{//关闭数据库；
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
