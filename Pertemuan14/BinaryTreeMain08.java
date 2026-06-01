package Pertemuan14;

public class BinaryTreeMain08 {
    public static void main(String[] args) {
        BinaryTree08 bst = new BinaryTree08();

        // Menggunakan addRekursif untuk memasukkan data awal sesuai Tugas 1
        bst.addRekursif(new Mahasiswa08("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa08("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa08("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa08("244160220", "Dewi", "B", 3.54));

        System.out.println("Daftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : " + (bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan"));
        System.out.println("Cari mahasiswa dengan ipk: 3.22 : " + (bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan"));

        // Menambahkan mahasiswa lagi menggunakan addRekursif sesuai Tugas 1
        bst.addRekursif(new Mahasiswa08("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa08("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa08("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        // Memanggil method baru untuk memunculkan output Tugas 2 & Tugas 3
        System.out.println("\n==========================================");
        bst.cariMinIPK(); // Memanggil output Tugas 2 (IPK Terkecil)
        
        System.out.println("==========================================");
        bst.cariMaxIPK(); // Memanggil output Tugas 2 (IPK Terbesar)
        
        System.out.println("==========================================");
        bst.tampilMahasiswaIPKdiAtas(3.50); // Memanggil output Tugas 3 (Batas IPK di atas 3.50)
        System.out.println("==========================================");

        System.out.println("\nPenghapusan data mahasiswa\n");
        bst.delete(3.57);

        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}