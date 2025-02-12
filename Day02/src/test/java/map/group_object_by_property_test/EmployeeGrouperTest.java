package map.group_object_by_property_test;

import static org.junit.jupiter.api.Assertions.*;

import map.group_object_by_property.Employee;
import map.group_object_by_property.EmployeeGrouper;
import org.junit.jupiter.api.Test;
import java.util.*;

class EmployeeGrouperTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(2, result.get("HR").size());
        assertEquals(1, result.get("IT").size());
    }
}
