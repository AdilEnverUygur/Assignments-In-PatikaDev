package fruitererCashierProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyati = 2.14, elmaFiyati = 3.67, domatesFiyati = 1.11, muzFiyati = 0.95,patlicanFiyati = 5.00,toplamTutar;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo? :");
        armutKg = input.nextInt();
        System.out.print("Elma Kac Kilo? :");
        elmaKg = input.nextInt();
        System.out.print("Domates Kac Kilo? :");
        domatesKg = input.nextInt();
        System.out.print("Muz Kac Kilo? :");
        muzKg = input.nextInt();
        System.out.print("Patlican Kac Kilo? :");
        patlicanKg = input.nextInt();

        toplamTutar = (armutKg * armutFiyati) + (elmaKg * elmaFiyati) + (domatesKg * domatesFiyati) + (muzKg * muzFiyati) + (patlicanKg * patlicanFiyati);
        System.out.println("Toplam Tutar: " + toplamTutar + "TL");


    }
}
