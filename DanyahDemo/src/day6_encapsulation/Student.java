package day6_encapsulation;

public class Student {
    //no,name,age,class,gender  ->  fields,instance variable
    private int no;
    private String name;
    private static String teacherName;  //this variable belongs to the class.it doesn't belong to any object. all objects share this variable
    private static int studentCount;
    public Student(int no,String name,  String teacherName) {
        this.name = name;
        this.no = no;
        this.teacherName = teacherName;
        studentCount++;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", teacherName='" + teacherName + '\'' +
                ", studentCount='" + studentCount + '\'' +
                '}';
    }
}
