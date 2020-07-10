package dakplusplus.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dakplusplus.model.Employee;


public class EmployeeDAO {

	public List<Employee> findAllEmployee() throws SQLException {
	Connection connection= ConnectionFactory.getConnection();
	
	Statement statement = connection.createStatement();
	 ResultSet rs= statement.executeQuery("SELECT * FROM Employees");
		return parseEmployees(rs);
	}
	public void addEmployee(Employee employee) throws SQLException {
		
		String sql= "INSERT INTO Employees(FirstName, LastName, PhoneNumber, EmergencyPhoneNumber,BirthOfDate, Wage)"
				+ "VALUES(?,?,?,?,?,?)";
		Connection connection= ConnectionFactory.getConnection();
		
		 PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, employee.getFirstName());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getPhoneNumber());
			statement.setString(4, employee.getEmergencyPhoneNumber());
			statement.setDate(5, Date.valueOf(employee.getBirthOfDate()));
			statement.setDouble(6, employee.getWage());		
			
			statement.executeUpdate();
	}
	public void deleteById(int id) throws SQLException {
		Connection connection= ConnectionFactory.getConnection();
		
		String sql="DELETE FROM Employees WHERE EmployeeID=?";
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setInt(1, id);
		statement.executeUpdate();
	
	}

	public void modifyEmployee(Employee employee) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		String sql = "UPDATE Employees SET FirstName=?, LastName=?, PhoneNumber=?, EmergencyPhoneNumber=?, BirthOfDate=?, Wage=?"
				+ " WHERE EmployeeID=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, employee.getFirstName());
		statement.setString(2, employee.getLastName());
		statement.setString(3, employee.getPhoneNumber());
		statement.setString(4, employee.getEmergencyPhoneNumber());
		statement.setDate(5, Date.valueOf(employee.getBirthOfDate()));
		statement.setDouble(6, employee.getWage());
		statement.setInt(7, employee.getId());

		statement.executeUpdate();

	}

private List<Employee> parseEmployees(ResultSet rs) throws SQLException {
	
	List<Employee> result= new ArrayList<>();
	
	while(rs.next()) {
		Employee employee= new Employee();
		employee.setId(rs.getInt("EmployeeId"));
		employee.setFirstName(rs.getString("FirstName"));
		employee.setLastName(rs.getString("LastName"));
		employee.setPhoneNumber(rs.getString("PhoneNumber"));
		employee.setEmergencyPhoneNumber(rs.getString("EmergencyPhoneNumber"));
	//	employee.setBirthOfDate(rs.getString("BirthOfDate"));
		employee.setWage(rs.getDouble("Wage"));
		
		result.add(employee);
		
	}
	// 4. Return result
	
	
	return result;
	
}
public List<Employee> showEmployeeBithDay(LocalDate birthDay) throws SQLException {
	
	String sql="SELECT * FROM Employees WHERE BirthOfDate=?";
	Connection connection=ConnectionFactory.getConnection();
	PreparedStatement statement=connection.prepareStatement(sql);
	statement.setDate(1, Date.valueOf(birthDay));
	 ResultSet rs=statement.executeQuery();
	
	return parseEmployees(rs);
}
public void showEmployeeNextSevenDaysBirthDay() throws SQLException {
	Connection connection=ConnectionFactory.getConnection();
	
}



}
