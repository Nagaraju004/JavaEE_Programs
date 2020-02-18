package jdbc;

public class Address {  
private String city;  
private String state;  
private String country;  
  
public Address(String city, String state, String country) {  
    super();  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  

//For setter injection
/*

public void setCity(String city) {
	this.city = city;
}

public void setState(String state) {
	this.state = state;
}

public void setCountry(String country) {
	this.country = country;
}
*/

public String toString(){  
    return "city:"+city+" "+" state:"+state+" "+" country:"+country;  
}  
}  