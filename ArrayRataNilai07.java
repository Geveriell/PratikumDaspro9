import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tambahan: input jumlah elemen array dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        double total = 0;
        double rata2;   
        int tidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] <= 70) {
                tidakLulus++;
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

        System.out.println("Jumlah mahasiswa yang tidak lulus : " + tidakLulus);

        sc.close();
    }
}
