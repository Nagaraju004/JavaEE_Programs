package sql;

import java.sql.SQLException;


public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Database_Name connect=new Database_Name();
		connect.getData();
	}
}