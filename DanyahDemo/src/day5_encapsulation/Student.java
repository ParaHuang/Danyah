package day5_encapsulation;

public class Student {
    //no,name,age,class,gender  ->  fields,instance variable
    private int no;
    private String name;
    private int age;
    private String cls;
    private String gender;

    //constructor:a special method
    //1. it doesn't have return type,it's in the same name as class
    //2. we use constructor to initialize some configuration(eg.data), call it by new
    public Student( int no,String name,int age, String cls, String gender ) {
        this.age = age;
        this.cls = cls;
        this.gender = gender;
        this.name = name;
        this.no = no;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //checking process
        if(age<0 || age>45){
            //leave a big reminder
            throw new RuntimeException(age + " is invalid,age should be 0~45");
        }
        this.age = age;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.equals("male") && !gender.equals("female")){
            throw new RuntimeException("gender is invalid,it can only be male or female");
        }
        this.gender = gender;
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

    //study,takeExam            ->  methods
    public void study(){
        System.out.println("hey,"+name+",time to study");
    }
    public void takeExam(){
        System.out.println("time to take exam,you are "+age+" years old");
    }
}
