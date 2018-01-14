package implementation1.util;

import implementation1.model.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    private Employee employee;
    private FormatType formatType;

    public EmployeeReportFormatter() {}

    public EmployeeReportFormatter(FormatType formatType, Employee employee) {
        super(formatType, employee);
        this.employee = employee;
    }


    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
