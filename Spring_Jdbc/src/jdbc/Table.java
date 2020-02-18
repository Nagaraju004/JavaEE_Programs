package jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class Table
{
  JdbcTemplate jt;
  Scanner sc=new Scanner(System.in);

   public void setJt(JdbcTemplate jt)
   {
     this.jt = jt;	
   }
   
  public int create()
  {
	  jt.execute("create table spring(id int(3),name varchar(200))");
	  System.out.println("Succesfully table created");
	  return 0;
  }

  public int add()
  {	
	 System.out.println("Enter id and name of the student");
	
	 int i=sc.nextInt();
	 String n=sc.next();
     jt.update("insert into spring(id,name) values ('"+i+"','"+n+"')");
	 return 0;
  }
  public int update()
  {	
	  System.out.println("Enter id of the student to update");
	  int i=sc.nextInt();
	  String n=sc.next();
	  String sql="update spring set name='"+n+"'where id='"+i+"'";
      jt.update(sql);
      return 0;
  }
  public int delete()
  {	
      System.out.println("Enter the id of the student to delete");
      int i=sc.nextInt();
      jt.execute("delete from spring where id='"+i+"'");
      return 0;
  }
  public int show()
  {	
		List  list = jt.queryForList("select * from spring");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	  return 0;
 
  }
  
}