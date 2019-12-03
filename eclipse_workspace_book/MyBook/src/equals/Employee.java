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
//		���this��otherObject�Ƿ�����ͬһ������
		if(this == otherObject)
			return true;
		
//		���otherObject�Ƿ�Ϊnull�����Ϊnull�򷵻�false
		if(otherObject == null)
			return false;
		
//		�Ƚ�this��otherObject�Ƿ�����ͬһ����,�иı����getClass��⣬�����ͳһ�����壬����instanceof���
		if(getClass() != otherObject.getClass())
			return false;
		
//		��otherObjectת��Ϊ��Ӧ�����ͱ���
		Employee other =(Employee)otherObject;
		
//		���бȽ�
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
