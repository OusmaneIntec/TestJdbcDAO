package dakplusplus.model;

import java.time.LocalDate;

public class Project {
	
	private int id;
	private LocalDate startDate;
	private String description;
	private double price;
	private LocalDate endDate;
	public int getId() {
		return id;
	}
	public Project setId(int id) {
		this.id = id;
		return this;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public Project setStartDate(LocalDate startDate) {
		this.startDate = startDate;
		
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Project setDescription(String description) {
		this.description = description;
		
		return this;
	}
	public Project() {
		
	}
	
	public Project(LocalDate startDate, String description, double price, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.description = description;
		this.price = price;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Project [startDate=" + startDate + ", description=" + description + ", price=" + price + ", endDate="
				+ endDate + "]";
	}
	public double getPrice() {
		return price;
	}
	public Project setPrice(double price) {
		this.price = price;
		return this;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public Project setEndDate(LocalDate endDate) {
		this.endDate = endDate;
		
		return this;
	}
	
	

}
