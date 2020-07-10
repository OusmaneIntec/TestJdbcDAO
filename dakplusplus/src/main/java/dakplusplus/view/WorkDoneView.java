package dakplusplus.view;

import java.sql.SQLException;
import java.util.List;

import dakplusplus.model.WorkDone;
import dakplusplus.service.WorkDoneService;

public class WorkDoneView {
	private static WorkDoneService workDoneService=new WorkDoneService();
	
	public static void addWorkDone() {
		WorkDone workDone=new WorkDone();
		try {
			workDoneService.addWorkDone(workDone);
		} catch (SQLException e) {
			System.out.println("Something wrong with the db..");
			e.printStackTrace();
		}
		
	}
	
	public static void deleteWorkDone() {
		try {
			workDoneService.deleteWorkDone(1, 3);
		} catch (SQLException e) {
			System.out.println("Something went wrong with the db...");
			e.printStackTrace();
		}
		
	}

	public static void modifyWorkDone() {
		WorkDone workDone=new WorkDone();
		
		try {
			workDoneService.modifyWorkDone(workDone);
		} catch (SQLException e) {
			System.out.println("Something went wrong with the db...");
			e.printStackTrace();
		}
		
	}
    public static void showAllWorkdone() {
    	try {
		List<WorkDone> workDones=workDoneService.showAllWorkDone();
			workDones.forEach(System.out::println);
		} catch (SQLException e) {
			System.out.println("Something went wrong with the db...");
			e.printStackTrace();
		}
    	
    }
    public static void showEmployeePoject() {
    	try {
    		List<WorkDone> workDones=workDoneService.showEmployeeProject(1);
  
    		workDones.forEach(System.out::println);
			
		} catch (SQLException e) {
			System.out.println("Somthing went wrong with the db..");
			e.printStackTrace();
		}
    }
}

