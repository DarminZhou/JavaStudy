package employeeTest;
import java.util.*;

public class EmployeeTest {
	public static void main(String [] args){
		Employee[] staff=new Employee[3];
		staff[0] = new Employee("Carl Cracker",7500,1987,12,15);
		staff[1] = new Employee("Harry Hacker",5000,1997,10,1);
		staff[2] = new Employee("Tony Tester",7500,1990,3,15);
		
		for(Employee e:staff)
			e.raiseSalary(5);
		
		for(Employee e: staff)
			System.out.println("name="+e.getName() + ", salary=" + e.getSalary() + ",hireDay="+e.getHireDay());
	}
}

class Employee{
	private String name ;
	private double salary;
	private Date hireDay;

	public Employee(String n,double s,int year, int month ,int day){
		name=n;
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year ,month -1,day);
		hireDay=calendar.getTime();
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public Date getHireDay(){
		return hireDay;
	}

	public void raiseSalary (double byPercent){
		double raise = salary*byPercent/100;
		salary+= raise;
	}

}











