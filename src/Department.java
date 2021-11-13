import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<Employee> employee = new ArrayList<Employee>();
    public Professor chair;
    public List<Course> courses = new ArrayList<Course>();

    public Department(String name, Professor chair) {
        this.name = name;
        this.chair = chair;
    }

    public List<Employee> GetEmployees(){
        return employee;
    }

    public void setName(String name){
        this.name = name;
    }
}
