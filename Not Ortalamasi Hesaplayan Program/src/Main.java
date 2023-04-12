import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] notlar = new int[6];
        int toplam = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " dersi sınav puanınızı girin: ");
            notlar[i] = scanner.nextInt();
            toplam += notlar[i];
        }

        double ortalama = (double) toplam / dersler.length;
        System.out.println("Ders ortalaması: " + ortalama);
    }
}