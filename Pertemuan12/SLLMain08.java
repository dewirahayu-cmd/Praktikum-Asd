package Pertemuan12;

import java.util.Scanner;

public class SLLMain08 {

    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa08 inputMahasiswaDariKeyboard() {
        System.out.println("--- Input Data Mahasiswa ---");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        return new Mahasiswa08(nim, nama, kelas, ipk);
    }

    public static void menuTambahData(SingleLinkedList08 sll) {
        System.out.println("\n=== Menu Tambah Data ===");
        System.out.println("1. Tambah di depan (addFirst)");
        System.out.println("2. Tambah di belakang (addLast)");
        System.out.println("3. Tambah setelah nama tertentu (insertAfter)");
        System.out.println("4. Tambah pada indeks tertentu (insertAt)");
        System.out.print("Pilih: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        Mahasiswa08 mhs = inputMahasiswaDariKeyboard();

        switch (pilihan) {
            case 1:
                sll.addFirst(mhs);
                break;
            case 2:
                sll.addLast(mhs);
                break;
            case 3:
                System.out.print("Masukkan nama setelah siapa: ");
                String key = sc.nextLine();
                sll.insertAfter(key, mhs);
                break;
            case 4:
                System.out.print("Masukkan indeks: ");
                int index = sc.nextInt();
                sc.nextLine();
                sll.insertAt(index, mhs);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void main(String[] args) {

        SingleLinkedList08 sll = new SingleLinkedList08();
        Mahasiswa08 mhs1 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("22212202", "Cintia",  "3C", 3.5);
        Mahasiswa08 mhs3 = new Mahasiswa08("23212201", "Bimon",   "2B", 3.8);
        Mahasiswa08 mhs4 = new Mahasiswa08("21212203", "Dirga",   "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();


        System.out.println("\n========================================");
        System.out.println(" Modifikasi Tambah Data dari Keyboard ");
        System.out.println("========================================");

        int lanjut;
        do {
            menuTambahData(sll);
            System.out.println("\nHasil linked list setelah penambahan:");
            sll.print();

            System.out.print("Tambah data lagi? (1=Ya / 0=Tidak): ");
            lanjut = sc.nextInt();
            sc.nextLine();
        } while (lanjut == 1);

        System.out.println("Program selesai.");
        sc.close();
    }
}
