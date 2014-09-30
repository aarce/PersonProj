package MainPackage;

public class Faculty extends Employee{
	private String officehrs, rank;
	
	public Faculty(){
		
	}
	public Faculty(String officehrs, String rank){
		this.officehrs = officehrs;
		this.rank = rank;
	}
	public String getOfficehrs() {
		return officehrs;
	}
	public void setOfficehrs(String officehrs) {
		this.officehrs = officehrs;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString(){
	return this.getClass().getName() + "\n" + getName();
}
}
