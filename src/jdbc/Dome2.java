package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Dome2 {
    public static void main(String[] args) throws Exception{
    	String sql="insert into table_1 values(211,'hah',10,'sc')";
    	String dbName="Mydb";
    	Connection con=DBUtil.dbCon(dbName);
    	Statement stmt=con.createStatement();
    	int rs=stmt.executeUpdate(sql);
    	System.out.println("��ѯ���Ϊ"+rs);
    	stmt.close();
    }
}
