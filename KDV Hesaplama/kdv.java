import java.util.Scanner;

public class kdv {
public static void main(String[] args) {
 
    Scanner al = new Scanner(System.in);

    double kdvOrani = 1.18, kdvsiz, kdvli;


    System.out.println("Fiyat giriniz: ");
    kdvsiz = al.nextDouble();
    
    

    if (kdvsiz <= 1000)
    {

        System.out.println("KDV'siz Fiyat: " + kdvsiz);


        kdvli = kdvsiz * kdvOrani;
        System.out.println("KDV'li Fiyat: " + kdvli);
    
    
        kdvOrani = kdvli - kdvsiz;
        System.out.println("KDV Tutarı: " + kdvOrani);



    } else {

        System.out.println("KDV'siz Fiyat: " + kdvsiz);

        kdvOrani = 1.08;
        kdvli = kdvsiz * kdvOrani;
        System.out.println("KDV'li Fiyat: " + kdvli);
    
    
        kdvOrani = kdvli - kdvsiz;
        System.out.println("KDV Tutarı: " + kdvOrani);

    }
    

}   
}