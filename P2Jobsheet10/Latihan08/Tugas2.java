package Latihan08;

public class Tugas2 {
    static int[] data;
    static int front, rear, size, max;

    static void init(int n) {
        max = n; data = new int[max];
        front = -1; rear = -1; size = 0;
    }

    static void enqueue(int dt) {
        if (size == max) { System.out.println("Queue penuh!"); return; }
        if (rear == max - 1) rear = -1;
        rear++;
        data[rear] = dt;
        if (front == -1) front = 0;
        size++;
    }

    static void print() {
        if (front == -1) { System.out.println("Queue kosong!"); return; }
        int i = front, count = 0;
        while (count < size) {
            System.out.print(data[i] + " ");
            i = (i + 1) % max;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        init(5);
        enqueue(100);
        enqueue(200);
        enqueue(300);
        print();
    }
}