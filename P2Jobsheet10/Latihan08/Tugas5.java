package Latihan08;

import java.util.Scanner;
import java.util.Stack;

public class Tugas5 {
    static int[] data;
    static int front, rear, size, max;

    static void init(int n) {
        max = n; data = new int[max];
        front = -1; rear = -1; size = 0;
    }

    static boolean isEmpty() { return size == 0; }

    static void enqueue(int dt) {
        if (size == max) { System.out.println("Queue penuh!"); return; }
        if (rear == max - 1) rear = -1;
        rear++;
        data[rear] = dt;
        if (front == -1) front = 0;
        size++;
    }

    static int dequeue() {
        if (isEmpty()) { System.out.println("Queue kosong!"); return -1; }
        int val = data[front];
        if (front == rear) { front = -1; rear = -1; }
        else front = (front + 1) % max;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init(5);

        System.out.print("Masukkan ID buku 1: "); enqueue(sc.nextInt());
        System.out.print("Masukkan ID buku 2: "); enqueue(sc.nextInt());
        System.out.print("Masukkan ID buku 3: "); enqueue(sc.nextInt());

        Stack<Integer> arsip = new Stack<>();
        while (!isEmpty()) {
            arsip.push(dequeue());
        }

        System.out.println("Top arsip Stack: " + arsip.peek());

        sc.close();
    }
}
