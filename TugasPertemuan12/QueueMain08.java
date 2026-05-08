package TugasPertemuan12;

import java.util.Scanner;

public class QueueMain08 {

    static Scanner sc = new Scanner(System.in);
    static Queue08 antrian = new Queue08(10); 

    public static void main(String[] args) {
        int pilihan;

        System.out.println("============================================");
        System.out.println("  Sistem Antrian Layanan Unit Kemahasiswaan ");
        System.out.println("============================================");

        do {
            tampilMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            System.out.println();

            switch (pilihan) {
                case 1:
                    daftarMahasiswa();
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilFront();
                    antrian.tampilRear();
                    break;
                case 4:
                    antrian.tampilJumlahAntrian();
                    break;
                case 5:
                    antrian.tampilAntrian();
                    break;
                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong.");
                    }
                    break;
                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Antrian PENUH.");
                    } else {
                        System.out.println("Antrian BELUM penuh.");
                    }
                    break;
                case 8:
                    antrian.clearQueue();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();

        } while (pilihan != 0);

        sc.close();
    }

    // Menu tampilan
    static void tampilMenu() {
        System.out.println("--------------------------------------------");
        System.out.println("1. Daftar Antrian (Enqueue)");
        System.out.println("2. Panggil Antrian (Dequeue)");
        System.out.println("3. Tampil Antrian Terdepan & Paling Akhir");
        System.out.println("4. Tampil Jumlah Antrian");
        System.out.println("5. Tampil Seluruh Antrian");
        System.out.println("6. Cek Antrian Kosong");
        System.out.println("7. Cek Antrian Penuh");
        System.out.println("8. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("--------------------------------------------");
    }

    static void daftarMahasiswa() {
        System.out.println("--- Pendaftaran Antrian ---");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        MahasiswaQueue08 mhs = new MahasiswaQueue08(nim, nama, kelas, ipk, 0);
        antrian.enqueue(mhs);
    }
}