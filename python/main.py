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
                case 1: # Tambah data baru (Nama, deskripsi, tipe, stok)
                    tempName = input("Masukkan nama barang: ")
                    tempDesc = input("Masukkan deskripsi barang: ")
                    tempType = input("Masukkan tipe barang: ")
                    tempStock = input("Masukkan stok barang: ")

                    # Error handle

                    if (tempStock.isdigit()):
                        # Ubah variabel stok menjadi integer asli dan lanjutkan penambahan objek barang
                        tempStock = int(tempStock)

                        # Inisialisasi variabel objek sementara
                        tempBarang = Barang()

                        # Set data sesuai input
                        tempBarang.setId(idCounter)
                        tempBarang.setNama(tempName)
                        tempBarang.setDeskripsi(tempDesc)
                        tempBarang.setTipe(tempType)
                        tempBarang.setStok(tempStock)

                        # Masukkan variabel objek hasil inputan ke list
                        listObjekBarang.append(tempBarang);

                        # Tampilkan bahwa proses penambahan barang baru sudah selesai
                        print("Sukses menambahkan barang dengan ID ", idCounter)

                        # Naikkan penghitung 1 poin
                        idCounter += 1
                    else:
                        print("Masukan stok barang harus berupa angka")
                case 2: # Tampilkan list
                    # Jika tidak ada barang tersedia, tampilkan bahwa tidak ada barang yang tersedia.
                    if len(listObjekBarang) <= 0:
                        print("List data barang masih kosong")
                    else:
                        print("List barang yang tersedia:")

                        # Query seluruh list barang
                        for objBarang in listObjekBarang:
                            if (objBarang.getId() >= 0):
                                print("ID:", objBarang.getId())
                                print("Nama: " + objBarang.getNama())
                                print("Deskripsi: " + objBarang.getDeskripsi())
                                print("Tipe: " + objBarang.getTipe())

                                # Untuk stok barang, tampilkan kata "Habis" jika stok di angka 0 atau dibawahnya.
                                # Sertakan juga double newline untuk menyisakan ruang menu selanjutnya.
                                if (objBarang.getStok() > 0):
                                    print("Stok:", objBarang.getStok(), "\n")
                                else:
                                    print("Stok:", objBarang.getStok(), "(Habis)", "\n")
                case 3: # Update barang
                    # Tampilkan list menu atribut
                    print("Menu Update Atribut")
                    print("1. Nama")
                    print("2. Deskripsi")
                    print("3. Tipe")
                    print("4. Stok")
                    print("0. Semua atribut")

                    # Minta masukan input pilihan, dengan error handling jika bukan bilangan integer
                    tempUpdateSelection = input("Pilih atribut untuk diubah: ")

                    if (tempUpdateSelection.isdigit()):
                        tempUpdateSelection = int(tempUpdateSelection)
                        if (tempUpdateSelection >= 0 and tempUpdateSelection <= 4):
                            tempId = input("Masukkan ID barang: ")
                            if (tempId.isdigit()): # Lanjutkan jika valid
                                tempId = int(tempId)
                                if (tempId >= 0 and tempId <= len(listObjekBarang) and listObjekBarang[tempId]):
                                    if (tempUpdateSelection == 1 or tempUpdateSelection == 0):
                                        tempName = input("Masukkan nama barang: ")
                                        listObjekBarang[tempId].setNama(tempName)

                                    if (tempUpdateSelection == 2 or tempUpdateSelection == 0):
                                        tempDesc = input("Masukkan deskripsi barang: ")
                                        listObjekBarang[tempId].setDeskripsi(tempDesc)

                                    if (tempUpdateSelection == 3 or tempUpdateSelection == 0):
                                        tempType = input("Masukkan tipe barang: ")
                                        listObjekBarang[tempId].setTipe(tempType)

                                    if (tempUpdateSelection == 4 or tempUpdateSelection == 0):
                                        tempStock = input("Masukkan stok barang: ")
                                        if tempStock.isdigit():
                                            tempStock = int(tempStock)
                                            listObjekBarang[tempId].setStok(tempStock)
                                        else:
                                            print("Input stok tidak valid")

                                    # Umumkan bahwa data barang sudah di-update
                                    print("Sukses mengupdate data dari " + listObjekBarang[tempId].getNama() + " dengan ID", tempId);
                                else:
                                    print("ID barang tidak tersedia")
                            else:
                                print("Masukan harus berupa angka")
                        else:
                            print("Pilihan tidak tersedia")
                    else:
                        print("Masukan harus berupa angka")

                case 4: # Hapus barang
                    if len(listObjekBarang) <= 0:
                        print("List data barang masih kosong")
                    else:
                        # Minta input ID barang
                        tempId = input("Masukkan ID barang: ")
                        if (tempId.isdigit()):
                            # Ubah variabel menjadi integer asli
                            tempId = int(tempId)

                            # Variabel iterator dan variabel untuk objek barang
                            tempIterator = 0
                            tempBarang = None

                            # Iterasi
                            while (tempBarang == None and tempIterator < len(listObjekBarang)):
                                if (listObjekBarang[tempIterator].getId() == tempId):
                                    tempBarang = listObjekBarang[tempIterator]

                                tempIterator += 1

                            if tempBarang == None: # Batalkan jika ID barang tidak tersedia
                                print("ID barang tidak tersedia")
                            else: # Lanjutkan jika ID tersedia
                                # Simpan nama untuk ditampilkan
                                tempName = tempBarang.getNama()

                                # Hapus atribut objek, lalu hapus objek dari list
                                tempBarang.clear()
                                listObjekBarang.remove(tempBarang)

                                # Umumkan jika berhasil tanpa error
                                print("Sukses menghapus " + tempName + " dengan ID", tempId)
                        else:
                            print("Masukan harus berupa angka.")

                case 5:
                    if len(listObjekBarang) <= 0:
                        print("List data barang masih kosong")
                    else:
                        tempName = input("Masukkan nama barang: ")
                        tempSuccessfulQueries = 0
                        for objBarang in listObjekBarang:
                            if (objBarang.getId() >= 0 and objBarang.getNama().find(tempName) >= 0):
                                print("ID:", objBarang.getId())
                                print("Nama: " + objBarang.getNama())
                                print("Deskripsi: " + objBarang.getDeskripsi())
                                print("Tipe: " + objBarang.getTipe())

                                # Untuk stok barang, tampilkan kata "Habis" jika stok di angka 0 atau dibawahnya.
                                if (objBarang.getStok() > 0):
                                    print("Stok:", objBarang.getStok())
                                else:
                                    print("Stok:", objBarang.getStok(), "(Habis)")

                                # Naikkan penghitung jumlah barang yang ditemukan
                                tempSuccessfulQueries += 1

                        # Umumkan jumlah query sukses
                        if (tempSuccessfulQueries > 0):
                            print("Sukses menemukan", tempSuccessfulQueries, "barang dengan nama yang mengandung \"" + tempName + "\"")
                        else:
                            print("Tidak dapat menemukan barang dengan nama yang mengandung \"" + tempName + "\"")
                case 0:
                    print("Program selesai digunakan.")
                case _:
                    print("Masukan harus sesuai dengan menu yang ditentukan (0-5).")
        else:
            print("Masukan harus berupa angka.")

# Eksekusi otomatis untuk main
if __name__ == "__main__":
    main()
