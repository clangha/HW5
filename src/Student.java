import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public Integer StudentId;
    //public List<Project> project = new ArrayList<Project>();
    public List<Course> courses = new ArrayList<Course>();
    //public List<Exam> exam = new ArrayList<Exam>();


    public Student(String name, Integer studentId, List<Course> courses) {
        this.name = name;
        StudentId = studentId;
        this.courses = courses;
    }

    public String getName(){
        return name;
    }

    /*
    public Project getProjects(){
    }
     */

    public void takes(List<Course> courses){
        this.courses.addAll(courses);
    }
}
