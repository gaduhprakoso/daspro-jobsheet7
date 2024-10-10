import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, tiketTerjual = 0;
        double harga = 50000, totalHarga, pendapatan = 0;
        String berhenti;

        do {
            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();
            
            if (tiket < 0) {
                System.out.println("jumlah tiket tidak valid, tolong ulangi.");
                continue;
            }

            totalHarga = harga * tiket;

            if (tiket > 10) {
                totalHarga -= (totalHarga* 0.15);
            } else if (tiket > 4) {
                totalHarga -= (totalHarga* 0.1);
            }

            tiketTerjual += tiket;
            pendapatan += totalHarga;

            System.out.println("Total harga untuk " + tiket + " tiket: Rp." + totalHarga);

            System.out.print("apakah anda ingin berhenti (y/n) ?: ");
            sc.nextLine();
            berhenti = sc.nextLine();
            if (berhenti.equalsIgnoreCase("y")) {
                break;
            }

        } while(true);
        System.out.println("\n_Rangkuman Penjualan Hari ini_");
        System.out.println("Total tiket terjual hari ini: " + tiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp." + pendapatan);
        sc.close();
    }
}

