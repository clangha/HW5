public class Employee {
    public String name;
    public Integer eId;
    public Integer age;

    public Employee(String name, Integer eId) {
        this.name = name;
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge(){
        return age;
    }
}
