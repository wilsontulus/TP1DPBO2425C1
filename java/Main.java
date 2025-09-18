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

/* Deklarasi library */

import java.util.ArrayList;
import java.util.Scanner;

/* Deklarasi "kelas" fungsi utama */

public class Main {
    public static void main(String[] args) {
        /* Deklarasi variabel array objek barang */
        ArrayList<Barang> listObjekBarang = new ArrayList<Barang>();

        /* Deklarasi variabel penghitung ID dan angka pilihan menu */
        int idCounter = 0;
        int choiceNum = -1;

        /* Deklarasi objek untuk input CLI */
        Scanner input = new Scanner(System.in);

        // Tampilkan menu hingga angka 0
        while (choiceNum != 0)
        {
            System.out.println("Menu Pilihan: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan List Barang");
            System.out.println("3. Update Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Cari Barang berdasarkan Nama Barang");
            System.out.println("0. Keluar dari program");

            // Minta masukan input pilihan, dengan error handling jika bukan bilangan integer
            try {
                System.out.printf("Masukkan pilihan: ");
                choiceNum = input.nextInt();
                input.nextLine();
            } catch (Exception errorMsg) {
                System.out.println("Masukan harus berupa angka.");
                input.nextLine();
                continue;
            }


            // Variable untuk input
            int tempId = -1, tempStock = -1;
            String tempName, tempDesc, tempType;

            // Variable untuk hitungan tampilan barang dan pilihan atribut update
            int tempSuccessfulQueries = 0, tempUpdateSelection = 0;

            switch(choiceNum) {
                case 1: // Tambah data baru (Nama, deskripsi, tipe, stok)
                    System.out.printf("Masukkan nama barang: ");
                    tempName = input.next();
                    input.nextLine();

                    System.out.printf("Masukkan deskripsi barang: ");
                    tempDesc = input.next();
                    input.nextLine();

                    System.out.printf("Masukkan tipe barang: ");
                    tempType = input.next();
                    input.nextLine();

                    System.out.printf("Masukkan stok barang: ");
                    tempStock = input.nextInt();
                    input.nextLine();

                    // Inisialisasi variabel sementara
                    Barang tempBarang = new Barang();

                    // Set data sesuai input
                    tempBarang.setId(idCounter);
                    tempBarang.setNama(tempName);
                    tempBarang.setDeskripsi(tempDesc);
                    tempBarang.setTipe(tempType);
                    tempBarang.setStok(tempStock);

                    // Masukkan variabel objek hasil inputan ke list
                    listObjekBarang.add(tempBarang);
                    
                    // Tampilkan bahwa proses penambahan barang baru sudah selesai
                    System.out.println("Sukses menambahkan barang dengan ID " + idCounter);

                    // Naikkan penghitung 1 poin
                    idCounter++;

                    break;
                case 2: // Tampilkan list
                    // Jika tidak ada barang tersedia, tampilkan bahwa tidak ada barang yang tersedia.
                    // Double newline untuk menyisakan ruang menu selanjutnya
                    if (listObjekBarang.size() <= 0) {
                        System.out.println("Kosong\n");
                    } else {
                        System.out.println("List barang yang tersedia:");

                        // Query seluruh list barrang
                        for (int i = 0; i < listObjekBarang.size(); i++) {
                            if (listObjekBarang.get(i).getID() >= 0) {
                                System.out.println("ID: " + listObjekBarang.get(i).getID());
                                System.out.println("Nama: " + listObjekBarang.get(i).getNama());
                                System.out.println("Deskripsi: " + listObjekBarang.get(i).getDeskripsi());
                                System.out.println("Tipe: " + listObjekBarang.get(i).getTipe());

                                // Untuk stok barang, tampilkan kata "Habis" jika stok di angka 0 atau dibawahnya.
                                // Double newline untuk menyisakan ruang menu selanjutnya
                                if (listObjekBarang.get(i).getStok() > 0) {
                                    System.out.println("Stok: " + listObjekBarang.get(i).getStok() + "\n");
                                } else {
                                    System.out.println("Stok: " + listObjekBarang.get(i).getStok() + " (Habis)\n");
                                }
                            }
                        };
                    };
                    break;
                case 3: // Update barang
                    // Tampilkan list menu atribut
                    System.out.println("Menu Update Atribut");
                    System.out.println("1. Nama");
                    System.out.println("2. Deskripsi");
                    System.out.println("3. Tipe");
                    System.out.println("4. Stok");
                    System.out.println("0. Semua atribut");

                    // Minta masukan input pilihan, dengan error handling jika bukan bilangan integer
                    try {
                        System.out.printf("Pilih atribut untuk diubah: ");
                        tempUpdateSelection = input.nextInt();
                        input.nextLine();
                    } catch (Exception errorMsg) {
                        System.out.println("Masukan harus berupa angka.");
                        input.nextLine();
                        continue;
                    }
                    
                    if (tempUpdateSelection >= 0 && tempUpdateSelection <= 4) {
                        try {
                            System.out.printf("Masukkan ID barang: ");
                            tempId = input.nextInt();
                            input.nextLine();
                        } catch (Exception errorMsg) {
                            System.out.println("Masukan harus berupa angka.");
                            input.nextLine();
                            continue;
                        }

                        // Lanjutkan bila ID barang valid

                        if (tempId >= 0 && tempId < listObjekBarang.size() && listObjekBarang.get(tempId).getID() >= 0) {
                            
                            if (tempUpdateSelection == 1 || tempUpdateSelection == 0) {
                                System.out.printf("Masukkan nama barang: ");
                                tempName = input.next();
                                listObjekBarang.get(tempId).setNama(tempName);
                            };
                            
                            if (tempUpdateSelection == 2 || tempUpdateSelection == 0) {
                                System.out.printf("Masukkan deskripsi barang: ");
                                tempDesc = input.next();
                                listObjekBarang.get(tempId).setDeskripsi(tempDesc);
                            };
                            
                            if (tempUpdateSelection == 3 || tempUpdateSelection == 0) {
                                System.out.printf("Masukkan tipe barang: ");
                                tempType = input.next();
                                listObjekBarang.get(tempId).setTipe(tempType);
                            };
                            
                            if (tempUpdateSelection == 4 || tempUpdateSelection == 0) {
                                System.out.printf("Masukkan stok barang: ");
                                tempStock = input.nextInt();
                                listObjekBarang.get(tempId).setStok(tempStock);
                            };

                            // Umumkan bahwa data barang sudah di-update
                            System.out.println("Sukses mengupdate data dari " + listObjekBarang.get(tempId).getNama() + " dengan ID " + tempId);
                        } else { // Batalkan jika ID barang tidak tersedia
                            System.out.println("ID barang tidak tersedia");
                        };

                    } else { // Batalkan jika pilihan tidak sesuai
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 4: // Hapus barang
                    // Minta input ID barang
                    try {
                        System.out.printf("Masukkan ID barang: ");
                        tempId = input.nextInt();
                        input.nextLine();
                    } catch (Exception errorMsg) {
                        System.out.println("Masukan harus berupa angka.");
                        input.nextLine();
                        continue;
                    }

                    // Lanjutkan bila ID barang valid
                    if (tempId >= 0 && tempId < listObjekBarang.size() && listObjekBarang.get(tempId).getID() >= 0) {
                        // Simpan nama untuk ditampilkan
                        tempName = listObjekBarang.get(tempId).getNama();

                        // Lakukan operasi hapus objek barang
                        listObjekBarang.remove(tempId);

                        // Umumkan jika berhasil tanpa error
                        System.out.println("Sukses menghapus " + tempName + " dengan ID " + tempId);
                    } else { // Batalkan jika ID barang tidak tersedia
                        System.out.println("ID barang tidak tersedia");
                    };
                    break;
                case 5: // Cari barang berdasarkan nama
                    // Jika tidak ada barang tersedia, tampilkan bahwa tidak ada barang yang tersedia.
                    // Double newline untuk menyisakan ruang menu selanjutnya
                    if (listObjekBarang.size() <= 0) {
                        System.out.println("List data barang masih kosong\n");
                    } else {
                        System.out.printf("Masukkan nama barang: ");
                        tempName = input.next();

                        // Pencarian nama barang ke seluruh array
                        for (int i = 0; i < listObjekBarang.size(); i++) {
                            if (listObjekBarang.get(i).getID() >= 0 && listObjekBarang.get(i).getNama().contains(tempName)) {
                                System.out.println("ID: " + listObjekBarang.get(i).getID());
                                System.out.println("Nama: " + listObjekBarang.get(i).getNama());
                                System.out.println("Deskripsi: " + listObjekBarang.get(i).getDeskripsi());
                                System.out.println("Tipe: " + listObjekBarang.get(i).getTipe());

                                // Untuk stok barang, tampilkan kata "Habis" jika stok di angka 0 atau dibawahnya.
                                // Double newline untuk menyisakan ruang menu selanjutnya
                                if (listObjekBarang.get(i).getStok() > 0) {
                                    System.out.println("Stok: " + listObjekBarang.get(i).getStok() + "\n");
                                } else {
                                    System.out.println("Stok: " + listObjekBarang.get(i).getStok() + " (Habis)\n");
                                };

                                // Naikkan penghitung jumlah barang yang ditemukan
                                tempSuccessfulQueries++;
                            };
                        };

                        if (tempSuccessfulQueries > 0) {
                            System.out.println("Sukses menemukan " + tempSuccessfulQueries + " barang dengan nama yang mengandung \"" + tempName + "\"");
                        } else {
                            System.out.println("Tidak dapat menemukan barang dengan nama yang mengandung \"" + tempName + "\"");
                        }
                    }
                    break;
                case 0: // Sambutan keluar program
                    System.out.println("Program selesai digunakan.");
                    break;
                default: // Peringatkan jika diluar pilihan
                    System.out.println("Masukan harus sesuai dengan menu yang ditentukan (0-5).");
                    break;
            }
        }

        /* Selesai */
        input.close();
    }
}
