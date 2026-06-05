package Praktikum14;

import java.util.ArrayList;
import java.util.Collections; 

public class DemoArrayList08 {
    public static void main(String[] args) {

        ArrayList<Customer08> customers = new ArrayList<>();
        Customer08 customer1 = new Customer08(1, "Zakia");
        Customer08 customer2 = new Customer08(5, "Budi");
        customers.add(customer1);
        customers.add(customer2);
        
        customers.add(new Customer08(4, "Cica"));
        
        customers.add(2, new Customer08(100, "Rosa"));
        
        System.out.println("Index customer2: " + customers.indexOf(customer2));
        
        Customer08 customer = customers.get(1);
        System.out.println("Nama pada index 1: " + customer.name);
        customer.name = "Budi Utomo";
        
        System.out.println("\n=== Data Sebelum Diurutkan ===");
        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }
        
        // Modifikasi 1: Pengurutan Objek Kustom (Collection of Objects)
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        
        System.out.println("\n=== Data Setelah Diurutkan Berdasarkan Nama (A-Z) ===");
        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

        // Modifikasi 2: Pengurutan Tipe Data Standar (String)
        System.out.println("\n=== Contoh Pengurutan Data String Standar ===");
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        
        System.out.println("Daftar Siswa Sebelum Sort: " + daftarSiswa);
        
        Collections.sort(daftarSiswa);
        
        System.out.println("Daftar Siswa Setelah Sort : " + daftarSiswa);
    }
}