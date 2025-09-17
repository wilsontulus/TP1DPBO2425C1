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
        Barang[] objekBarang;

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

            // Minta masukan input pilihan, dengan error handling jika bukan integer
            try {
                System.out.printf("Masukkan pilihan: ");
                choiceNum = input.nextInt();
                input.nextLine();
            } catch (Exception errorMsg) {
                System.out.println("Masukan harus berupa angka.");
                input.nextLine();
                continue;
            }

            switch(choiceNum) {
                case 1: // Tambah barang

                    break;
                case 2: // Tampilkan list

                    break;
                case 3: // Update barang

                    break;
                case 4: // Hapus barang

                    break;
                case 5: // Cari barang berdasarkan nama

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
