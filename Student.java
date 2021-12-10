//\#2 DONE
public class Student implements Comparable<Student>
{
    protected String name;
    protected int age;

    public static void main(String[] args){
        Student cat = new Student("cat", 1);
        Student cab = new Student("cab", 3);
        System.out.println(cat.compareTo(cab));
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Student dummy){
        if(name.equals(dummy.getName()) && age==dummy.getAge()){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student other){
        if(name.equals(other.getName())){
            if(age==other.getAge()){
                return 0;
            }
            if(age>other.getAge()){
                return 1;
            }
            return -1;
        }
        if(name.compareTo(other.getName())<0){
            return -1;
        }
        return 1;
    }
}