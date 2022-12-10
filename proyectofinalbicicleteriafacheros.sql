-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2022 a las 02:18:35
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
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bicicleta`
--

INSERT INTO `bicicleta` (`num_serie`, `tipo`, `color`, `dni_dueño`, `activo`) VALUES
(2, 'MTB', 'Rojo', 40000, 1),
(3, 'Playera', 'Negro', 40000, 1),
(3564, 'de Ruta', 'Purpura', 11223355, 1),
(131325, 'BMX', 'Azul', 11223355, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` int(12) NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `apellido`, `domicilio`, `telefono`, `activo`) VALUES
(40000, 'Santiago', 'Lucero', 'B Cerro de la Cruz', 41111, 1),
(11223355, 'Cosme', 'Fulano', 'Av. Siempreviva 777', 266499999, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemrepuesto`
--

CREATE TABLE `itemrepuesto` (
  `id_itemrepuesto` int(11) NOT NULL,
  `num_serie` int(11) NOT NULL,
  `id_reparacion` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_item` float NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemrepuesto`
--

INSERT INTO `itemrepuesto` (`id_itemrepuesto`, `num_serie`, `id_reparacion`, `cantidad`, `precio_item`, `activo`) VALUES
(2, 364, 1, 100, 2000, 1),
(8, 364, 6, 10, 1000, 1);

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
  `estado` tinyint(1) NOT NULL DEFAULT 0,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reparación`
--

INSERT INTO `reparación` (`id_reparacion`, `id_servicio`, `id_bicicleta`, `fecha_entrada`, `costo_final`, `estado`, `activo`) VALUES
(1, 4, 2, '2022-12-01', 3000, 1, 1),
(6, 4, 2, '2022-12-01', 450, 1, 1),
(7, 4, 2, '2022-12-01', 800, 1, 1),
(8, 5, 131325, '2022-11-25', 5000, 0, 1),
(9, 0, 2, '2022-12-08', 330, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE `repuesto` (
  `num_serie` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio` float NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `repuesto`
--

INSERT INTO `repuesto` (`num_serie`, `descripcion`, `precio`, `activo`) VALUES
(3, 'Tornillo 10', 30, 1),
(94, 'Tornillo philips 10', 15, 1),
(95, 'Tornillo plano 10', 14, 1),
(96, 'Tornillo philips 15', 20, 1),
(364, 'Aceite de maquina', 200, 1),
(457, 'Clavito', 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`codigo`, `descripcion`, `precio`, `activo`) VALUES
(0, 'Emparchado', 300, 1),
(2, 'Reparacion de clavito', 400, 0),
(4, 'Calibrado de cambios', 800, 1),
(5, 'Cambio de rueda', 2000, 1);

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
  MODIFY `id_itemrepuesto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `reparación`
--
ALTER TABLE `reparación`
  MODIFY `id_reparacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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
