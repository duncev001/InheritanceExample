public class UndergraduateStudent extends Student
{
    private int year;

    public static void main(String[] args){
        Student a1 = new Student("evan", 19);
        Student a2 = new UndergraduateStudent("evan");
        a1 = a2;
        Object p = new String("apple");
    }

    public UndergraduateStudent(String name){
        super(name, 18);
        year = 0;
    }

    public void setAge(int age){
        setAge(age);
        year++;
    }
    
    
}
