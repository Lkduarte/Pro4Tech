create database pro4tech;

use pro4tech;

create table projeto
(codProjeto int primary key AUTO_INCREMENT,
nomeProjeto varchar (30),
empresaProjeto varchar (50));

create table usuario
(usuarioId int primary key AUTO_INCREMENT,
nomeUsuario varchar (60),
empresaUsuario varchar (30),
funcaoUsuario varchar (30),
telefoneUsuario varchar (20),
emailUsuario varchar (30),
perfilUsuario varchar (20),
senhaUsuario varchar (30),
loginUsuario varchar (30),
codProjeto int,
FOREIGN KEY(codProjeto)references projeto(codProjeto));

create table mensagem
(codMensagem int primary key AUTO_INCREMENT,
assuntoMsg varchar (50),
dataMsg date,
horaMsg time,
conteudoMsg varchar (800),
tipo varchar(20),
usuarioId int,
perfilId int,
codProjeto int,
FOREIGN KEY(codProjeto)references projeto(codProjeto),
FOREIGN KEY(usuarioId)references usuario(usuarioId));

insert into projeto(nomeProjeto,empresaProjeto) values
("Projeto Teste 1","Empresa 1"),
("Projeto Teste 2","Empresa 2"),
("Projeto Teste 3","Empresa 3"),
("Projeto Teste 4","Empresa 4");

