-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2021 at 11:40 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbchuka`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminloginaccounts`
--

CREATE TABLE `adminloginaccounts` (
  `id` int(5) NOT NULL,
  `Username` varchar(35) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminloginaccounts`
--

INSERT INTO `adminloginaccounts` (`id`, `Username`, `Password`) VALUES
(1, 'ADMIN', 'ADMINPASS');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `CODE` varchar(6) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `DURATION` varchar(20) DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  `FACULTY` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`CODE`, `NAME`, `DURATION`, `Department`, `FACULTY`) VALUES
('ACSC', 'Applied Computer Science', '4years', NULL, 'FSET'),
('BAD', 'BSc EDUCATION', '4 years', 'DESC', NULL),
('BCHM', 'BIOCHEM', '4 years', 'BSC', 'FSET'),
('BCOM', 'BSc COMMERCE', '4yrs', 'DB', 'FSET'),
('COSC', 'BSc Computer Science', '4 years', NULL, 'FSET');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `ID` int(200) NOT NULL,
  `RegNO` varchar(35) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `ACSC332` varchar(10) NOT NULL,
  `ACSC351` varchar(10) NOT NULL,
  `ACSC327` varchar(10) NOT NULL,
  `ACSC371` varchar(10) NOT NULL,
  `ACSC381` varchar(10) NOT NULL,
  `COSC340` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`ID`, `RegNO`, `Name`, `ACSC332`, `ACSC351`, `ACSC327`, `ACSC371`, `ACSC381`, `COSC340`) VALUES
(1, '12345', '', 'C', 'B', 'A', 'B', 'F', 'D'),
(2, '12345', 'brian', 'A', 'B', 'C', 'D', 'F', 'X'),
(3, '123452', 'JUDI', 'A', 'B', 'D', 'A', 'X', 'Z'),
(4, '123453', 'RICK', 'B', 'C', 'A', 'A', 'D', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `id` int(30) NOT NULL,
  `RegNO` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `studentloginaccounts`
--

CREATE TABLE `studentloginaccounts` (
  `id` int(200) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `RegNo` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentloginaccounts`
--

INSERT INTO `studentloginaccounts` (`id`, `Username`, `RegNo`, `password`) VALUES
(1, 'BRIAN', '12345', 'brianpass'),
(2, 'ryan', 'abs538718', '');

-- --------------------------------------------------------

--
-- Table structure for table `studentlogintb`
--

CREATE TABLE `studentlogintb` (
  `id` int(200) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `RegNO` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentlogintb`
--

INSERT INTO `studentlogintb` (`id`, `username`, `RegNO`, `Password`) VALUES
(1, 'miky', 'ABS5\\399\\18', 'brpass');

-- --------------------------------------------------------

--
-- Table structure for table `studentresult`
--

CREATE TABLE `studentresult` (
  `id` int(100) NOT NULL,
  `RegNO` varchar(30) DEFAULT NULL,
  `unit_code` varchar(10) DEFAULT NULL,
  `Unit_Name` varchar(50) DEFAULT NULL,
  `Grade` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentresult`
--

INSERT INTO `studentresult` (`id`, `RegNO`, `unit_code`, `Unit_Name`, `Grade`) VALUES
(1, 'ABS5\\367\\18', 'ACSC 332', 'DESKTOP APPLICATION', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `studentstb`
--

CREATE TABLE `studentstb` (
  `id` int(200) NOT NULL,
  `RegNO` varchar(200) NOT NULL,
  `FirstName` varchar(15) DEFAULT NULL,
  `LastName` varchar(15) DEFAULT NULL,
  `Program` varchar(150) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Faculty` varchar(15) DEFAULT NULL,
  `Department` varchar(15) DEFAULT NULL,
  `Course` varchar(100) DEFAULT NULL,
  `Age` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentstb`
--

INSERT INTO `studentstb` (`id`, `RegNO`, `FirstName`, `LastName`, `Program`, `Gender`, `Faculty`, `Department`, `Course`, `Age`) VALUES
(1, 'aaa1', 'WILLIS', 'RUBARU', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbstudents`
--

CREATE TABLE `tbstudents` (
  `id` int(11) NOT NULL,
  `RegNO` varchar(20) NOT NULL,
  `FirstName` varchar(15) NOT NULL,
  `LastName` varchar(15) NOT NULL,
  `Program` varchar(15) DEFAULT NULL,
  `Gender` varchar(10) NOT NULL,
  `Faculty` varchar(15) DEFAULT NULL,
  `Department` varchar(15) DEFAULT NULL,
  `Course` varchar(200) DEFAULT NULL,
  `Age` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbstudents`
--

INSERT INTO `tbstudents` (`id`, `RegNO`, `FirstName`, `LastName`, `Program`, `Gender`, `Faculty`, `Department`, `Course`, `Age`) VALUES
(2, '12345', 'brian', 'otieno', 'COSC', 'MALE', 'FSET', 'BSC', 'JAVA', 35),
(3, '123452', 'JUDI', 'OMANGO', 'BCOM', 'FEMALE', 'FBUST', 'DESc', NULL, 20),
(4, '123453', 'rick', 'mwangi', 'aged', 'FEMALE', 'FBUST', 'DAGR', NULL, 21),
(5, '123454', 'gadaffi', 'omar', 'APPLIED', 'MALE', 'FSET', 'DCSc', 'Python', 24),
(6, '858585', 'kelvin', 'Debruene', 'DATA STRUCTURES', 'MALE', 'FSET', 'DCSc', 'DATA STRUCTURES', 18),
(7, 'AAA1', 'ADAN', 'IBRAHIM', 'COSC', 'MALE', 'FSET', 'DESc', 'JAVA', 24),
(8, 'aaa111', 'joseph', 'judas', 'Python', 'MALE', 'FSET', 'DCSc', NULL, 18),
(9, 'AAA2', 'brian', 'fantana', 'Python', 'MALE', 'FSET', 'DCSC', 'Python', 33),
(10, 'aaa3', 'RYAN', 'FERAIl', 'COSC', 'FEMALE', 'FSET', 'DCSc', 'Python', 22),
(11, 'aaa333', 'willis', 'omango', 'Python', 'MALE', 'FBUST', 'DESc', NULL, 19),
(21, 'aaa444', 'samoha', 'Gregde', 'Python', 'MALE', 'FSET', 'DCSc', 'Python', 20),
(23, 'aaa5', 'ALEX', 'MATHENGE', 'Python', 'MALE', 'FSET', 'DCSc', NULL, 21),
(25, 'aaaa6', 'issack', 'maina', 'Python', 'MALE', 'FBUST', 'DCSc', NULL, 21),
(12, 'ABF445617', 'HASSAN', 'ABDULLAHI', 'DATA STRUCTURES', 'MALE', 'FASTH', 'DESc', 'DATA STRUCTURES', 24),
(13, 'abs538718', 'RYAN', 'AMASAI', 'Applied', 'MALE', 'FSET', 'DESc', NULL, 22),
(14, 'ABS5\\367\\18', 'JAMAL', 'MOHAMED', 'ABSC', 'MALE', 'FBUST', 'FAHU', 'ACSC', NULL),
(15, 'ABS5\\387\\18', 'TIMIRA', 'HASSAN', 'BAD', 'FEMALE', 'FAHU', 'FSET', 'BACSC', NULL),
(16, 'ABS5\\399\\18', 'BRIAN', 'OTIENO', 'ACSC', 'MALE', NULL, 'FAHU', 'ACSC', NULL),
(19, 'eb33787816', 'ALICE', 'WAHOME', 'DATA STRUCTURES', 'FEMALE', 'FBUST', 'DCSc', NULL, 20),
(20, 'eb3@37706@16', 'hassow', 'abdull', 'DATA STRUCTURES', 'MALE', 'FSET', 'DCSc', NULL, 23);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminloginaccounts`
--
ALTER TABLE `adminloginaccounts`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`CODE`),
  ADD UNIQUE KEY `CODE` (`CODE`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD KEY `RegNO` (`RegNO`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentloginaccounts`
--
ALTER TABLE `studentloginaccounts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentlogintb`
--
ALTER TABLE `studentlogintb`
  ADD PRIMARY KEY (`id`),
  ADD KEY `RegNO` (`RegNO`);

--
-- Indexes for table `studentresult`
--
ALTER TABLE `studentresult`
  ADD PRIMARY KEY (`id`),
  ADD KEY `RegNO` (`RegNO`);

--
-- Indexes for table `studentstb`
--
ALTER TABLE `studentstb`
  ADD PRIMARY KEY (`RegNO`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `tbstudents`
--
ALTER TABLE `tbstudents`
  ADD PRIMARY KEY (`RegNO`),
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `ID` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `results`
--
ALTER TABLE `results`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `studentloginaccounts`
--
ALTER TABLE `studentloginaccounts`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `studentlogintb`
--
ALTER TABLE `studentlogintb`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `studentresult`
--
ALTER TABLE `studentresult`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `studentstb`
--
ALTER TABLE `studentstb`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbstudents`
--
ALTER TABLE `tbstudents`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`RegNO`) REFERENCES `tbstudents` (`RegNO`);

--
-- Constraints for table `studentlogintb`
--
ALTER TABLE `studentlogintb`
  ADD CONSTRAINT `studentlogintb_ibfk_1` FOREIGN KEY (`RegNO`) REFERENCES `tbstudents` (`RegNO`);

--
-- Constraints for table `studentresult`
--
ALTER TABLE `studentresult`
  ADD CONSTRAINT `studentresult_ibfk_1` FOREIGN KEY (`RegNO`) REFERENCES `tbstudents` (`RegNO`);

--
-- Constraints for table `studentstb`
--
ALTER TABLE `studentstb`
  ADD CONSTRAINT `studentstb_ibfk_1` FOREIGN KEY (`id`) REFERENCES `studentlogintb` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
