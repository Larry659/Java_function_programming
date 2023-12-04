package exercise;

public class Student {
    private String name;
    private Integer age;
    private String state;

    private String department;
    private String country;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Student (){}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }


    public Student(String name, Integer age, String state, String country, String department, String department1) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.country = country;
        this.department = department;
        this.department = department1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(String name, Integer age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
