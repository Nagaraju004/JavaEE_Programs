package constructorInjection;

public class DemoBean
{
  public int id;
  public String sname;

     public DemoBean(int id, String sname)
     {
         this.id  = id;
         this.sname = sname;
     }

     public void show(){
    	 System.out.println("Id :"+id);
    	 System.out.println("sname :"+sname );
     }
}