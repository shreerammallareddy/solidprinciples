package singleresponsibilityprinciple.bad;

public class Employee {

    private Long id;
    private String name;
    private String department;
    private boolean isWorking;

    public Employee(){}

    public Employee(Long id, String name, String department, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.isWorking = isWorking;
    }
    //-------------------Getters and Setters-----------------//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
    //-------------------Getters and Setters-----------------//

    //-------------------Other methods-----------------//

    public void saveEmployeeToDatabase(){
        // DB related Code
    }

    public void printEmployeeDetailReportXml(){

    }

    public void printEmployeeDetailReportCsv(){

    }

    public void terminateEmployee(){

    }

}
