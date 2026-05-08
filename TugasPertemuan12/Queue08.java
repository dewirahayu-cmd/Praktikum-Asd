package TugasPertemuan12;

public class Queue08 {

    NodeQueue08 front; 
    NodeQueue08 rear;  
    int size;          
    int maxSize;       
    int counterAntrian; 

    public Queue08(int maxSize) {
        this.front          = null;
        this.rear           = null;
        this.size           = 0;
        this.maxSize        = maxSize;
        this.counterAntrian = 0;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public boolean isFull() {
        return (size >= maxSize);
    }

    public void clearQueue() {
        front = null;
        rear  = null;
        size  = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(MahasiswaQueue08 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mahasiswa " + mhs.nama + " tidak dapat masuk antrian.");
            return;
        }
        counterAntrian++;
        mhs.nomorAntrian = counterAntrian;

        NodeQueue08 newNode = new NodeQueue08(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear  = newNode;
        } else {
            rear.next = newNode;
            rear      = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian dengan nomor: " + mhs.nomorAntrian);
    }

    public MahasiswaQueue08 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil.");
            return null;
        }
        MahasiswaQueue08 dipanggil = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        size--;
        System.out.println("Memanggil antrian nomor " + dipanggil.nomorAntrian + " : " + dipanggil.nama);
        return dipanggil;
    }

    public void tampilFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada antrian terdepan.");
        } else {
            System.out.print("Antrian terdepan  : ");
            front.data.tampilInformasi();
        }
    }

    public void tampilRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada antrian paling akhir.");
        } else {
            System.out.print("Antrian paling akhir : ");
            rear.data.tampilInformasi();
        }
    }

    public void tampilJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== Daftar Antrian Layanan Unit Kemahasiswaan ===");
            NodeQueue08 tmp = front;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("=================================================");
        }
    }
}