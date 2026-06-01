package Latihan08;

public class Tugas4 {
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

    static int dequeue() {
        if (front == -1) { System.out.println("Queue kosong!"); return -1; }
        int val = data[front];
        if (front == rear) {
            front = -1; rear = -1; 
        } else {
            front = (front + 1) % max;
        }
        size--;
        return val;
    }

    public static void main(String[] args) {
        init(5);
        enqueue(101);
        enqueue(102);
        enqueue(103);

        System.out.println("Dequeue: " + dequeue());
        System.out.println("Dequeue: " + dequeue());
        System.out.println("Dequeue: " + dequeue());

        System.out.println("front = " + front); 
        System.out.println("rear  = " + rear);  
     
    }
}