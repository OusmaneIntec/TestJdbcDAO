package dakplusplus.view;

import java.sql.SQLException;
import java.util.Scanner;

import dakplusplus.model.Project;
import dakplusplus.service.ProjectService;

public class ProjectView {
	
	static ProjectService projectService= new ProjectService();
	
	public static void addProject() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Sart date (YYYY-MM-DD");
		String startDate=sc.next();
		
		System.out.println("Enter the description:");
		String description=sc.next();
		
		System.out.println("Enter the price:");
	    sc.nextLine();
		double price=sc.nextDouble();
	    
		System.out.println("Enter the end date (YYYY-MM-DD");
		String endDate=sc.next();
		
		
		
		Project project=new Project(ViewTools.parseStringToLocalDate(startDate),description,price, ViewTools.parseStringToLocalDate(endDate));
		try {
			projectService.addProject(project);
		} catch (SQLException e) {
		System.out.println("Something went wrong with the db...");
			e.printStackTrace();
		}
		
	}

}
