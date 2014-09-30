package MainPackage;

public class Person {
	
private String name, address, phonenum, email;

public Person() {
	
}
public Person(String name, String address, String phonenum, String email){
	this.name = name;
	this.address = address;
	this.phonenum = phonenum;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhonenum() {
	return phonenum;
}
public void setPhonenum(String phonenum) {
	this.phonenum = phonenum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString(){
return getClass().getName() + "\n" + name;





}
}
