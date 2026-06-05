package Praktikum14;

import java.util.Stack;

public class StackDemo08 {
    public static void main(String[] args) {
        Book08 book1 = new Book08("1234", "Dasar Pemrograman");
        Book08 book2 = new Book08("7145", "Hafalah Shalat Delisa");
        Book08 book3 = new Book08("3562", "Muhammad Al-Fatih");

        Stack<Book08> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book08 temp = books.peek();
    
        if (temp != null) {
            System.out.println("Peek: " + temp.toString());
        }

        Book08 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("Pop: " + temp2.toString());
        }

        System.out.println("\nSisa data buku pada Stack:");
        for (Book08 book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nDebugging cetak Stack:");
        System.out.println(books);
        
        int posisi = books.search(book1);
        System.out.println("Posisi book1 dari atas Stack adalah: " + posisi);
    }
}