package Hipotenus;

import java.util.Scanner;

public class hipotenus {
public static void main(String[] args) {
    
    int a, b, c;
    double d, e;

    Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = girdi.nextInt();

        System.out.print("3. Kenarı giriniz: ");
        c = girdi.nextInt();

        d = (a + b + c) /2;

        e = (d * (d - a) * (d - b) * (d - c));
  
    System.out.println("Üçgenin Alanı: " + e);
}
}
