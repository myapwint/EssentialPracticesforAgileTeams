package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
	private String name;
	private float salary;
	
	public Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public float getBaseSalary() { return salary; }
	public String getName() { return name;}
	public float computeDeductions() { return salary*0.2f;}
	public  float computeSalary(float variableComponent){
		return getBaseSalary()
				- computeDeductions() + variableComponent;
	}

}

