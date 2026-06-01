package Latihan08;
import java.util.Scanner;

public class Tugas3 {
    static int[] data;
    static int front, rear, size, max;

    static void init(int n) {
        max = n; data = new int[max];
        front = -1; rear = -1; size = 0;
    }

    static boolean isFull() { return size == max; }

    static void enqueue(int dt) {
        if (isFull()) { System.out.println("Queue penuh!"); return; }
        if (rear == max - 1) rear = -1;
        rear++;
        data[rear] = dt;
        if (front == -1) front = 0;
        size++;
    }

    static void peek() {
        if (front == -1) System.out.println("Queue kosong!");
        else System.out.println("Elemen terdepan: " + data[front]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas: ");
        int n = sc.nextInt();
        init(n);

        System.out.println("Queue penuh? " + isFull());
        enqueue(101);
        peek();
       
        sc.close();
    }
}