SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

DROP DATABASE IF EXISTS klinikkesehatandb;
CREATE DATABASE IF NOT EXISTS klinikkesehatandb;
USE klinikkesehatandb;


CREATE TABLE `datadokter` (
  `id` int(11) NOT NULL,
  `namadokter` varchar(255) NOT NULL,
  `tipedokter` varchar(255) DEFAULT NULL
);


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
  `status_pemberian_obat` enum('belum','sudah') NOT NULL DEFAULT 'belum',
  `status_pertemuan_dengan_dokter` enum('belum','sudah') NOT NULL DEFAULT 'belum'
);


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
);


--
-- Table structure for table `history_pertemuan`
--

CREATE TABLE `history_pertemuan` (
  `id` int(11) NOT NULL,
  `iddokter` int(11) DEFAULT NULL,
  `namadokter` varchar(255) DEFAULT NULL,
  `idpasien` int(11) DEFAULT NULL,
  `namapasien` varchar(255) DEFAULT NULL,
  `mulai` timestamp NOT NULL DEFAULT current_timestamp(),
  `selesai` timestamp NOT NULL DEFAULT current_timestamp()
);


--
-- Table structure for table `jadwalpertemuan`
--

CREATE TABLE `jadwalpertemuan` (
  `id` int(11) NOT NULL,
  `iddokter` int(11) DEFAULT NULL,
  `idpasien` int(11) DEFAULT NULL,
  `mulai` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `selesai` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
);


--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id` int(11) NOT NULL,
  `namaobat` varchar(255) DEFAULT NULL,
  `stok` int(11) NOT NULL,
  `harga` int(11) DEFAULT NULL
);

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id`, `namaobat`, `stok`, `harga`) VALUES
(1, 'Obat Sakit Gigi', 100, 100000),
(2, 'Obat Pusing', 100, 20000),
(3, 'Obat Kolesterol', 100, 150000),
(4, 'Obat Sakit Perut', 100, 30000),
(5, 'Obat Sakit Mata', 100, 70000),
(6, 'Obat Pegal Linu', 100, 70000),
(7, 'Obat Maag', 100, 50000),
(8, 'Steroid', 100, 150000);


--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
);

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
-- Indexes for table `history_pertemuan`
--
ALTER TABLE `history_pertemuan`
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `datapasien`
--
ALTER TABLE `datapasien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `history_pertemuan`
--
ALTER TABLE `history_pertemuan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `jadwalpertemuan`
--
ALTER TABLE `jadwalpertemuan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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

