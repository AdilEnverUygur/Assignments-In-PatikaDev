package classes.studentGradingSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course x1;
    Course x2;
    Course x3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int soz1, int soz2, int soz3){
        if(note1 >= 0 && note1 <= 100 && soz1 >= 0 && soz1 <=100){
            this.c1.note = note1;
            this.c1.sozluNote = soz1;
        }
        if(note2 >= 0 && note2 <= 100 && soz2 >= 0 && soz2 <=100){
            this.c2.note = note2;
            this.c2.sozluNote = soz2;
        }
        if(note3 >= 0 && note3 <= 100 && soz3 >= 0 && soz3 <=100){
            this.c3.note = note3;
            this.c3.sozluNote = soz3;
        }
    }


    void isPass() {
        System.out.println("=======================================");
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note) * 0.8 + (this.c1.sozluNote + this.c2.sozluNote + this.c3.sozluNote) * 0.2 ) / 3.0 ;
        if(this.avarage > 55 ) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz ! ");
            this.isPass = true;
            System.out.println("=======================================");
        }

        else{
            System.out.println("Sınıfta kaldınız !!!");
            this.isPass = false;
        }

    }

    void printNote(){

        System.out.println(this.c1.name +"Notu\t:" + this.c1.note + "\t"+ this.c1.name + "Sözlü Notu\t:" + this.c1.sozluNote);
        System.out.println(this.c2.name +"Notu\t:" + this.c2.note + "\t"+ this.c2.name + "Sözlü Notu\t:" + this.c2.sozluNote);
        System.out.println(this.c3.name +"Notu\t:" + this.c3.note + "\t"+ this.c3.name + "Sözlü Notu\t:" + this.c3.sozluNote);
        System.out.println("Genel Ortalamanız : " + this.avarage +"\t"+ "Sözlü Ortalamanız : " + ((this.c1.sozluNote + this.c2.sozluNote + this.c3.sozluNote) / 3.0) +"\t"+ "Not Ortalamanız : " + ((this.c1.note + this.c2.note + this.c3.note) / 3.0 ));
    }
}
