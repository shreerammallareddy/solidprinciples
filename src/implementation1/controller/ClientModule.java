package implementation1.controller;

import implementation1.dao.EmployeeDao;
import implementation1.model.Employee;
import implementation1.util.EmployeeReportFormatter;
import implementation1.util.FormatType;

public class ClientModule {


    public static void hireNewEmployee(Employee employee){
//        Tight Coupling of EmployeeDao Object
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
//        Tight Coupling of EmployeeDao Object
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee){
//        Tight Coupling of EmployeeReportFormatter Object
        EmployeeReportFormatter employeeReportFormatter=new EmployeeReportFormatter(FormatType.XML,employee);
        System.out.println(employeeReportFormatter.getFormattedEmployee());
    }

    public static void main(String[] args) {

        Employee ram = new Employee(1L,"ram","Manager",true);
        ClientModule.hireNewEmployee(ram);
        ClientModule.printEmployeeReport(ram);
        ClientModule.terminateEmployee(ram);
    }
}
