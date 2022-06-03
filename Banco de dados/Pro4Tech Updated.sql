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
emailUsuario varchar (300),
perfilUsuario int,
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
codProjeto int,
FOREIGN KEY(codProjeto)references projeto(codProjeto),
FOREIGN KEY(usuarioId)references usuario(usuarioId));

create table mensagemIndividual
(codMensagemIndividual int primary key AUTO_INCREMENT,
assuntoMsgIndividual varchar (50),
dataMsgIndividual date,
horaMsgIndividual time,
conteudoMsgIndividual varchar (800),
quemEnviou int,
quemRecebeu int,
FOREIGN KEY(quemEnviou)references usuario(usuarioId),
FOREIGN KEY(quemRecebeu)references usuario(usuarioId));

insert into projeto(nomeProjeto,empresaProjeto) values
("Projeto Teste 1","Empresa 1"),
("Projeto Teste 2","Empresa 2"),
("Projeto Teste 3","Empresa 3"),
("Projeto Teste 4","Empresa 4");

insert into usuario values 
(1,"Icaro Dell Osso Vaz de Carvalho","FATEC","Scrum Master","(12)981826657","icaro.dellosso@hotmail.com",2,"123","icaro",1);

