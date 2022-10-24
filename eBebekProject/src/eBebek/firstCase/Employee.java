package eBebek.firstCase;

/**
 * Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını
 * hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol
 * çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve
 * bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
 *
 * Sınıfın Nitelikleri
 * name : Çalışanın adı ve soyadı
 * salary : Çalışanın maaşı
 * workHours : Haftalık çalışma saati
 * hireYear : İşe başlangıç yılı
 *
 * Sınıfın Metotları
 * Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
 * tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
 * Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
 * Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
 * bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
 * raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
 * Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
 * Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
 * Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
 * toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 *
 * Örnek konsol çıktısı:
 * Adı : kemal
 * Maaşı : 2000.0
 * Çalışma Saati : 45
 * Başlangıç Yılı : 1985
 * Vergi : 60.0
 * Bonus : 150.0
 * Maaş Artışı : 300.0
 * Vergi ve Bonuslar ile birlikte maaş : 2090.0
 * Toplam Maaş : 2390.0
 *
 *
 * Notlar
 * raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
 * tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak
 * Toplam maaş: çalışanın kendi maaşı +artış+ bonus
 * Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.
 */
public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if (salary < 1000){
            System.out.printf("Vergi Uygulanmayacak");
        }else{
            System.out.println("Vergi: " + salary * 0.03);
        }
    }

    public void bonus(){
        if (workHours > 40){
            System.out.println("Bonus: " + (workHours - 40) * 30);
        }
    }

    public void raiseSalary(){
        if (2021 - hireYear < 10){
            System.out.println("maaş artisi: " +((salary) - salary + salary * 0.05));
        }else  if (2021 - hireYear > 9 && 2021 - hireYear < 20){
            System.out.println("maaş artisi: " + ((salary) - salary + salary * 0.1));
        }else if (2021 - hireYear > 19){
            System.out.println("maaş artisi: " + ((salary) - salary + salary * 0.15));
        }
    }

    @Override
    public String toString() {
        return "" +
                "Adi =' :" + name + '\'' +
                ", Maasi = : " + salary +
                ", Calisma Saati : =" + workHours +
                ", Baslangic yili : =" + hireYear +
                "";
    }
}
