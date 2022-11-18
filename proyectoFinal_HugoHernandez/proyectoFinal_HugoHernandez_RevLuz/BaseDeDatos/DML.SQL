CREATE TABLE conciertos(

	cod_concierto int not null auto_increment,
	nombre_concierto varchar(200) not null,
	fecha_concierto date not null,        
        cod_tipo_concierto int not null,
	PRIMARY KEY(cod_concierto)
);

CREATE TABLE usuarios_conciertos(
        
        cod_usuario_concierto int not null auto_increment,
        cod_concierto int not null,
        cod_usuario int not null,
        PRIMARY KEY(cod_usuario_concierto)
        

);

CREATE TABLE artistas(

	cod_artista int not null auto_increment,
	nombre_artista varchar(200) not null,
        primer_apellido_artista varchar(100) not null,
        segundo_apellido_artista varchar(100) not null,
	honorario_artista double not null,
	condiciones_artista varchar (200) not null,
        cod_artista int not null,
	PRIMARY KEY(cod_artista)

);

CREATE TABLE canciones (

	cod_cancion int not null auto_increment,
	nombre_cancion varchar (200) not null,
	duracion_cancion varchar (200) not null,
        fecha_publicacion_cancion DATE not null,
	compositor_cancion varchar(100) not null,
        cod_genero_musical int not null,
	PRIMARY KEY(cod_cancion)

);

CREATE TABLE generos_musicales(


	cod_genero_musical int not null auto_increment,
	nombre_genero varchar(200) not null,
	PRIMARY KEY(cod_generoMusical)
);

CREATE TABLE tipos_conciertos(
    cod_tipo_concierto INT NOT NULL AUTO_INCREMENT,
    nombre_tipo_concierto varchar(100) not null,
    primary key(cod_tipo_concierto)

);

CREATE TABLE conciertos_artistas(
    cod_concierto_artista int not null auto_increment,
    cod_artista int not null,
    cod_concierto int not null,
    primary key(cod_concierto_artista)


);

CREATE TABLE ubicaciones(
    cod_ubicacion INT AUTO_INCREMENT,
    direcciones_ubicacion VARCHAR(100) NOT NULL,
    primary key(cod_ubicacion)
);

CREATE TABLE usuarios(
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

alter table usuarios_conciertos add constraint fk_usuarios_conciertos_ref_conciertos foreign key (cod_concierto)
     references conciertos (cod_concierto) on delete restrict on update cascade;

alter table usuarios_conciertos add constraint fk_usuarios_conciertos_ref_usuarios foreign key (cod_usuario)
     references usuarios (cod_usuario) on delete restrict on update cascade;

alter table conciertos_artistas add constraint fk_conciertos_artistas_ref_artistas foreign key (cod_artista)
     references artistas (cod_artista) on delete restrict on update cascade;

alter table conciertos_artistas add constraint fk_conciertos_artistas_ref_conciertos foreign key (cod_concierto)
     references conciertos (cod_concierto) on delete restrict on update cascade;

alter table artistas add constraint fk_artistas_ref_canciones foreign key (cod_cancion)
     references canciones (cod_cancion) on delete restrict on update cascade;

alter table canciones add constraint fk_canciones_ref_generos_musicales foreign key (cod_genero_musical)
     references generos_musicales (cod_genero_musical) on delete restrict on update cascade;

