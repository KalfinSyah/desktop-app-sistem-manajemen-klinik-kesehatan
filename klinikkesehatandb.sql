-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 05:03 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

DROP DATABASE IF EXISTS klinikkesehatandb;
CREATE DATABASE IF NOT EXISTS klinikkesehatandb;
USE klinikkesehatandb;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinikkesehatandb`
--

-- --------------------------------------------------------

--
-- Table structure for table `datadokter`
--

CREATE TABLE `datadokter` (
  `id` int(11) NOT NULL,
  `namadokter` varchar(255) NOT NULL,
  `tipedokter` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datadokter`
--

INSERT INTO `datadokter` (`id`, `namadokter`, `tipedokter`) VALUES
(1, 'Dr. Richard', 'Dokter Umum'),
(3, 'Dr. Ryan', 'Dokter Spesialis Gigi');

-- --------------------------------------------------------

--
-- Table structure for table `datapasien`
--

CREATE TABLE `datapasien` (
  `id` int(11) NOT NULL,
  `namapasien` varchar(255) NOT NULL,
  `usia` int(11) NOT NULL,
  `gender` enum('L','P') NOT NULL,
  `keluhan` varchar(255) DEFAULT NULL,
  `bpjs` enum('IYA','TIDAK') NOT NULL,
  `waktukedatangan` datetime DEFAULT NULL,
  `status_pemberian_obat` enum('belum','sudah') NOT NULL DEFAULT 'belum'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datapasien`
--

INSERT INTO `datapasien` (`id`, `namapasien`, `usia`, `gender`, `keluhan`, `bpjs`, `waktukedatangan`, `status_pemberian_obat`) VALUES
(7, 'Diana', 20, 'P', 'Pusing', 'IYA', '2024-05-25 02:59:39', 'sudah'),
(8, 'Joni', 20, 'L', 'Pusing', 'TIDAK', '2024-05-25 03:12:12', 'sudah'),
(9, 'Jack', 30, 'L', 'Sakit Gigi', 'TIDAK', '2024-05-30 07:31:45', 'belum');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `idpasien` int(11) DEFAULT NULL,
  `namapasien` varchar(255) DEFAULT NULL,
  `keluhan` varchar(255) DEFAULT NULL,
  `idobat` int(11) DEFAULT NULL,
  `namaobat` varchar(255) DEFAULT NULL,
  `waktupemberian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `hargaobat` float DEFAULT NULL,
  `uangpasien` float DEFAULT NULL,
  `kembalian` float DEFAULT NULL,
  `bpjs` enum('IYA','TIDAK') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `idpasien`, `namapasien`, `keluhan`, `idobat`, `namaobat`, `waktupemberian`, `hargaobat`, `uangpasien`, `kembalian`, `bpjs`) VALUES
(7, 7, 'Diana', 'Pusing', 2, 'Obat Pusing', '2024-05-24 20:11:50', 0, 100000, 100000, 'IYA'),
(8, 8, 'Joni', 'Pusing', 2, 'Obat Pusing', '2024-05-24 20:13:52', 20000, 100000, 80000, 'TIDAK');

-- --------------------------------------------------------

--
-- Table structure for table `jadwalpertemuan`
--

CREATE TABLE `jadwalpertemuan` (
  `id` int(11) NOT NULL,
  `iddokter` int(11) DEFAULT NULL,
  `namadokter` varchar(255) DEFAULT NULL,
  `idpasien` int(11) DEFAULT NULL,
  `namapasien` varchar(255) DEFAULT NULL,
  `mulai` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `selesai` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id` int(11) NOT NULL,
  `namaobat` varchar(255) DEFAULT NULL,
  `stok` int(11) NOT NULL,
  `harga` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id`, `namaobat`, `stok`, `harga`) VALUES
(1, 'Obat Sakit Gigi', 100, 100000.00),
(2, 'Obat Pusing', 98, 20000.00),
(3, 'Obat Kolesterol', 100, 150000.00),
(4, 'Obat Sakit Perut', 98, 30000.00),
(5, 'Obat Sakit Mata', 100, 70000.00),
(6, 'Obat Pegal Linu', 99, 70000.00);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'admin', '11111111'),
(2, 'guest', '11111111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datadokter`
--
ALTER TABLE `datadokter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `datapasien`
--
ALTER TABLE `datapasien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jadwalpertemuan`
--
ALTER TABLE `jadwalpertemuan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `iddokter` (`iddokter`),
  ADD KEY `idpasien` (`idpasien`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datadokter`
--
ALTER TABLE `datadokter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `datapasien`
--
ALTER TABLE `datapasien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `jadwalpertemuan`
--
ALTER TABLE `jadwalpertemuan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwalpertemuan`
--
ALTER TABLE `jadwalpertemuan`
  ADD CONSTRAINT `jadwalpertemuan_ibfk_1` FOREIGN KEY (`iddokter`) REFERENCES `datadokter` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwalpertemuan_ibfk_2` FOREIGN KEY (`idpasien`) REFERENCES `datapasien` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
