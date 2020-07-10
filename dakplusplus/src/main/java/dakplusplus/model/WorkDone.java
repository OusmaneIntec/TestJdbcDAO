package dakplusplus.model;

import java.sql.Date;
import java.time.LocalDate;

public class WorkDone {
	private int employeeID;
	private int projectID;
	private LocalDate date;
	private int hours;
	private String remarks;
	private Employee employee;
	private Project project;
	public WorkDone() {
		
	}
	public WorkDone(int employeeID, int projectID, LocalDate date, int hours, String remarks) {
		super();
		this.employeeID = employeeID;
		this.projectID = projectID;
		this.date = date;
		this.hours = hours;
		this.remarks = remarks;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public WorkDone setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
		return this;
	}
	public int getProjectID() {
		return projectID;
	}
	public WorkDone setProjectID(int projectID) {
		this.projectID = projectID;
		return this;
	}
	public LocalDate getDate() {
		return date;
	}
	public WorkDone setDate(LocalDate date) {
		this.date = date;
		
		return this;
	}
	public int getHours() {
		return hours;
	}
	public WorkDone setHours(int hours) {
		this.hours = hours;
		
		return this;
	}
	public String getRemarks() {
		return remarks;
	}
	public WorkDone setRemarks(String remarks) {
		this.remarks = remarks;
		
		return this;
	}
	public Employee getEmployee() {
		return employee;
	}
	public WorkDone setEmployee(Employee employee) {
		this.employee = employee;
		return this;
	}
	public Project getProject() {
		return project;
	}
	public WorkDone setProject(Project project) {
		this.project = project;
		return this;
	}
	@Override
	public String toString() {
		return "WorkDone [employeeID=" + employeeID + ", projectID=" + projectID + ", date=" + date + ", hours=" + hours
				+ ", remarks=" + remarks + "]";
	}
	
     
}
