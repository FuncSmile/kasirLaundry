/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke8.laundrydemo;

/**
 *
 * @author USER
 */
public class TempStorage {

    private final int noUrut;
    private final String nama;
    private final String jenisLayanan;
    private final double berat;
    private final double totalHarga;

    public TempStorage(int noUrut, String nama, String jenisLayanan, double berat, double totalHarga) {
        this.noUrut = noUrut;
        this.nama = nama;
        this.jenisLayanan = jenisLayanan;
        this.berat = berat;
        this.totalHarga = totalHarga;
    }

    public Object[] toObjectArray() {
        return new Object[]{noUrut, nama, jenisLayanan, berat, totalHarga};
    }

    public int getNoUrut() {
        return noUrut;
    }

    public String getNama() {
        return nama;
    }

    public double getBerat() {
        return berat;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

}
