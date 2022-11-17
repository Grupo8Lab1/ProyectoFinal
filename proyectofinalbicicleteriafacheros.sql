-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2022 a las 22:46:05
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinalbicicleteriafacheros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bicicleta`
--

CREATE TABLE `bicicleta` (
  `num_serie` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `color` varchar(20) NOT NULL,
  `dni_dueño` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bicicleta`
--

INSERT INTO `bicicleta` (`num_serie`, `tipo`, `color`, `dni_dueño`, `activo`) VALUES
(456, 'Mountain Bike', 'Verde', 11223344, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre_completo` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` int(12) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre_completo`, `domicilio`, `telefono`, `activo`) VALUES
(11223344, 'Cosme fulanito', 'Calle falsa 123', 123456789, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemrepuesto`
--

CREATE TABLE `itemrepuesto` (
  `id_itemrepuesto` int(11) NOT NULL,
  `num_serie` int(11) NOT NULL,
  `id_reparacion` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemrepuesto`
--

INSERT INTO `itemrepuesto` (`id_itemrepuesto`, `num_serie`, `id_reparacion`, `cantidad`) VALUES
(1, 457, 4, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparación`
--

CREATE TABLE `reparación` (
  `id_reparacion` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `id_bicicleta` int(11) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `costo_final` float DEFAULT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reparación`
--

INSERT INTO `reparación` (`id_reparacion`, `id_servicio`, `id_bicicleta`, `fecha_entrada`, `costo_final`, `estado`) VALUES
(4, 2, 456, '2022-11-03', NULL, 0),
(5, 2, 456, '2022-11-03', 1000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE `repuesto` (
  `num_serie` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio` float NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `repuesto`
--

INSERT INTO `repuesto` (`num_serie`, `descripcion`, `precio`, `activo`) VALUES
(456, 'Tornillito ', 15, 0),
(457, 'Clavito', 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`codigo`, `descripcion`, `precio`, `activo`) VALUES
(1, 'Reparacion de tornillito', 100, 0),
(2, 'Reparacion de clavito', 400, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD PRIMARY KEY (`num_serie`),
  ADD KEY `dni_dueño` (`dni_dueño`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `itemrepuesto`
--
ALTER TABLE `itemrepuesto`
  ADD PRIMARY KEY (`id_itemrepuesto`),
  ADD UNIQUE KEY `num_serie` (`num_serie`,`id_reparacion`),
  ADD KEY `id_rep` (`id_reparacion`);

--
-- Indices de la tabla `reparación`
--
ALTER TABLE `reparación`
  ADD PRIMARY KEY (`id_reparacion`),
  ADD KEY `id_servicio` (`id_servicio`),
  ADD KEY `id_bicicleta` (`id_bicicleta`);

--
-- Indices de la tabla `repuesto`
--
ALTER TABLE `repuesto`
  ADD UNIQUE KEY `num_serie` (`num_serie`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `itemrepuesto`
--
ALTER TABLE `itemrepuesto`
  MODIFY `id_itemrepuesto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `reparación`
--
ALTER TABLE `reparación`
  MODIFY `id_reparacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD CONSTRAINT `bicicleta_ibfk_1` FOREIGN KEY (`dni_dueño`) REFERENCES `cliente` (`dni`);

--
-- Filtros para la tabla `itemrepuesto`
--
ALTER TABLE `itemrepuesto`
  ADD CONSTRAINT `id_rep` FOREIGN KEY (`id_reparacion`) REFERENCES `reparación` (`id_reparacion`),
  ADD CONSTRAINT `itemrepuesto_ibfk_1` FOREIGN KEY (`id_reparacion`) REFERENCES `reparación` (`id_reparacion`),
  ADD CONSTRAINT `itemrepuesto_ibfk_2` FOREIGN KEY (`num_serie`) REFERENCES `repuesto` (`num_serie`);

--
-- Filtros para la tabla `reparación`
--
ALTER TABLE `reparación`
  ADD CONSTRAINT `reparación_ibfk_2` FOREIGN KEY (`id_bicicleta`) REFERENCES `bicicleta` (`num_serie`),
  ADD CONSTRAINT `reparación_ibfk_4` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
