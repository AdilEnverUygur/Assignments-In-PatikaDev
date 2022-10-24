package classes.studentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(" Mahmut Hoca", "TRH", "555" );
        Teacher t2 = new Teacher("Ali Ahhmet","FZK","533" );
        Teacher t3 = new Teacher("Fatih Yilmaz", "BIO", "111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);



        Student s1 = new Student("Şaban", "123","4",tarih,fizik,biyo);

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);

        s1.addBulkExamNote(50, 60, 70,45,55,65);
        s1.isPass();
        s1.printNote();
        s2.addBulkExamNote(40, 50, 60,100,100,100);
        s2.isPass();
        s2.printNote();

    }
}
