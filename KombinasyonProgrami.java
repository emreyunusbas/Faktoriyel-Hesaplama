import java.util.Scanner;

public class KombinasyonProgrami {
    // Faktöriyel hesaplama metodu
    public static int faktoriyel(int sayi) {
        int faktoriyel = 1;
        int i = 1;
        do {
            faktoriyel *= i;
            i++;
        } while (i <= sayi);
        return faktoriyel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını girin: ");
        int n = scanner.nextInt();

        System.out.print("r sayısını girin: ");
        int r = scanner.nextInt();

        // Kombinasyon hesaplama
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));

        // Sonucu ekrana yazdırma
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}