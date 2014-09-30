package MainPackage;

public class Student extends Person{
	final private String status;

	public Student (String status){
		 this.status = status;
		 }
	public String getStatus(){
		 return status;
		 }

	@Override
	public String toString(){
	return this.getClass().getName() + "\n" + getName();
}
}