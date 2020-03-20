package teacherstudent;

public class Student {

    public Student(){
        
    }

    public void learn(){
        System.out.println("learning");
    }
    public void question(Teacher teacher){
        teacher.answer();
    }

}
