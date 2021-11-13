import java.util.ArrayList;
import java.util.List;

public class Course {
    public Integer id;
    public String name;
    public Integer maxCapacity;
    public Boolean isFull;
    public Professor prof;
    public List<Student> student = new ArrayList<Student>();
    //public List<Exam> exam = new ArrayList<Exam>();


    public Course(Integer id, String name, Integer maxCapacity, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.prof = prof;
    }

    public void Enroll(Student student){
        this.student.add(student);
    }

    /*
    public void Apply(TA ta){}
     */

    public void setMaxCap(Integer max){
        this.maxCapacity = max;
    }

    public Professor getProf(){
        return prof;
    }

    /*
    public TA getTA(){}
    public void setNewTA(TA ta){}
     */

    public void setName(String s){
        this.name = s;
    }

}
