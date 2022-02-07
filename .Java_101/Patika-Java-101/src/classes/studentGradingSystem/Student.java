package classes.studentGradingSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String studentNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.studentNo=studentNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0;
        this.isPass=false;
    }
    void addBulkilkExamNote(int note1 , int note2 , int note3){
        if (note1>=0 && note1 <=100){
            this.c1.note=note1;
        }if (note2>=0 && note2 <=100){
            this.c2.note=note2;
        }if (note3>=0 && note3 <=100){
            this.c3.note=note3;
        }

    }void addBulkSozluNote(int sozlunot1,int sozlunot2,int sozlunot3){
        if (sozlunot1>=0 && sozlunot1<=100){
            this.c1.sozlunot=sozlunot1;
        }if (sozlunot2>=0 && sozlunot2<=100){
            this.c2.sozlunot=sozlunot2;
        }if (sozlunot3>=0 && sozlunot3<=100){
            this.c3.sozlunot=sozlunot3;
        }
    }
    void isPass(){
        this.avarage=((this.c1.note*0.8+this.c1.sozlunot*0.2)+(this.c2.note*0.8+this.c2.sozlunot*0.2)+(this.c3.note*0.8+this.c3.sozlunot*0.2))/3.0;
        if (this.avarage>=55){
            System.out.println("=========================");
            System.out.println("Sınıfı Geçtiniz");
            this.isPass=true;
        }else {
            System.out.println("Kaldınız");
            this.isPass=false;
        }
        printnote();
    }
    void printnote(){
        System.out.println(this.c1.name + "  sözlü notu  :"+this.c1.sozlunot);
        System.out.println(this.c2.name + "  sözlü notu  :"+this.c2.sozlunot);
        System.out.println(this.c3.name + "  sözlü notu  :"+this.c3.sozlunot);
        System.out.println(this.c1.name + "notu  :"+this.c1.note);
        System.out.println(this.c2.name + "notu  :"+this.c2.note);
        System.out.println(this.c3.name + "notu  :"+this.c3.note);
        System.out.println("Ortalamanız"+this.avarage);
    }
}
