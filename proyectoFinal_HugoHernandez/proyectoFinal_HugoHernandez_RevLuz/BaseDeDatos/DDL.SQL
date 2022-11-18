ET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `conciertos`;
DROP TABLE IF EXISTS `conciertos_artistas`;
DROP TABLE IF EXISTS `artistas`;
DROP TABLE IF EXISTS `canciones`;
DROP TABLE IF EXISTS `generos_musicales`;
DROP TABLE IF EXISTS `ubicaciones`;
DROP TABLE IF EXISTS `tipos_conciertos`;
DROP TABLE IF EXISTS `usuarios`;
DROP TABLE IF EXISTS `usuarios_conciertos`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `conciertos` (
    `cod_concierto` INT  AUTO_INCREMENT NOT NULL,
    `fecha_concierto` DATE NOT NULL,
    `hora_concierto` TIME NOT NULL,
    `nombre_concierto` VARCHAR(200) NOT NULL,
    `id_ubicacion_concierto` INT NOT NULL,
    `id_tipo_concicerto` INT NOT NULL,
    PRIMARY KEY (`cod_concierto`)
);

CREATE TABLE `conciertos_artistas` (
    `cod_artista` INT NOT NULL,
    `cod_concierto` INT NOT NULL,
    PRIMARY KEY (`cod_artista`, `cod_concierto`)
);

CREATE TABLE `artistas` (
    `cod_artista` INT AUTO_INCREMENT NOT NULL,
    `nombre_artista` VARCHAR(100) NOT NULL,
    `primer_apellido_artista` VARCHAR(100) NOT NULL,
    `segundo_apellido_artista` VARCHAR(100) NOT NULL,
    `fecha_nacimiento_artista` DATE NOT NULL,
    `honorario_artista` DOOBLE NOT NULL,
    `condiciones_artista` VARCHAR(500) NOT NULL,
    `cod_cancion` INT NOT NULL,
    PRIMARY KEY (`cod_artista`)
);

CREATE TABLE `canciones` (
    `cod_cancion` INT AUTO_INCREMENT NOT NULL,
    `nombre_cancion` VARCHAR(100) NOT NULL,
    `duracion_cancion` VARCHAR(10) NOT NULL,
    `fecha_publicacion_cancion` DATE NOT NULL,
    `compositor_cancion` VARCHAR(100) NOT NULL,
    `id_genero_cancion` INT NOT NULL,
    PRIMARY KEY (`cod_cancion`)
);

CREATE TABLE `generos_musicales` (
    `cod_genero_musical` INT AUTO_INCREMENT NOT NULL,
    `nombre_genero_musical` VARCHAR(50) NOT NULL,
    `cod_ubicacion_genero_musical` INT NOT NULL,
    PRIMARY KEY (`cod_genero_musical`)
);

CREATE TABLE `ubicaciones` (
    `cod_ubicacion` INT AUTO_INCREMENT NOT NULL,
    `direcciones_ubicacion` VARCHAR(100) NOT NULL,
    `cod_direccion_ubicacion` INT NOT NULL,
    PRIMARY KEY (`cod_ubicacion`)
);

CREATE TABLE `tipos_conciertos` (
    `cod_tipo_concierto` INT AUTO_INCREMENT NOT NULL,
    `nombre_tipo_concierto` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`cod_tipo_concierto`)
);

CREATE TABLE `usuarios` (
    `cod_usuario` INT AUTO_INCREMENT NOT NULL,
    `correo_usuario` VARCHAR(100) NOT NULL,
    `clave_usuario` VARCHAR(100) NOT NULL,
    `nombre_usuario` VARCHAR(100) NOT NULL,
    `tipo_documento` VARCHAR(20) NOT NULL,
    `documento_usuario` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`cod_usuario`)
);

CREATE TABLE `usuarios_conciertos` (
    `cod_concierto` INT NOT NULL,
    `cod_usuario` INT NOT NULL,
    PRIMARY KEY (`cod_concierto`, `cod_usuario`)
);
