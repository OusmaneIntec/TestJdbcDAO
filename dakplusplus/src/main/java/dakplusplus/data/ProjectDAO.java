package dakplusplus.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dakplusplus.model.Employee;
import dakplusplus.model.Project;

public class ProjectDAO {

	public void addProject(Project project) throws SQLException {
		
		
			
			
			Connection connection= ConnectionFactory.getConnection();
			String sql= "INSERT INTO Projects (StartDate, Description, Price, EndDate)"
					+ "VALUES(?,?,?,?)";
			
			 PreparedStatement statement=connection.prepareStatement(sql);
				statement.setDate(1, Date.valueOf(project.getStartDate()));
				statement.setString(2, project.getDescription());
				statement.setDouble(3, project.getPrice());
				statement.setDate(4, Date.valueOf(project.getEndDate()));
				
					
				
				statement.executeUpdate();
		
	}

	public void deletePrject(int id) throws SQLException {
	Connection connection= ConnectionFactory.getConnection();
		
		String sql="DELETE FROM Projects WHERE ProjectID=?";
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setInt(1, id);
		statement.executeUpdate();
		
	}
	
	

}
