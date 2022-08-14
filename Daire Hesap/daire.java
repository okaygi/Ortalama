import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        
        int r, a;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarı çap giriniz: ");
        r = scanner.nextInt();
        System.out.print("Merkez açısı giriniz: ");
        a = scanner.nextInt();
         
        System.out.println("Sonuç: " + (pi * (r*r) * a) / 360);


    }
}
