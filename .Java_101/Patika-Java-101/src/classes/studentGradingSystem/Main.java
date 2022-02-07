package classes.studentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "TRH", "0500000000");
        Teacher t2 = new Teacher("Graham","FZK","532236");
        Teacher t3 = new Teacher("Kül Yutmaz","BIO","50555555");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course biyo= new Course("biyoloji","101","BIO");
        biyo.addTeacher(t3);
        Course fizik= new Course("fizik","101","FZK");
        fizik.addTeacher(t2);


        Student s1 = new Student("CEO","401","6",tarih,fizik,biyo);
        s1.addBulkilkExamNote(100,100,50);
        s1.addBulkSozluNote(50,60,75);

        s1.isPass();
    }
}
