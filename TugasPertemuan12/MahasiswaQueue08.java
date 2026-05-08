package TugasPertemuan12;

public class MahasiswaQueue08 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    int nomorAntrian;

    public MahasiswaQueue08() {}

    public MahasiswaQueue08(String nim, String nama, String kelas, double ipk, int nomorAntrian) {
        this.nim           = nim;
        this.nama          = nama;
        this.kelas         = kelas;
        this.ipk           = ipk;
        this.nomorAntrian  = nomorAntrian;
    }

    public void tampilInformasi() {
        System.out.printf("[%d] %-15s %-15s %-5s %.1f%n",
                nomorAntrian, nama, nim, kelas, ipk);
    }
}