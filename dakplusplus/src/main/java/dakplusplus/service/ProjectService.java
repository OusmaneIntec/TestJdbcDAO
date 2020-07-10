package dakplusplus.service;

import java.sql.SQLException;

import dakplusplus.data.ProjectDAO;
import dakplusplus.model.Project;

public class ProjectService {
	
	ProjectDAO projectDAO=new ProjectDAO();
	
	public void addProject(Project project) throws SQLException {
		
		 projectDAO.addProject(project);
	}
	
	public void deleteProject(int id) throws SQLException {
		projectDAO.deletePrject(id);
	}

}
