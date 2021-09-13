package Online.Employee.System.services;

import Online.Employee.System.exception.ResourceNotFoundException;
import Online.Employee.System.model.Employee;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

public interface IEmployeeService {

    List<Employee> getAllEmployees();

    ResponseEntity<Employee> getEmployeeById(Long employeeId) throws ResourceNotFoundException;

    Employee createEmployee(Employee employee);

    ResponseEntity<Employee> updateEmployee(Long employeeId,Employee employeeDetails) throws ResourceNotFoundException;

    Map<String, Boolean> deleteEmployee(Long employeeId) throws ResourceNotFoundException;
}

