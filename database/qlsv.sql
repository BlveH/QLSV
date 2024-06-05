-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: mysql
-- Generation Time: May 30, 2024 at 05:12 PM
-- Server version: 8.4.0
-- PHP Version: 8.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlsv`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
                         `classID` int NOT NULL,
                         `className` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`classID`, `className`) VALUES
                                                 (9, '19CN2'),
                                                 (10, '19CN3');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
                           `stID` int NOT NULL,
                           `stName` varchar(100) NOT NULL,
                           `stBirth` date NOT NULL,
                           `stGender` tinyint(1) NOT NULL,
                           `stPhone` int NOT NULL,
                           `classID` int NOT NULL,
                           `stPoint` float NOT NULL,
                           `stPoint_R` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stID`, `stName`, `stBirth`, `stGender`, `stPhone`, `classID`, `stPoint`, `stPoint_R`) VALUES
                                                                                                                  (1, 'Nguyen Dinh Long', '2018-12-05', 0, 4564565, 9, 3.4, 70),
                                                                                                                  (2, 'Tran Van Luc', '2018-12-05', 0, 4356546, 10, 2.5, 79),
                                                                                                                  (3, 'Nguyen Xuan Phuc', '2018-12-05', 1, 7566556, 10, 3.8, 86),
                                                                                                                  (4, 'Le Thanh Ba', '2018-12-05', 0, 5675675, 9, 1.2, 79),
                                                                                                                  (5, 'Nguyen Thang Long', '2018-12-05', 0, 5676577, 10, 3.2, 80),
                                                                                                                  (6, 'Ngo Dinh An', '2001-12-12', 0, 9897878, 9, 2.7, 90),
                                                                                                                  (7, 'Tran Thai Ha', '2018-12-05', 0, 3435535, 9, 3.1, 80),
                                                                                                                  (8, 'Le Duc Tho', '2018-12-05', 0, 4346546, 10, 2.5, 70),
                                                                                                                  (9, 'Bui Thanh Nha', '2018-12-05', 1, 6754534, 9, 2.8, 80),
                                                                                                                  (10, 'Tran Van Loc', '2018-12-05', 0, 3465654, 9, 1.9, 90),
                                                                                                                  (11, 'Tran Van Van', '2018-12-05', 1, 3847534, 10, 3.4, 80),
                                                                                                                  (12, 'Ngo Ma Hai', '2018-12-05', 0, 3453453, 9, 2.5, 70),
                                                                                                                  (13, 'Tran Van Linh', '2018-12-05', 0, 3454353, 10, 3.6, 80),
                                                                                                                  (14, 'Ngo Si Thanh', '2018-12-05', 1, 4354543, 9, 2.7, 70),
                                                                                                                  (15, 'Luong Tuan Hai', '2018-12-05', 0, 3453434, 9, 2.6, 70),
                                                                                                                  (16, 'Tran Ba Dao', '2018-12-05', 1, 6567676, 10, 1.8, 91),
                                                                                                                  (17, 'Vu Thanh Nguyet', '2018-12-05', 1, 7685654, 9, 3.1, 80),
                                                                                                                  (18, 'Le Hoang Ha', '2018-12-05', 1, 4658674, 10, 2.8, 91),
                                                                                                                  (19, 'Dang Tieu Binh', '2018-12-05', 0, 3464676, 9, 2.9, 91),
                                                                                                                  (20, 'Obama', '2018-12-05', 0, 8776878, 10, 3.6, 70),
                                                                                                                  (21, 'Nguyen Hai Long', '2018-12-05', 0, 3453434, 10, 1.5, 80),
                                                                                                                  (22, 'Nguyen Hai Vu', '2018-12-05', 0, 3453454, 9, 1, 70),
                                                                                                                  (23, 'Andrea Gomes', '2018-12-05', 0, 6788577, 9, 2.3, 80),
                                                                                                                  (24, 'Nguyen Tran Trong', '2018-12-05', 0, 7687856, 10, 2, 75),
                                                                                                                  (25, 'Le Thanh Bay', '2001-12-12', 0, 5675675, 9, 1.2, 79),
                                                                                                                  (26, 'Tran Duc Ha', '2018-12-05', 0, 4353453, 9, 2.4, 70),
                                                                                                                  (27, 'Le Nguyet Ha', '2018-12-05', 1, 3453465, 9, 3.1, 75),
                                                                                                                  (28, 'Le Da Thanh', '2018-12-05', 0, 4345434, 10, 3, 80),
                                                                                                                  (29, 'Tran Tien Vu', '2018-12-05', 0, 3453540, 9, 2.5, 69),
                                                                                                                  (30, 'Ha Nhu An', '2018-12-05', 1, 4656565, 9, 1.7, 90),
                                                                                                                  (31, 'Vu Cam Dao', '2018-12-05', 1, 5656565, 10, 3.4, 80),
                                                                                                                  (32, 'Nguyen Thanh Hoang', '2018-12-05', 0, 7897898, 9, 3.2, 70),
                                                                                                                  (33, 'Vu Viet Huu', '2018-12-05', 0, 5675675, 10, 2.4, 69),
                                                                                                                  (34, 'Hoang Duc An', '2018-12-05', 0, 4554656, 9, 3.2, 70),
                                                                                                                  (35, 'Dinh Viet Anh', '2018-12-05', 0, 5664545, 9, 1.9, 75),
                                                                                                                  (36, 'Le Minh Anh', '2018-12-05', 1, 7657676, 10, 3.2, 69),
                                                                                                                  (37, 'La Nhu Minh', '2018-12-05', 0, 3454656, 9, 1.6, 70),
                                                                                                                  (38, 'Dinh Cong Trang', '2018-12-05', 0, 3656656, 10, 3.6, 95),
                                                                                                                  (39, 'Hoang Tuan Kiet', '2018-12-05', 0, 9789789, 10, 2.4, 80),
                                                                                                                  (40, 'Phung Tieu Y', '2018-12-05', 1, 2342423, 9, 2.7, 79);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
                        `userID` int NOT NULL,
                        `userName` varchar(40) NOT NULL,
                        `passWord` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `userName`, `passWord`) VALUES
                                                          (19, 'syhanh', 'syhanh'),
                                                          (20, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class`
--
ALTER TABLE `class`
    ADD PRIMARY KEY (`classID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
    ADD PRIMARY KEY (`stID`),
  ADD KEY `fk_classID` (`classID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
    ADD PRIMARY KEY (`userID`),
  ADD KEY `userID` (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
    MODIFY `classID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
    MODIFY `stID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=189;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
    MODIFY `userID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `student`
--
ALTER TABLE `student`
    ADD CONSTRAINT `fk_classID` FOREIGN KEY (`classID`) REFERENCES `class` (`classID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
