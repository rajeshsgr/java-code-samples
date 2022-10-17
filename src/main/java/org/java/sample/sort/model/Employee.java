package org.java.sample.sort.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author rajeshp
 * @Date 10/7/22
 * Employee POJO class to be used by StreamExample class
 */
public class Employee {

    private int employeeId;
    private String employeeName;
    private String city;
    private Date doj;
    private int empSalary;


    public Employee() {
    }

    /**
     * @param employeeId
     * @param employeeName
     * @param city
     * @param doj
     * @param empSalary
     */
    public Employee(int employeeId, String employeeName, String city, Date doj, int empSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.city = city;
        this.doj = doj;
        this.empSalary = empSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", city='" + city + '\'' +
                ", doj=" + doj +
                ", empSalary=" + empSalary +
                '}';
    }

    public ArrayList<Employee> getSampleemployeeList() {

        SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
        ArrayList<Employee> objEmployeeList = new ArrayList<>();

        try {
            Employee emp1 = new Employee(101, "Tommy", "New Orleans", sf.parse("10-Oct-2021"), 10000);
            Employee emp2 = new Employee(102, "David", "Seattle", sf.parse("19-Jan-2020"), 20000);
            Employee emp3 = new Employee(103, "Mike", "Houston", sf.parse("11-May-2019"), 9000);
            Employee emp4 = new Employee(104, "Joseph", "Houston", sf.parse("10-Mar-2018"), 12000);
            Employee emp5 = new Employee(105, "Andreas", "Dallas", sf.parse("21-Jan-2021"), 15000);
            Employee emp6 = new Employee(106, "Brandon", "Panama City", sf.parse("10-Mar-2021"), 10000);
            Employee emp7 = new Employee(107, "Nick", "Tampa", sf.parse("10-Oct-2021"), 12000);
            Employee emp8 = new Employee(108, "Chris", "New Orleans", sf.parse("15-Mar-2020"), 11000);
            Employee emp9 = new Employee(109, "Ray", "Seattle", sf.parse("12-Apr-2020"), 9000);
            Employee emp10 = new Employee(110, "Rene", "Tampa", sf.parse("10-Jan-2021"), 15000);

            objEmployeeList.add(emp1);
            objEmployeeList.add(emp2);
            objEmployeeList.add(emp3);
            objEmployeeList.add(emp4);
            objEmployeeList.add(emp5);
            objEmployeeList.add(emp6);
            objEmployeeList.add(emp7);
            objEmployeeList.add(emp8);
            objEmployeeList.add(emp9);
            objEmployeeList.add(emp10);

        } catch (ParseException e) {
            System.out.println("Exception in parsing given date");
        }

        return objEmployeeList;

    }
}
