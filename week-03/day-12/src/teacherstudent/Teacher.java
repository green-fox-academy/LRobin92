package teacherstudent;

public class Teacher {
    String teach;
    public Teacher(){

    }

    public void teach(Student student){
       student.learn();
    }

    public void answer(){
        System.out.println("teaching");
    }
}
