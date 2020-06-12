-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Jun 2020 pada 14.24
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_m4p`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', '123456');

-- --------------------------------------------------------

--
-- Struktur dari tabel `m4p`
--

CREATE TABLE `m4p` (
  `Hari` varchar(255) NOT NULL,
  `Jam_Masuk` varchar(255) NOT NULL,
  `Pelajaran` varchar(255) NOT NULL,
  `Ruangan` varchar(255) NOT NULL,
  `Kelas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `m4p`
--

INSERT INTO `m4p` (`Hari`, `Jam_Masuk`, `Pelajaran`, `Ruangan`, `Kelas`) VALUES
('selasa', '07.15', 'Indonesia', 'g1.1', 'XI RPL 2'),
('senin', '12.45', 'PKK', 'D2.1', 'XI RPL 1');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `m4p`
--
ALTER TABLE `m4p`
  ADD PRIMARY KEY (`Pelajaran`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
