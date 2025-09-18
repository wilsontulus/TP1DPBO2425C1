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

/* Deklarasi kelas barang dari file php */

require('Barang.php');

/* Inisialisasi variabel sesi $SESSION */

session_start();

?>

<!DOCTYPE html>

<html lang="id-ID">
    <head>
        <!-- Deskripsi dan metadata situs -->
        <title>Manajemen Toko Elektronik</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="author" content="wilson">
        <meta name="title" property="og:title" content="Toko Elektronik wilson">
        <meta name="keywords" content="toko, elektronik, electronics">
        <meta name="description" content="Sebuah situs toko elektronik.">

        <!-- Deklarasi stylesheet CSS -->
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="header">
            <div class="header-left">
                <h1> Manajemen Toko Elektronik </h1>
            </div>

            <div class="header-right">
                <img class="logo" src="images/logo.png" alt="Item icon" height="64">
            </div>

        </div>

        <div class="main">
            <header>
                <h1> List barang yang tercatat </h1>
            </header>
        </div>

        <div class="footer">
            <h3>Site made by wilson - UPI</h3>
        </div>
    </body>
</html>
