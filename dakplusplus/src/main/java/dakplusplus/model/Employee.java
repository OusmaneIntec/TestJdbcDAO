package dakplusplus.model;

import java.time.LocalDate;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emergencyPhoneNumber;
	private LocalDate birthOfDate;
	private double wage;
	public  Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, String phoneNumber, String emergencyPhoneNumber,LocalDate birthOfDate, double wage) {
		this(firstName,lastName,phoneNumber,emergencyPhoneNumber,birthOfDate,wage);
		this.id=id;
		
	}
	public Employee(String firstName, String lastName, String phoneNumber, String emergencyPhoneNumber,LocalDate birthOfDate, double wage) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emergencyPhoneNumber = emergencyPhoneNumber;
		this.birthOfDate = birthOfDate;
		this.wage = wage;
	}

	
	public int getId() {
		return id;
	}
	public Employee setId(int id) {
		this.id = id;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public Employee setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Employee setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}
	public Employee setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
		return this;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public Employee setBirthOfDate(LocalDate birthOfDate) {
		birthOfDate = birthOfDate;
		
		return this;
	}
	public double getWage() {
		return wage;
	}
	public Employee setWage(double wage) {
		this.wage = wage;
		
		return this;
	}
	
	  @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", First Name='" + firstName + '\'' +
	                ", Last Name=" + lastName +
	                ", Phone Number=" + phoneNumber +
	                ", Emergency Phone Number=" + emergencyPhoneNumber +
	                ", Birth of Date=" + birthOfDate +
	                ", Salary=" + wage +
	                '}';
	    }

	    public String getSingleLine() {
	        return "Employee{" +
	                "id=" + id +
	                ", FirstName='" + firstName + '\'' +
	                ", LastName" + lastName +
	                ", Birth of date=" + birthOfDate +
	                ", Salary=" +wage +
	                '}';
	    }

}
