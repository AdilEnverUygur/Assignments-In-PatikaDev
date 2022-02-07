package classes.studentGradingSystem;

public class Teacher {
    String name;
    String branch;
    String mphone;

    Teacher(String name,String branch,String mphone){
        this.name = name;
        this.branch=branch;
        this.mphone=mphone;

    }
    void print (){
        System.out.println("Adı  :"+this.name);
        System.out.println("Branşı :"+this.branch);
        System.out.println("Telefonu :"+mphone);
    }
}
