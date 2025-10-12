package day6_encapsulation;

/*
the use of static:
1.it's the modifier of variable,this variable belongs to the class.
it doesn't belong to any object. all objects share this variable
access it by ClassName.staticVariable
2.it's the modifier of method,this method belongs to the class,it would be loaded into memory in the begining with class
it doesn't belong to any object.
you can only directly use other static member inside a static method
 */
public class Student {
    //no,name,age,class,gender  ->  fields,instance variable
    private int no;
    private String name;
    public static String teacherName;  //this variable belongs to the class.it doesn't belong to any object. all objects share this variable
    public static int studentCount;
    public Student(int no,String name,  String teacherName) {
        this.name = name;
        this.no = no;
        this.teacherName = teacherName;
        studentCount++;
    }
    public Student(){}

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

    public void test1(){

    }
    public static void test2(){

    }

    public static void test3(){
        Student s = new Student();
        s.test1();

        //this:current object
//        this.test1();         //wrong
//        this.no = 1001;       //wrong

        test2();
        teacherName = "Jack";
    }
}
