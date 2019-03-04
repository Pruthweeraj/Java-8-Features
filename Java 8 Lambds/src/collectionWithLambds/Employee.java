package collectionWithLambds;

public class Employee {

	private String name;
	private Integer eNo;
	
	
	public Employee(String name, Integer eNo) {
		super();
		this.name = name;
		this.eNo = eNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer geteNo() {
		return eNo;
	}


	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", eNo=" + eNo + "]";
	}
	
	
}
