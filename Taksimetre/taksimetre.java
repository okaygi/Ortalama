package Taksimetre;

import java.util.Scanner;


public class taksimetre {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int acilis = 10;
        double km, kmUcreti = 2.2, toplam;

        System.out.print("Km giriniz: ");
        km = scanner.nextDouble();


        toplam = (km * kmUcreti) + acilis;


        if (toplam <= 20) {

            System.out.println("Ödenecek tutar: 20 TL'dir.");

        } else {

            System.out.println("Ödenecek tutar: " + toplam + " TL'dir.");

        }

    }
}
