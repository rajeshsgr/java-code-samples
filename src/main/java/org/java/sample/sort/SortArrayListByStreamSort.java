package org.java.sample.sort;

import org.java.sample.sort.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * SortArrayListByStreamSort program demonstrates a way to sort an ArrayList of Objects
 * using the sorted method of Stream interface. This method returns a stream consisting of the elements
 * of the collection, sorted according to the provided Comparator
 *
 * @author rajeshp
 * @Date 10/17/22
 */
public class SortArrayListByStreamSort {

    /**
     * This method takes a list of custom Employee object and sorts it using the Comparator
     * interface. Comparator in this example uses getEmployeeName method of Employee object
     *  to sort the list
     *
     * @param employeeList
     * @return
     */
    static ArrayList<Employee> sortListOfObjectsByStringField(ArrayList<Employee> employeeList) {

        ArrayList<Employee> sortedEmployeesByName = (ArrayList<Employee>) employeeList
                .stream().sorted(Comparator.comparing(Employee::getEmployeeName))
                .collect(Collectors.toList());

        return sortedEmployeesByName;

    }

    /**
     * This method takes a list of custom Employee object and sorts it using the Comparator
     *  interface. Comparator in this example uses getDateofJoining method of Employee object
     *  to sort the list
     *
     * @param employeeList
     * @return
     */
    static ArrayList<Employee> sortListOfObjectsByDateField(ArrayList<Employee> employeeList) {

        ArrayList<Employee> sortedEmployeesByDate = (ArrayList<Employee>) employeeList
                .stream().sorted(Comparator.comparing(Employee::getDoj))
                .collect(Collectors.toList());


        return sortedEmployeesByDate;

    }

    /**
     * The main method invokes 2 different methods to show sorting feature .
     * First invocation calls the method to sort an Employee object by String variable
     * Second invocation calls the method to sort an Employee object by Date variable
     *
     * @param args
     */
    public static void main(String[] args) {

        Employee objEmployee = new Employee();

        ArrayList<Employee> empList = objEmployee.getSampleemployeeList();

        System.out.println("\n*********Sorted by Employee Name**********\n");

        ArrayList<Employee> sortedEmployees = SortArrayListByStreamSort.sortListOfObjectsByStringField(empList);
        sortedEmployees.forEach(System.out::println);

        System.out.println("\n*********Sorted by Date**********\n");

        ArrayList<Employee> sortedEmployeesByDate = SortArrayListByStreamSort.sortListOfObjectsByDateField(empList);
        sortedEmployeesByDate.forEach(System.out::println);
    }


}
