package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ���ݿ⹤����
 * @author zx
 *
 */
public class DBUtil {
	
	private static final  String CLASS_NAME="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static final String URL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=";
	
	private static final String USER="sa";
	
	private static final String PASSWORD="";
   
	private DBUtil(){}//��֤�˹����಻��ʵ������
	
	/**
	 * ���ݿ����Ӳ�����
	 * @param tableName ���ݿ���
	 * @return
	 * @throws Exception
	 */
	public static Connection dbCon(String dbName) throws Exception{
		String newUrl=URL+dbName;
		Class.forName(CLASS_NAME);
		System.out.println("�������سɹ�");
		Connection con=DriverManager.getConnection(newUrl, USER, PASSWORD);
		System.out.println("���ݿ����ӳɹ�");
		return con;
		}
	public static void dbClose(Connection con) throws Exception{
		con.close();
		}

}
