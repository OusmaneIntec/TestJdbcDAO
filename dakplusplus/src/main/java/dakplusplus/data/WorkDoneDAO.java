package dakplusplus.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dakplusplus.model.Employee;
import dakplusplus.model.WorkDone;

public class WorkDoneDAO {

	public void addWorkDone(int idE, int idP) throws SQLException {
		/*WorkDone workDone=new WorkDone();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		String date=sc.next();
		workDone.setDate(date);
		System.out.println("Enter the hours");
		int hours=sc.nextInt();
		 workDone.setHours(hours);
		System.out.println("Enter remarks");
		String remarks=sc.next();
	    workDone.setRemarks(remarks);
		
		
		Connection connection= ConnectionFactory.getConnection();
		
		String sql= "INSERT INTO WorkDone (EmployeeID, ProjectID, Date, HoursWorked, Remarks) VALUES(?,?,?,?,?) ";
		
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setInt(1, idE);
		statement.setInt(2, idP);
		statement.setString(3,  workDone.getDate());
		statement.setInt(4, workDone.getHours());
		statement.setString(5, workDone.getRemarks());
		
		statement.executeUpdate();
		*/
	
	}

	public void modifyWorkDone(WorkDone workDone) throws SQLException {
		Connection connection= ConnectionFactory.getConnection();
		
		String sql="UPDATE WorkDone SET EmployeeID=?, ProjectID=?, Date=?, HoursWorked=?, Remarks=?";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setInt(1, workDone.getEmployeeID());
		statement.setInt(2, workDone.getProjectID());
		statement.setDate(3, Date.valueOf(workDone.getDate()));
		statement.setInt(4, workDone.getHours());
		statement.setString(5, workDone.getRemarks());
		statement.executeUpdate();
		
		
		
		
	}

	public void deleteWorkDone(int idE, int idP) throws SQLException {
		Connection connection= ConnectionFactory.getConnection();
	String sql=	"DELETE FROM WorkDone WHERE EmployeeID=? AND ProjectID=?";
	PreparedStatement statement= connection.prepareStatement(sql);
	statement.setInt(1, idE);
	statement.setInt(2, idP);
	statement.executeUpdate();
	
		
	}

	public void addWorkDone(WorkDone workDone) throws SQLException {
		String sql= "INSERT INTO WorkDone (EmployeeID, ProjectID, Date, HoursWorked, Remarks) VALUES(?,?,?,?,?) ";
		
		Connection connection= ConnectionFactory.getConnection();
		PreparedStatement statement= connection.prepareStatement(sql);
	     statement.setInt(1, workDone.getEmployeeID());
	     statement.setInt(2, workDone.getProjectID());
	     statement.setDate(3, Date.valueOf(workDone.getDate()));
	     statement.setInt(4, workDone.getHours());
	     statement.setString(5, workDone.getRemarks());
	     
	     statement.executeUpdate();
		
		
		
	}
    
	public List<WorkDone> showAllWorkDone() throws SQLException {
		Connection connection= ConnectionFactory.getConnection();
		
		Statement statement = connection.createStatement();
		 ResultSet rs= statement.executeQuery("SELECT * FROM WorkDone");
			return parseWorkDones(rs);
		}
	
	
	
	private List<WorkDone> parseWorkDones(ResultSet rs) throws SQLException {
		
		List<WorkDone> result= new ArrayList<>();
		
		while(rs.next()) {
			WorkDone workDone= new WorkDone();
			
			workDone.setEmployeeID(rs.getInt("EmployeeID"));
			workDone.setProjectID(rs.getInt("ProjectID"));
			workDone.setDate(rs.getDate("Date").toLocalDate());
			workDone.setHours(rs.getInt("HoursWorked"));
			workDone.setRemarks(rs.getString("Remarks"));
			
			
		
		
			
			result.add(workDone);
			
		}
		// 4. Return result
		
		
		return result;
		
	}

	public List<WorkDone> showEmployeeProject(int idEmployee) throws SQLException {
		String sql="SELECT  WorkDone.EmployeeID, WorkDone.ProjectID,WorkDone.Date, WorkDone.HoursWorked, WorkDone.Remarks, FirstName, Description, StartDate, EndDate, Price FROM WorkDone INNER JOIN Projects ON WorkDone.ProjectID=Projects.ProjectID INNER JOIN Employees ON WorkDone.EmployeeID=Employees.EmployeeID WHERE WorkDone.EmployeeID=?";
		Connection connection= ConnectionFactory.getConnection();
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setInt(1, idEmployee);
		ResultSet rs=statement.executeQuery();
		
		return parseWorkDones(rs);
	}
}
