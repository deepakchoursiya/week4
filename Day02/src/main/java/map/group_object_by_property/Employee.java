package map.group_object_by_property;

 public class Employee {
    String name, department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}
