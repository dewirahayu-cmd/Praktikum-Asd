package Pertemuan12;

public class SingleLinkedList08 {

    NodeMahasiswa08 head;
    NodeMahasiswa08 tail;

    boolean isEmpty() {
        return (head == null);
    }

    // traverse linked list 
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa08 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // method addFirst() 
    public void addFirst(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // method addLast() 
    public void addLast(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // Memasukkan node dengan data input setelah node yang memiliki data key
    public void insertAfter(String key, Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        NodeMahasiswa08 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    // tambah node pada indeks tertentu 
    public void insertAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa08(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    