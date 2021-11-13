import java.util.ArrayList;
import java.util.List;

public class Professor {
    public List<Course> courses = new ArrayList<Course>();
    //public Exam[] exam;
    public String name;

    public Professor() {
    }

    public void publish_course(){
        /* UML does not include input-parameter as course here, otherwise I would
        have used input-parameter course here */
        System.out.println("Course has been published!");
    }

    /*
    public void assign_TA(){}
    */

    public void addNewCourse(){
        new Course(42,"DIY: Rule the world",1,new Professor());
        System.out.println("Course 'DIY: Rule the world' has been added.");
    }

    public void setName(String name){
        this.name = name;
    }
}
