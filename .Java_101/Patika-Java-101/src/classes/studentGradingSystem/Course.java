package classes.studentGradingSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlunot;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code=code;
        this.prefix=prefix;
        int note = 0;
        int sozlunot;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("öğretmen ve ders uyusmuyor");
        }

    }
    void printTeacher(){
        this.teacher.print();
    }
}

