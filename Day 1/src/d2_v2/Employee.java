package d2_v2;

public class Employee {

	private int empid;
	private String name;
	private String password;
	public Employee(int empid, String name, String password) {
		super();
		this.empid = empid;
		this.name = name;
		this.password = password;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
