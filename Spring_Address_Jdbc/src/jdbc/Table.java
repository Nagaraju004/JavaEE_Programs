package jdbc;

public class Table {

	private int id;
	private String name;
	private Address address;
	public Table(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	//For setter injection method
	/*	public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAddress(Address address) {
			this.address = address;
		} */
	
	public void show() {
		
		System.out.println("Id:"+id+" Name:"+name);
		System.out.println(address.toString());
		
	}

	
}
