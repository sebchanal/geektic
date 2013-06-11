drop table geek if exists cascade;
drop sequence Geek_seq if exists;
drop sequence Interet_seq if exists;
drop sequence GeekInteret_seq if exists;

create table Geek (
	id numeric not null,
	pseudo varchar(255) not null,
	nom varchar(255) not null,
	prenom varchar(255) not null,
	sexe bit not null,
	dateNaissance date not null,
	mail varchar(255) not null,
	nbVue numeric default '0',
	primary key (id)
);

create table Interet (
	id numeric not null,
	libelle varchar(255) not null,
	primary key (id),
);

create table GeekInteret(
	idGeek numeric not null,
	idInteret numeric not null,
	primary key (idGeek, idInteret),
	foreign key (idGeek) references Geek(id),
	foreign key (idInteret) references Interet(id),
);

create sequence Geek_seq start with 1000;
create sequence Interet_seq start with 1000;
create sequence GeekInteret_seq start with 1000;

insert into Geek values (2,'Balckangel', 'PANOYAN', 'Jeremy', '0', to_date('24-04-2013', 'DD-MM-YYYY'), 'jpanoyan@geek.com');
insert into Geek values (1,'Balckangel', 'VALLIN', 'Jeremy', '0', to_date('23-04-2013', 'DD-MM-YYYY'), 'jvallin@geek.com');
insert into Geek values (2,'Rafoufoun', 'PANOYAN', 'Rafi', '0', to_date('24-04-2013', 'DD-MM-YYYY'), 'rpanoyan@geek.com');
insert into Geek values (3,'Tartatin', 'CHANAL', 'Sebastien', '0', to_date('25-04-2013', 'DD-MM-YYYY'), 'schanal@geek.com');
insert into Geek values (5,'Loulou', 'DUPONTAI', 'Louise', '1', to_date('09-05-2013', 'DD-MM-YYYY'), 'ldupontai@geek.com');
insert into Geek values (6,'Robert', 'SAIRIEN', 'Jean', '0', to_date('12-05-2013', 'DD-MM-YYYY'), 'jsairien@geek.com');
insert into Geek values (7,'Boobs', 'BAR', 'Leny', '0', to_date('13-05-2013', 'DD-MM-YYYY'), 'lban@geek.com');
insert into Geek values (8,'Doremi', 'DEAU', 'Remy', '0', to_date('13-05-2013', 'DD-MM-YYYY'), 'ddoremi@geek.com');
insert into Geek values (9,'Juju', 'DUFRANC', 'Justine', '1', to_date('13-05-2013', 'DD-MM-YYYY'), 'jdufranc@geek.com');
insert into Geek values (10,'Tounu', 'NIPANTALON', 'Sandra', '1', to_date('28-05-2013', 'DD-MM-YYYY'), 'snipantalon@geek.com');
insert into Geek values (11,'Pamoi', 'PAFAISA', 'Jenna', '1', to_date('30-05-2013', 'DD-MM-YYYY'), 'jpafaisa@geek.com');

insert into Interet values (1, 'JAVA');
insert into Interet values (2, 'HTML');
insert into Interet values (3, 'CSS');
insert into Interet values (4, 'PHP');
insert into Interet values (5, 'JS');
insert into Interet values (6, 'CS');
insert into Interet values (7, 'CPP');
insert into Interet values (8, 'VB');

insert into GeekInteret values (1, 1);
insert into GeekInteret values (1, 6);
insert into GeekInteret values (1, 5);
insert into GeekInteret values (1, 4);
insert into GeekInteret values (2, 1);
insert into GeekInteret values (2, 6);
insert into GeekInteret values (2, 5);
insert into GeekInteret values (2, 4);
insert into GeekInteret values (3, 3);
insert into GeekInteret values (5, 5);
insert into GeekInteret values (6, 6);
insert into GeekInteret values (7, 7);
insert into GeekInteret values (8, 8);
insert into GeekInteret values (9, 1);
insert into GeekInteret values (10, 2);
insert into GeekInteret values (11, 3);