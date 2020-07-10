package dakplusplus.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import dakplusplus.data.EmployeeDAO;
import dakplusplus.model.Employee;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO= new EmployeeDAO();
	
	
	public List<Employee> findAllEmployee() throws SQLException{
		
		return employeeDAO.findAllEmployee();
	}
	
	public void modifiyEmployee(Employee employee) throws SQLException {
		employeeDAO.modifyEmployee(employee);
		
		
	}
	
	public void deleteById(int id) throws SQLException {
		
		employeeDAO.deleteById(id);
		
	}
	
	public void addEmployee(Employee employee) throws SQLException {
		
		employeeDAO.addEmployee(employee);
		
	}

	public List<Employee> showEmployeeBithDay(LocalDate birthDay) throws SQLException {
	 return	employeeDAO.showEmployeeBithDay(birthDay);
		
	}
public void showEmployeeNextSevenDaysBirthDay() throws SQLException {
	employeeDAO.showEmployeeNextSevenDaysBirthDay();
		
	}
}
