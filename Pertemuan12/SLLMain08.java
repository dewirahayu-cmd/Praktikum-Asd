package Pertemuan12;

public class SLLMain08 {
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

        sll.insertAt(1, mhs2);
        sll.insertAfter("Cintia", mhs3);
        sll.print();

        System.out.print("data index 1 : ");
        System.out.println();
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}