package autowireByName;

public class Categorie {
	
	private String name;
	private Book bk;
	/*private Note no;
	public Note getNo() {
		return no;
	}
	public void setNo(Note no) {
		this.no = no;
	} */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBk() {
		return bk;
	}
	 public void setBk(Book bk) {
		this.bk = bk;
	}  
	/*public Categorie(Book bk)
	{
		System.out.println("hii");
		this.bk = bk;
	}*/
	
	public void show()
	{
		System.out.println("");
		System.out.println("BookName: "+bk.getBookName()+" BookPrice: "+bk.getBookPrice());
	}
	

}
