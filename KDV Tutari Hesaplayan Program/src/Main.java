import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat;
        double kfiyat = 0.0;
        double korani;

        Scanner scanner = new Scanner(System.in);
        System.out.print("KDV'siz fiyat :");
        fiyat = scanner.nextDouble();

        if (fiyat < 1000) {
            korani = 0.18;
            kfiyat += fiyat + fiyat * korani;
        }
        else {
            korani=0.08;
            kfiyat += fiyat + fiyat * korani;
        }


        System.out.println("KDV'li fiyat :"+kfiyat);
        System.out.println("KDV tutarı : :"+korani);

    }
}