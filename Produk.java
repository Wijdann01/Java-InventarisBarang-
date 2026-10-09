/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produk;

/**
 *
 * @author Decarabia
 */
public class Produk {
    
    private String kode_Barang;
    private String nama_Barang;
    private String Satuan;
    private int Stok;
    
    public Produk(String kode, String nama, String Satuan, int Jumlah){
        this.kode_Barang = kode;
        this.nama_Barang = nama;
        this.Satuan = Satuan;
        this.Stok = Jumlah;   
    }
    
    public String getKode() { return kode_Barang; }
    public String getNama() { return nama_Barang; }
    public String getSatuan() {return Satuan; }
    public int getStok() { return Stok; }
    
    public void tampilkanData(){
        System.out.println("Kode Barang :" + kode_Barang + "| Nama Barang :" + nama_Barang + "| Satuan :" + Satuan + "| Stok : " + Stok + "|");
    };    
}
