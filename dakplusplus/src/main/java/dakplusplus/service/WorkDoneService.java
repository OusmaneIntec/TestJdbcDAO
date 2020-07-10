package dakplusplus.service;

import java.sql.SQLException;
import java.util.List;

import dakplusplus.data.WorkDoneDAO;
import dakplusplus.model.Employee;
import dakplusplus.model.WorkDone;

public class WorkDoneService {
	
	WorkDoneDAO workDoneDAO=new WorkDoneDAO();
	
	/*public void addWorkDone(int idE, int idP) throws SQLException {
		
		
		workDoneDAO.addWorkDone(idE, idP);
		
	}*/
	
	public void addWorkDone(WorkDone workDone) throws SQLException {
		workDoneDAO.addWorkDone(workDone);
	}
	
	public void modifyWorkDone(WorkDone workDone) throws SQLException {
		workDoneDAO.modifyWorkDone(workDone);
	}
	
	public void deleteWorkDone(int idE, int idP) throws SQLException {
		workDoneDAO.deleteWorkDone(idE, idP);
	}

	public List<WorkDone> showAllWorkDone() throws SQLException{
		
		return workDoneDAO.showAllWorkDone();
	}
	
	public List<WorkDone> showEmployeeProject(int id) throws SQLException{
		return workDoneDAO.showEmployeeProject(id);
	}
	
	
}
