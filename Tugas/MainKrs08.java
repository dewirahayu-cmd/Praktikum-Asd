package Tugas;

import java.util.Scanner;

public class MainKrs08 {

    static void tampilkanMenu() {
        System.out.println("\n____________________________________________");
        System.out.println("     SISTEM ANTRIAN PERSETUJUAN KRS - DPA     ");
        System.out.println("______________________________________________");
        System.out.println("  1.  Tambah Mahasiswa ke Antrian             ");
        System.out.println("  2.  Panggil Antrian (Proses KRS - 2 mhs)    ");
        System.out.println("  3.  Tampilkan Semua Antrian                 ");
        System.out.println("  4.  Tampilkan 2 Antrian Terdepan            ");
        System.out.println("  5.  Tampilkan Antrian Paling Akhir          ");
        System.out.println("  6.  Cek Antrian Kosong                      ");
        System.out.println("  7.  Cek Antrian Penuh                       ");
        System.out.println("  8.  Kosongkan Antrian                       ");
        System.out.println("  9.  Cetak Jumlah Antrian                    ");
        System.out.println("  10. Cetak Jumlah yang Sudah KRS             ");
        System.out.println("  11. Cetak Jumlah yang Belum KRS             ");
        System.out.println("  0.  Keluar                                  ");
        System.out.println("______________________________________________");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc      = new Scanner(System.in);
        AntrianKrs08 antrian = new AntrianKrs08();
        int pilihan;

        System.out.println("==============================================");
        System.out.println("  SISTEM ANTRIAN PERSETUJUAN KRS MAHASISWA");
        System.out.println("  Kapasitas Antrian : " +AntrianKrs08.MAX_ANTRIAN + " mahasiswa");
        System.out.println("  Kuota per DPA     : " +AntrianKrs08.MAX_DPA + " mahasiswa");
        System.out.println("==============================================");

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {

                case 1: // Tambah mahasiswa ke antrian
                    System.out.println("\n--- Tambah Mahasiswa ke Antrian ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    KuliahMahasiswa08 mhs = new KuliahMahasiswa08(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2: // Panggil antrian proses KRS (2 mahasiswa)
                    antrian.panggilAntrian();
                    break;

                case 3: // Tampilkan semua antrian
                    antrian.tampilkanSemua();
                    break;

                case 4: // Tampilkan 2 antrian terdepan
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5: // Tampilkan antrian paling akhir
                    antrian.tampilkanAkhir();
                    break;

                case 6: // Cek antrian kosong
                    if (antrian.isEmpty()) {
                        System.out.println("Status: Antrian KOSONG.");
                    } else {
                        System.out.println("Status: Antrian TIDAK kosong. (Isi: " + antrian.size + ")");
                    }
                    break;

                case 7: // Cek antrian penuh
                    if (antrian.isFull()) {
                        System.out.println("Status: Antrian PENUH.");
                    } else {
                        System.out.println("Status: Antrian BELUM penuh. (Isi: " + antrian.size + "/" +AntrianKrs08.MAX_ANTRIAN + ")");
                    }
                    break;

                case 8: // Kosongkan antrian
                    antrian.clearAntrian();
                    break;

                case 9: // Cetak jumlah antrian
                    antrian.cetakJumlahAntrian();
                    break;

                case 10: // Cetak jumlah yang sudah KRS
                    antrian.cetakSudahKRS();
                    break;

                case 11: // Cetak jumlah yang belum KRS
                    antrian.cetakBelumKRS();
                    break;

                case 0: // Keluar
                    System.out.println("\n=== Rekap Akhir ===");
                    antrian.cetakJumlahAntrian();
                    antrian.cetakSudahKRS();
                    antrian.cetakBelumKRS();
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}