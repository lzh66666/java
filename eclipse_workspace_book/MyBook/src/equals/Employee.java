package equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireday;
	
	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		hireday = LocalDate.of(year, month, day);
		
		
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireday() {
		return hireday;
	}
	
	public boolean equals(Object otherObject) {
//		检测this和otherObject是否引用同一个对象
		if(this == otherObject)
			return true;
		
//		检测otherObject是否为null，如果为null则返回false
		if(otherObject == null)
			return false;
		
//		比较this和otherObject是否属于同一个类,有改变就用getClass检测，如果有统一的语义，就用instanceof检测
		if(getClass() != otherObject.getClass())
			return false;
		
//		将otherObject转换为相应类类型变量
		Employee other =(Employee)otherObject;
		
//		进行比较
		return Objects.equals(name, other.name) && salary == other.salary
				&& Objects.equals(hireday, other.hireday);
	}
	
	public int hashCode() {
		return Objects.hash(name,salary,hireday);
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + 
				",hireday=" + hireday + "]";
	}
}
