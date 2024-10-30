package rest1.java2.pkg1;

public class StudentModel {
    private String name;
    private String course;
    private String college;

    public StudentModel() {
    }

    public StudentModel(String name, String course, String college) {
        this.name = name;
        this.course = course;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

}
