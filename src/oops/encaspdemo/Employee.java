package oops.encaspdemo;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	
	// Setters ---Mutators
	public void setId(int id) 
	{
		this.id=id;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setSalary(int salary) 
	{
		this.salary=salary;
	}
	// getters---Accessors
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public int getSalary() 
	{
		return salary;
	}
}
