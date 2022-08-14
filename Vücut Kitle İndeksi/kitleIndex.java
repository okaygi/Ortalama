import java.util.Scanner;

public class kitleIndex {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double m, x;
        int kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        m = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextInt();


        x = kilo / (m * m);
        System.out.println("Vücut Kitle İndeksiniz: " + x);
    }
}
