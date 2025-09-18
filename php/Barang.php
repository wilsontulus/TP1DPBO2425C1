<?php

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

/* Deklarasi kelas barang */

class Barang{

    private $id = -1;
    private $nama = "";
    private $deskripsi = "";
    private $tipe = "";
    private $stok = 0;

    public function __construct() {
        $this->id = -1;
        $this->nama = "";
        $this->deskripsi = "";
        $this->tipe = "";
        $this->stok = 0;
    }

    // Fungsi setter untuk write atribut

    public function setId($id) {
        $this->id = $id;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    public function setDeskripsi($deskripsi) {
        $this->deskripsi = $deskripsi;
    }

    public function setTipe($tipe) {
        $this->tipe = $tipe;
    }

    public function setStok($stok) {
        $this->stok = $stok;
    }

    public function clear() {
        $this->id = -1;
        $this->nama = "";
        $this->deskripsi = "";
        $this->tipe = "";
        $this->stok = 0;
    }

    // Fungsi getter untuk read atribut

    public function getId() {
        return $this->id;
    }

    public function getNama() {
        return $this->nama;
    }

    public function getDeskripsi() {
        return $this->deskripsi;
    }

    public function getTipe() {
        return $this->tipe;
    }

    public function getStok() {
        return $this->stok;
    }
}

?>
