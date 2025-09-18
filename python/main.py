# LICENSE: All Rights Reserved
# (c) 2025 Willsoon Tulus P. Simanjuntak
# (c) 2025 Universitas Pendidikan Indonesia
#
# Saya Willsoon Tulus Parluhutan Simanjuntak mengerjakan evaluasi
# Tugas Praktikum 1 dalam mata kuliah Desain Pemrograman
# Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan.
# Aamiin.

# Deklarasi kelas objek Barang #
from barang import Barang

# Deklarasi fungsi utama (main) #

def main():
    # Deklarasi variabel penghitung ID yang dibuat serta array objek Barang
    idCounter = 0
    listObjekBarang = []

    # Variabel pilihan menu (angka)
    choiceNum = -1

    # Tampilan menu hingga angka 0
    while (choiceNum != 0):
        print("Menu Pilihan: ")
        print("1. Tambah Barang")
        print("2. Tampilkan List Barang")
        print("3. Update Barang")
        print("4. Hapus Barang")
        print("5. Cari Barang berdasarkan Nama Barang")
        print("0. Keluar dari program")
        choiceNum = input("Masukkan pilihan: ")

        if (choiceNum.isdigit()):
            choiceNum = int(choiceNum)

            match choiceNum:
                case 1:
                    print("add item not implemented yet")
                case 2:
                    print("show items not implemented yet")
                case 3:
                    print("update items not implemented yet")
                case 4:
                    print("delete items not implemented yet")
                case 5:
                    print("search items not implemented yet")
                case 0:
                    print("Program selesai digunakan.")
                case _:
                    print("Masukan harus sesuai dengan menu yang ditentukan (0-5).")
        else:
            print("Masukan harus berupa angka.")

# Eksekusi otomatis untuk main
if __name__ == "__main__":
    main()
