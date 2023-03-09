package oops.encaspdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("rahul");
		e.setSalary(10000);
		
		System.out.println(e.getId() + " " +e.getName() + " "+ e.getSalary());
	}
}
