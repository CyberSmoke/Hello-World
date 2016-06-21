import employeemanagement.services.Employee;
import employeemanagement.services.EmployeeServiceImpl;
import employeemanagement.services.EmployeeServiceImplService;


public class SoapClient {

	public static void main(String[] args) 
	{
		//Call the webservice
		//URL: http://localhost:3001/EmployeeService?wsdl
		EmployeeServiceImplService service = new EmployeeServiceImplService();
		EmployeeServiceImpl port = service.getEmployeeServiceImplPort();
		
		Employee employee = port.getEmployeeById("20");
		System.out.println("Employee Id: " + employee.getId() );
		System.out.println("Employee Name: " + employee.getName() );
	}

}
