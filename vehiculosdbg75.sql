-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-08-2021 a las 19:55:08
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vehiculosdbg75`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_camiones`
--

CREATE TABLE `tb_camiones` (
  `id` int(11) NOT NULL,
  `remolque` varchar(255) DEFAULT NULL,
  `id_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_carros`
--

CREATE TABLE `tb_carros` (
  `id` int(11) NOT NULL,
  `automatico` tinyint(1) DEFAULT 0,
  `id_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_carros`
--

INSERT INTO `tb_carros` (`id`, `automatico`, `id_vehiculo`) VALUES
(1, 0, 1),
(2, 1, 2),
(3, 1, 3),
(4, 1, 4),
(5, 0, 5),
(6, 1, 6),
(7, 0, 7),
(8, 0, 8),
(9, 1, 9),
(10, 0, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_mecanicos`
--

CREATE TABLE `tb_mecanicos` (
  `id` int(11) NOT NULL,
  `documento` varchar(15) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_talleres_mecanicos`
--

CREATE TABLE `tb_talleres_mecanicos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `id_mecanico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_taller_mecanico_vehiculos`
--

CREATE TABLE `tb_taller_mecanico_vehiculos` (
  `id` int(11) NOT NULL,
  `id_taller_mecanico` int(11) NOT NULL,
  `id_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_vehiculos`
--

CREATE TABLE `tb_vehiculos` (
  `id` int(11) NOT NULL,
  `codigo` varchar(7) NOT NULL,
  `marca` varchar(150) NOT NULL,
  `numero_llantas` int(11) DEFAULT 4,
  `color` varchar(50) NOT NULL,
  `caballos_fuerza` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_vehiculos`
--

INSERT INTO `tb_vehiculos` (`id`, `codigo`, `marca`, `numero_llantas`, `color`, `caballos_fuerza`) VALUES
(1, 'CV001', 'Chevrolet', 4, 'Azul', 90),
(2, 'CV002', 'Mazda', 4, 'Gris', 103),
(3, 'CV003', 'Volkswagen', 5, 'Gris', 98),
(4, 'CV004', 'BMW', 4, 'Blanco', 145),
(5, 'CV005', 'Chevrolet', 4, 'Verde', 98),
(6, 'CV006', 'Audi', 4, 'Gris', 117),
(7, 'CV007', 'Hyundai', 4, 'Verde', 75),
(8, 'CV008', 'Suzuki', 4, 'Azul', 65),
(9, 'CV009', 'Volkswagen', 4, 'Rojo', 110),
(10, 'CV010', 'Renault', 4, 'Rojo', 85);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_camiones`
--
ALTER TABLE `tb_camiones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_vehiculo` (`id_vehiculo`);

--
-- Indices de la tabla `tb_carros`
--
ALTER TABLE `tb_carros`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_vehiculo` (`id_vehiculo`);

--
-- Indices de la tabla `tb_mecanicos`
--
ALTER TABLE `tb_mecanicos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_talleres_mecanicos`
--
ALTER TABLE `tb_talleres_mecanicos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mecanico` (`id_mecanico`);

--
-- Indices de la tabla `tb_taller_mecanico_vehiculos`
--
ALTER TABLE `tb_taller_mecanico_vehiculos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_taller_mecanico` (`id_taller_mecanico`),
  ADD KEY `id_vehiculo` (`id_vehiculo`);

--
-- Indices de la tabla `tb_vehiculos`
--
ALTER TABLE `tb_vehiculos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_camiones`
--
ALTER TABLE `tb_camiones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_carros`
--
ALTER TABLE `tb_carros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tb_mecanicos`
--
ALTER TABLE `tb_mecanicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_talleres_mecanicos`
--
ALTER TABLE `tb_talleres_mecanicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_taller_mecanico_vehiculos`
--
ALTER TABLE `tb_taller_mecanico_vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_vehiculos`
--
ALTER TABLE `tb_vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_camiones`
--
ALTER TABLE `tb_camiones`
  ADD CONSTRAINT `tb_camiones_ibfk_1` FOREIGN KEY (`id_vehiculo`) REFERENCES `tb_vehiculos` (`id`);

--
-- Filtros para la tabla `tb_carros`
--
ALTER TABLE `tb_carros`
  ADD CONSTRAINT `tb_carros_ibfk_1` FOREIGN KEY (`id_vehiculo`) REFERENCES `tb_vehiculos` (`id`);

--
-- Filtros para la tabla `tb_talleres_mecanicos`
--
ALTER TABLE `tb_talleres_mecanicos`
  ADD CONSTRAINT `tb_talleres_mecanicos_ibfk_1` FOREIGN KEY (`id_mecanico`) REFERENCES `tb_mecanicos` (`id`);

--
-- Filtros para la tabla `tb_taller_mecanico_vehiculos`
--
ALTER TABLE `tb_taller_mecanico_vehiculos`
  ADD CONSTRAINT `tb_taller_mecanico_vehiculos_ibfk_1` FOREIGN KEY (`id_taller_mecanico`) REFERENCES `tb_talleres_mecanicos` (`id`),
  ADD CONSTRAINT `tb_taller_mecanico_vehiculos_ibfk_2` FOREIGN KEY (`id_vehiculo`) REFERENCES `tb_vehiculos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
