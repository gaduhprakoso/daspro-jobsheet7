import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

    do {
        System.out.print("1.mobil\n2.motor\n0.keluar\nMasukkan jenis kendaraan anda: ");
        jenis = sc.nextInt();
        if (jenis == 0) {
            break;
        }
        if (jenis == 1 || jenis == 2) {
            System.out.print("Durasi parkir dalam jam: ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000; 
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
        }
        System.out.println("Biaya parkir : Rp." + total);
        } while (jenis != 0);        
        sc.close();
    }
}