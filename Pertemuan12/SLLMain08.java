package Pertemuan12;

public class SLLMain08 {
    public static void main(String[] args) {

        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("22212202", "Cintia",  "3C", 3.5);
        Mahasiswa08 mhs3 = new Mahasiswa08("23212201", "Bimon",   "2B", 3.8);
        Mahasiswa08 mhs4 = new Mahasiswa08("21212203", "Dirga",   "4D", 3.6);

        // Cetak pertama (list masih kosong)
        sll.print();

        // addFirst: Dirga masuk ke depan
        sll.addFirst(mhs4);
        sll.print();

        // addLast: Alvaro masuk ke belakang
        sll.addLast(mhs1);
        sll.print();

        // insertAfter: Bimon masuk setelah Dirga
        sll.insertAfter("Dirga", mhs3);

        // insertAt: Cintia masuk di index 2
        sll.insertAt(2, mhs2);
        sll.print();

    }
}
