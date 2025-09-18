# Tugas Praktikum DPBO #1

Dibuat untuk menyelesaikan TP1 DPBO

## Janji

Saya Willsoon Tulus Parluhutan Simanjuntak dengan NIM 2404756 mengerjakan evaluasi Tugas Praktikum 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. 

Aamiin.

## Penjelasan Desain dan Code Flow

Program memiliki satu kelas bernama "Barang", sesuai dengan peta UML berikut:

![Peta UML untuk kelas Barang](docs/uml_class_barang.svg)

Variabel tersebut terdiri dari:

1. ID (int)
2. Nama (string)
3. Deskripsi (string)
4. Tipe (string)
5. Stok (int)

Untuk versi CLI memiliki menu sebagai berikut:

1. Tambah barang
2. Tampilkan List Barang
3. Update Barang
4. Hapus Barang
5. Cari Barang (berdasarkan nama barang)
0. Keluar dari program

## Deskripsi kode program

Untuk C++, Java, dan Python, menggunakan CLI dan memiliki tampilan antarmuka yang sama. 

Terdapat ketentuan operasional untuk versi CLI:

- Untuk C++, Penyimpanan barang menggunakan Array of Objects, dan memiliki batas sebanyak 1024 barang yang berbeda.
- Untuk Java dan Python, tidak ada batasan yang ditentukan mengenai seberapa banyaknya barang bisa dimasukkan. (Untuk Java menggunakan ArrayList, sedangkan Python menggunakan Array of Objects namun dengan limit yang jauh lebih besar tergantung instalasi Python yang digunakan).
- Update barang bisa memilih satu atribut, atau seluruh atribut sekaligus.
- Menghapus barang tidak akan mensortir ulang ID barang yang ada.
- Pencarian barang dilakukan berdasarkan kandungan string inputan di nama barang.

Untuk PHP, menggunakan Web GUI dan memiliki tampilan antarmuka berupa tabel. Data disimpan dalam satu sesi saja mengunakan $_SESSION dan tidak menggunakan sistem manajemen basis data seperti MariaDB dan sejenisnya.

## Preview operasional program

C++:

![Preview C++](docs/preview_cplusplus.webp)

Java:

Python:

PHP:
