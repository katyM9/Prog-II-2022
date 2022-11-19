create database loginbased; 
use loginbased;

create table usuarios(
id int not null auto_increment primary key,
nombre nvarchar(30),
apellidos nvarchar(30),
correo nvarchar(30),
contraseña nvarchar(30)

);



select * from usuarios;

insert into usuarios(nombre, apellidos, correo, contraseña) values ('katy', 'Sarahi', 'katy123', '1234');
;