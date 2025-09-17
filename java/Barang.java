/*
 * LICENSE: All Rights Reserved
 * (c) 2025 Willsoon Tulus P. Simanjuntak
 * (c) 2025 Universitas Pendidikan Indonesia
 *
 * Saya Willsoon Tulus Parluhutan Simanjuntak mengerjakan evaluasi
 * Tugas Praktikum 1 dalam mata kuliah Desain Pemrograman
 * Berorientasi Objek untuk keberkahanNya maka saya tidak
 * melakukan kecurangan seperti yang telah dispesifikasikan.
 * Aamiin.
 */

/* Deklarasi kelas Barang */

class Barang {
    // Deklarasi variabel kelas objek
    private int id;
    private String nama;
    private String deskripsi;
    private String tipe;
    private int stok;

    // Konstruktor, objek baru selalu memiliki ID -1
    Barang() {
        this.id = -1;
        this.nama = "";
        this.deskripsi = "";
        this.tipe = "";
        this.stok = 0;
    }

    // Fungsi setter untuk menentukan atribut barang

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void clear() {
        this.id = -1;
        this.nama = "";
        this.deskripsi = "";
        this.tipe = "";
        this.stok = 0;
    }

    // Fungsi getter untuk mendapatkan atribut barang

    public int getID() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public String getTipe() {
        return this.tipe;
    }

    public int getStok() {
        return this.stok;
    }
}
