import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;   
        int lulus = 0; // Tambahan: untuk menghitung mahasiswa dengan nilai > 70

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();

            // Tambahan: cek apakah mahasiswa lulus
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        // penjumlahan seluruh nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata nilai
        rata2 = total / nilaiMhs.length;

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata nilai = " + rata2);

        // Tambahan: menampilkan jumlah mahasiswa yang lulus (>70)
        System.out.println("Jumlah mahasiswa yang lulus : " + lulus);

        sc.close();
    }
}
