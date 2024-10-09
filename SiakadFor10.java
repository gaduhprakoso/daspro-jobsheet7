import java.util.Scanner;

public class SiakadFor10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai, tertinggi = 0, terendah = 100, batas = 60;
        int lulus = 0, gagal = 0;
    
    for (int i = 1; i <= 10; i++) {
        System.out.print("masukan nilai mahasiswa ke-"+ i +":");
        nilai = sc.nextDouble();
        if (nilai > tertinggi){
            tertinggi = nilai;
        }
        if (nilai < terendah){
            terendah = nilai;
        }
        if (nilai >= batas){
            lulus++;
        }else{
            gagal++;
        }
    }
    System.out.println("Nilai tertinggi: "+ tertinggi);
    System.out.println("Nilai terendah: "+ terendah);
    System.out.println("Jumlah Mahasiswa Lulus: "+ lulus);
    System.out.println("Jumlah mahasiswa Tidak Lulus: "+ gagal);
    }
}