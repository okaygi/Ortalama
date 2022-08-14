import java.util.Scanner;


public class Ortalama {
public static void main(String[] args) {

    int mat, fiz, kim, turk, tar, muz;
    

    try (Scanner inp = new Scanner(System.in)) {
        System.out.println("Matematik giriş: ");
         mat = inp.nextInt( );
         System.out.println("Fizik giriş: ");
         fiz = inp.nextInt( );
         System.out.println("Kimya giriş: ");
         kim = inp.nextInt( );
         System.out.println("Türkçe giriş: ");
         turk = inp.nextInt( );
         System.out.println("Tarih giriş: ");
         tar = inp.nextInt( );
         System.out.println("Müzik giriş: ");
         muz = inp.nextInt( );
    }

    int toplam = (mat+fiz+kim+turk+tar+muz)/6;

    boolean ortalama = toplam >60;

     System.out.println(ortalama == true ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    


     
}
}