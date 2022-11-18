CREATE TABLE conciertos(

	cod_concierto int not null auto_increment,
	nombre_concierto varchar(200) not null,
	fecha_concierto date not null,
        hora_concierto Time not null,
        cod_tipo_concierto int not null,
	PRIMARY KEY(cod_concierto)
);

CREATE TABLE artistas(

	cod_artista int not null auto_increment,
	nombre_artista varchar(200) not null,
        primer_apellido_artista varchar(100) not null,
        segundo_apellido_artista varchar(100) not null,
	honorario_artista double not null,
	condiciones_artista varchar (200) not null,
	PRIMARY KEY(cod_artista)

);

CREATE TABLE canciones (

	cod_cancion int not null auto_increment,
	nombre_cancion varchar (200) not null,
	duracion_cancion varchar (200) not null,
        fecha_publicacion_cancion DATE not null,
	compositor_cancion varchar(100) not null,
	PRIMARY KEY(cod_cancion)

);

CREATE TABLE generos_musicales(


	cod_generoMusical int not null auto_increment,
	nombre_genero varchar(200) not null,
	PRIMARY KEY(cod_generoMusical)
);

CREATE TABLE tipos_conciertos(
    cod_tipo_concierto INT NOT NULL AUTO_INCREMENT,
    nombre_tipo_concierto varchar(100) not null,
    primary key(cod_tipo_concierto)

);

CREATE TABLE ubicaciones(
    cod_ubicacion INT AUTO_INCREMENT,
    direcciones_ubicacion VARCHAR(100) NOT NULL,
    primary key(cod_ubicacion)
);

CREATE TABLE usurarios(
    cod_usuario INT AUTO_INCREMENT,
    correo_usuario varchar(100) not null,
    clave_usuario varchar(100) not null,
    nombre_usuario varchar(100) not null,
    tipo_documento INT not null,
    documento_usuario varchar(20) not null,
    primary key(cod_usuario)
);

alter table conciertos add constraint fk_concierto_tipo foreign key (cod_tipo_concierto)
     references tipos_conciertos (cod_tipo_concierto) on delete restrict on update cascade;





