package Tugas;

public class KuliahMahasiswa08 {

    String nim;
    String nama;
    String prodi;
    String kelas;

    public KuliahMahasiswa08 (String nim, String nama, String prodi, String kelas) {
        this.nim   = nim;
        this.nama  = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}