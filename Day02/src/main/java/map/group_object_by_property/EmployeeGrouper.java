package map.group_object_by_property;

import java.util.*;


public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee employee : employees) {
            groupedMap.computeIfAbsent(employee.department, k -> new ArrayList<>()).add(employee);
        }
        return groupedMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        System.out.println("Grouped Employees: " + groupByDepartment(employees));
    }
}
