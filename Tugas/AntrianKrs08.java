package Tugas;

public class AntrianKrs08 {

    static final int MAX_ANTRIAN = 10;
    static final int MAX_DPA     = 30;

    KuliahMahasiswa08 [] data;   
    int front;
    int rear;
    int size;             
    int sudahKRS;        

    public AntrianKrs08() {
        this.data     = new KuliahMahasiswa08 [MAX_ANTRIAN];
        this.front    = 0;
        this.rear     = -1;
        this.size     = 0;
        this.sudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_ANTRIAN;
    }

    public void clearAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front    = 0;
            rear     = -1;
            size     = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tambahAntrian(KuliahMahasiswa08  mhs) {
        if (sudahKRS >= MAX_DPA) {
            System.out.println("Kuota DPA sudah penuh (maks " + MAX_DPA + " mahasiswa). Tidak bisa menambah antrian.");
            return;
        }
        if (isFull()) {
            System.out.println("Antrian penuh (maks " + MAX_ANTRIAN + "). Tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % MAX_ANTRIAN;
        data[rear] = mhs;
        size++;
        System.out.println("[+] " + mhs.nama + " berhasil masuk ke antrian. (Posisi: " + size + ")");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }

        System.out.println("\n>>> Memanggil antrian untuk proses KRS...");
        System.out.println("    NIM - NAMA - PRODI - KELAS");

        int dipanggil = 0;
        while (!isEmpty() && dipanggil < 2) {
            if (sudahKRS >= MAX_DPA) {
                System.out.println("Kuota DPA sudah penuh (" + MAX_DPA + " mahasiswa). Proses dihentikan.");
                break;
            }
            KuliahMahasiswa08  mhs = data[front];
            front     = (front + 1) % MAX_ANTRIAN;
            size--;
            sudahKRS++;
            dipanggil++;
            System.out.print("    [" + sudahKRS + "] ");
            mhs.tampilkanData();
        }
        System.out.println(">>> " + dipanggil + " mahasiswa selesai proses KRS.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== Daftar Semua Antrian ===");
        System.out.println("No  NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % MAX_ANTRIAN;
            System.out.print((i + 1) + ".  ");
            data[index].tampilkanData();
        }
        System.out.println("============================");
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== 2 Antrian Terdepan ===");
        System.out.println("No  NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % MAX_ANTRIAN;
            System.out.print((i + 1) + ".  ");
            data[index].tampilkanData();
        }
        System.out.println("==========================");
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== Antrian Paling Akhir ===");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
        System.out.println("============================");
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian : " + size);
    }

    public void cetakSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah KRS: " + sudahKRS);
    }

    public void cetakBelumKRS() {
        int belum = MAX_DPA - sudahKRS;
        System.out.println("Jumlah mahasiswa yang belum KRS (sisa kuota DPA): " + belum);
        System.out.println("  - Dalam antrian sekarang : " + size);
        System.out.println("  - Belum masuk antrian    : " + (belum - size));
    }
}
