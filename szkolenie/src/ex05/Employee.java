package ex05;

public class Employee {
	
		private String name;
		private int salary = 10_000;
		private String info;

		public Employee(String name) {
			
			this.name = name;
			info = getInfo();
			info = getEmployeeInfo();
		}

		public String getInfo() {
			return this.name + ", salary: " + salary;
		}

		public String getEmployeeInfo() {
			return info;
		}
	}

