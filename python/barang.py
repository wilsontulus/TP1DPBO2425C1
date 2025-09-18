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

class Barang:

    # constructor untuk inisialisasi atribut

    def __init__(self):
        self._id = -1
        self._nama = ""
        self._deskripsi = ""
        self._tipe = ""
        self._stok = 0
        return None

    # Fungsi setter (write atribut)
    def setId(self, id: int) -> None:
        self._id = int(id)

    def setNama(self, nama: str) -> None:
        self._nama = str(nama)

    def setAlamat(self, alamat: str) -> None:
        self._alamat = str(alamat)

    def setNoKTP(self, noKTP: str) -> None:
        self._noKTP = str(noKTP)

    def setStok(self, stok: int) -> None:
        self._stok = int(stok)

    def clear(self) -> None:
        self._id = -1
        self._nama = ""
        self._deskripsi = ""
        self._tipe = ""
        self._stok = 0

    # Fungsi getter (read atribut)
    def getId(self) -> int:
        return self._id

    def getNama(self) -> str:
        return self._nama

    def getDeskripsi(self) -> str:
        return self._deskripsi

    def getTipe(self) -> str:
        return self._tipe

    def getStok(self) -> int:
        return self._stok
