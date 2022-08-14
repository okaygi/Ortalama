import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, toplam;
        double armutkg = 2.14, elmakg = 3.67, domateskg = 1.11 , muzkg = 0.95, patlicankg = 5;


        System.out.print("Armut Kaç Kilo: ");
        armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo: ");
        elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo: ");
        domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo: ");
        muz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = scanner.nextDouble();

        armut = armut * armutkg;
        elma = elma * elmakg;
        domates = domates * domateskg;
        muz = muz * muzkg;
        patlican = patlican * patlicankg;
        toplam = armut + elma + domates + muz + patlican;

        System.out.println("Toplam Tutar: " + toplam + " TL");

    }
}

/*
Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */