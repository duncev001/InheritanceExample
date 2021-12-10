//\#2 DONE
public class GraduateStudent extends Student
{
    private String major;
    private String degreeName;
    
    public static void main(String[] args){
        Student a1 = new Student("evan", 19);
        Student a2 = new UndergraduateStudent("evan");
        a1 = a2;
        Object p = new String("apple");
    }
    
    public GraduateStudent(String name, int age, String major, String degreeName){
        super(name, age);
        this.major = major;
        this.degreeName = degreeName;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public void setDegreeName(String degreeName){
        this.degreeName = degreeName;
    }
    
    public String getMajor(){
        return major;
    }
    
    public String getDegreeName(){
        return degreeName;
    }
    
    public boolean equals(GraduateStudent dummy){
        if(super.equals(dummy) && major.equals(dummy.getMajor()) && degreeName.equals(dummy.getDegreeName())){
            return true;
        }
        return false;
    }
}
