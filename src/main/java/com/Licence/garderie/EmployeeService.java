package com.Licence.garderie;

import java.util.List;


public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
