package demo.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> citiesWorkedIn1 = new ArrayList<>();
        citiesWorkedIn1.add("Pune");
        citiesWorkedIn1.add("Mumbai");
        citiesWorkedIn1.add("Noida");
        citiesWorkedIn1.add("Bengaluru");

        Employee e1 = new Employee(111,"Velu Mani",citiesWorkedIn1);

        List<String> citiesWorkedIn2 = new ArrayList<>();
        citiesWorkedIn2.add("Pune");
        citiesWorkedIn2.add("Nagpur");
        citiesWorkedIn2.add("Indore");

        Employee e2 = new Employee(112,"Manikandan",citiesWorkedIn2);

        List<String> citiesWorkedIn3 = new ArrayList<>();
        citiesWorkedIn3.add("Pune");
        citiesWorkedIn3.add("Bengaluru");

        Employee e3 = new Employee(113,"Kalyan Puri",citiesWorkedIn3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);

        List<List<String>> listofemployeelist = employeeList.stream().map(Employee::getCitiesWorkedIn).collect(Collectors.toList());
        System.out.println(listofemployeelist);


         Set<String> employeesId = employeeList.stream().flatMap(employee -> employee.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println(employeesId);


    }
}
