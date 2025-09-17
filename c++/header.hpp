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

/* Deklarasi header */
#include <iostream>
#include <string>

/* Deklarasi tipe namespace */

using namespace std;

/* Deklarasi kelas */

class Barang {
    // Kelas private untuk variabel objek barang
    private:
        int id;
        string nama;
        string deskripsi;
        string tipe;
        int stok;

    // Kelas public untuk fungsi dari objek barang
    public:
        // Konstruktor
        Barang();

        // Fungsi setter (write)
        void setId(int id);
        void setNama(string nama);
        void setDeskripsi(string deskripsi);
        void setTipe(string tipe);
        void setStok(int stok);
        void clear();

        // Fungsi getter (read)
        int getId();
        string getNama();
        string getDeskripsi();
        string getTipe();
        int getStok();

        // Destruktor
        ~Barang();
};
