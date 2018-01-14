package implementation1.dao;

import implementation1.model.Employee;

public class EmployeeDao {

    public void saveEmployee(Employee employee){
        DatabaseConnectionManager databaseConnectionManager = DatabaseConnectionManager.getManagerInstance();
        databaseConnectionManager.getConnection();
        System.out.println("Employee saved in Database: "+ employee);
        databaseConnectionManager.disconnect();
    }

    public void deleteEmployee(Employee employee){
        System.out.println("Employee deleted in Database: "+ employee);
    }

}
