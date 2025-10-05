package day6_encapsulation;

public class Date {
    int year;
    int month;
    int day;

    /*
    this:represent the current object inside of this class
    1.  this.field  when local variable is in the same name as field, then by this.field we refer to the global variable
    2.  this.method()   calling the method of current object, usually we omit this. if it's in the current class
    3.  this(value1,value2,value3);     a. calling the other constructor inside a constructor  b.this code has to be the 1st code  c. usually we call constructor with more parameters inside the one with less parameter
     */
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(int year, int month)
    {
        this(year,month,1);
    }

    public Date(int year)
    {
        this(year,1,1);
//        this.year = year;
//        this.month = 1;
//        this.day = 1;
    }
    public Date()
    {
        this(2025,1,1);
    }

//    public String toString(){
//        return year+"-"+month+"-"+day;
//    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", year=" + year +
                ", month=" + month +
                '}';
    }

    public void a(){

    }
    public void b(){
        this.a();
        a();
    }
}