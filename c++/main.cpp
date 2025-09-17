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

/* Deklarasi file header custom */
#include "header.hpp"

// Maksimal array yang diinginkan
#define max 255

/* Main driver */

int main() {
    // Deklarasi variabel penghitung ID yang dibuat
    // serta array objek barang

    int idCounter = 0;
    Barang objekBarang[255];

    // Variabel pilihan menu (angka)
    int choiceNum = -1;

    // Tampilkan menu hingga angka 0
    while (choiceNum != 0) {
        // Kumpulan menu
        cout << "Menu Pilihan: " << endl;
        cout << "1. Tambah Barang" << endl;
        cout << "2. Tampilkan List Barang" << endl;
        cout << "3. Update Barang" << endl;
        cout << "4. Hapus Barang" << endl;
        cout << "5. Cari Barang berdasarkan Nama Barang" << endl;
        cout << "0. Keluar dari program" << endl << endl;
        cout << "Masukkan angka pilihan: ";

        // Minta input masukan menu
        cin >>choiceNum;

        // Variable untuk input
        int tempId, tempStock;
        string tempName, tempDesc, tempType;

        // Variable untuk hitungan tampilan barang dan pilihan atribut update
        int tempSuccessfulQueries = 0, tempUpdateSelection = 0;

        // Pilihan menu
        switch(choiceNum) {
            case 1: // Tambah data baru (Nama, deskripsi, tipe, stok)
                cout << "Masukkan nama barang: ";
                cin >>tempName;

                cout << "Masukkan deskripsi barang: ";
                cin >>tempDesc;

                cout << "Masukkan tipe barang: ";
                cin >>tempType;

                cout << "Masukkan stok barang: ";
                cin >>tempStock;

                // Set data sesuai input
                objekBarang[idCounter].setId(idCounter);
                objekBarang[idCounter].setNama(tempName);
                objekBarang[idCounter].setDeskripsi(tempDesc);
                objekBarang[idCounter].setTipe(tempType);
                objekBarang[idCounter].setStok(tempStock);

                // Tampilkan bahwa proses penambahan barang baru sudah selesai
                cout << "Sukses menambahkan barang dengan ID " << idCounter << endl;

                // Naikkan penghitung 1 poin
                idCounter++;
                break;
            case 2: // Tampilkan seluruh list barang dengan ID 0 keatas
                cout << "List barang yang tersedia:" << endl;

                // Query seluruh array barrang
                for (int i = 0; i < max; i++) {
                    if (objekBarang[i].getId() >= 0) {
                        cout << "ID: " << objekBarang[i].getId() << endl;
                        cout << "Nama: " << objekBarang[i].getNama() << endl;
                        cout << "Deskripsi: " << objekBarang[i].getDeskripsi() << endl;
                        cout << "Tipe: " << objekBarang[i].getTipe() << endl;

                        // Untuk stok barang, tampilkan kata "Habis" jika stok di angka 0 atau dibawahnya.
                        // Double newline untuk menyisakan ruang menu selanjutnya
                        if (objekBarang[i].getStok() > 0) {
                            cout << "Stok: " << objekBarang[i].getStok() << endl << endl;
                        } else {
                            cout << "Stok: " << objekBarang[i].getStok() << " (Habis)" << endl << endl;
                        }

                        // Naikkan penghitung untuk indikasi adanya barang
                        tempSuccessfulQueries++;
                    }
                };

                // Jika tidak ada barang tersedia, tampilkan bahwa tidak ada barang yang tersedia.
                // Double newline untuk menyisakan ruang menu selanjutnya
                if (tempSuccessfulQueries == 0) {
                    cout << "Kosong" << endl << endl;
                };
                break;
            case 3: // update data
                // Tampilkan list menu atribut
                cout << "Menu Update Atribut" << endl;
                cout << "1. Nama" << endl;
                cout << "2. Deskripsi" << endl;
                cout << "3. Tipe" << endl;
                cout << "4. Stok" << endl;
                cout << "0. Semua atribut" << endl;
                cout << "Pilih atribut untuk diubah: ";

                // Minta nomor untuk pilihan atribut yang diubah
                cin >> tempUpdateSelection;

                if (tempUpdateSelection >= 0 && tempUpdateSelection <= 4) {
                    cout << "Masukkan ID barang: ";
                    cin >> tempId;

                    // Lanjutkan bila ID barang valid
                    if (objekBarang[tempId].getId() >= 0) {

                        if (tempUpdateSelection >= 0 || tempUpdateSelection <= 4) {
                            if (tempUpdateSelection == 1 || tempUpdateSelection == 0) {
                                cout << "Masukkan nama barang: ";
                                cin >> tempName;
                                objekBarang[tempId].setNama(tempName);
                            }

                            if (tempUpdateSelection == 2 || tempUpdateSelection == 0) {
                                cout << "Masukkan deskripsi barang: ";
                                cin >> tempDesc;
                                objekBarang[tempId].setDeskripsi(tempDesc);
                            }

                            if (tempUpdateSelection == 3 || tempUpdateSelection == 0) {
                                cout << "Masukkan tipe barang: ";
                                cin >> tempType;
                                objekBarang[tempId].setTipe(tempType);
                            }

                            if (tempUpdateSelection == 4 || tempUpdateSelection == 0) {
                                cout << "Masukkan stok barang: ";
                                cin >> tempStock;
                                objekBarang[tempId].setStok(tempStock);
                            }

                            cout << "Sukses mengupdate data dari " << objekBarang[tempId].getNama() << " dengan ID " << tempId << endl;
                        } else {
                            cout << "Pilihan atribut tidak valid" << endl;
                        }
                    } else {
                        cout << "ID barang tidak tersedia" << endl;
                    };
                } else {
                    cout << "Pilihan tidak tersedia" << endl;
                }

                break;
            case 4: // delete data

                cout << "Masukkan ID barang: ";
                cin >> tempId;

                // Lanjutkan bila ID barang valid
                if (objekBarang[tempId].getId() >= 0) {
                    tempName = objekBarang[tempId].getNama();
                    objekBarang[tempId].clear();
                    cout << "Sukses menghapus " << tempName << " dengan ID " << tempId << endl;
                } else {
                    cout << "ID barang tidak tersedia" << endl;
                }

                break;
            case 5:
                cout << "Masukkan nama barang yang ingin dicari: ";
                cin >> tempName;

                tempId = -1;

                for (int i = 0; i < max; i++) {
                    if (objekBarang[i].getId() >= 0 && objekBarang[i].getNama().find(tempName) != tempName.npos) {
                        tempId = objekBarang[i].getId();
                    };
                };

                if (tempId >= 0) {
                    cout << "Sukses menemukan barang dengan ID " << tempId << endl;
                    cout << "Nama: " << objekBarang[tempId].getNama() << endl;
                    cout << "Deskripsi: " << objekBarang[tempId].getDeskripsi() << endl;
                    cout << "Tipe: " << objekBarang[tempId].getTipe() << endl;
                    cout << "Stok: " << objekBarang[tempId].getStok() << endl << endl;
                } else { // Tidak ada barang dengan ID tersebut
                    cout << "Tidak dapat menemukan barang dengan ID " << tempId << endl;
                }
                break;
            case 0: // Keluar program
                cout << "Program selesai digunakan." << endl;
                break;
        }
    };

    // Selesai
    return 0;
}
