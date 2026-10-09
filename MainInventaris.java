/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produk;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Decarabia
 */
public class MainInventaris {
    public static void main(String[] args){
        
        ArrayList<Produk> daftarInventaris = new ArrayList<>();
        daftarInventaris.add(new Produk ("P001", "Meja", "Kg", 3));
        daftarInventaris.add(new Produk ("P002", "Kursi", "Kg", 5));
        daftarInventaris.add(new Produk ("P003", "Air Galon", "Liter", 6));
        daftarInventaris.add(new Produk ("P004", "Monitor", "kg", 3));
        daftarInventaris.add(new Produk ("P005", "Minyak", "Liter", 3));
        
        System.out.println("Daftar Produk");
        for (Produk p : daftarInventaris){
            p.tampilkanData();
        }
        
        System.out.println("Total :" + daftarInventaris.size());
        
        HashMap<String, Produk> mapInventaris = new HashMap<>();
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            System.out.println(p.getNama()
            + " - stok: " + p.getStok());
        }
        
        String getKode = "P001";
        if (mapInventaris.containsKey(getKode)){
            mapInventaris.get(getKode).tampilkanData();
        }
        
        daftarInventaris.remove(0);
        System.out.println("Setelah hapus index 0");
        for(Produk p : daftarInventaris) {
            p.tampilkanData();
        }
        System.out.println("Total Setelah di hapus :" + daftarInventaris.size());
    }
}
