--
-- PostgreSQL database dump
--

-- Started on 2016-11-6 05:51:45 AST

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

SET default_with_oids = false;



CREATE TABLE users
(
  uid integer NOT NULL,
  ufirst character(8),
  ulast character varying(40),
  uusername character varying(40),
  upassword character varying(40),
  udescription character varying(40),
  adminstatus boolean NOT NULL,
  uemail character varying(50),
  imageurl character varying (50)
);

CREATE TABLE events (
uid integer NOT NULL,
eid integer NOT NULL, 
title character varying(100),
start character varying(100),
end1 character varying (100),
allDay boolean,
aid integer NOT NULL
);

CREATE TABLE comments (
cid integer NOT NULL, 
uid integer NOT NULL, 
ctext character varying (100),
cdate character varying (40),
ctime character varying (40),
pid integer,
aid integer,
picid integer
);


CREATE TABLE posts (
uid integer NOT NULL, 
pid integer NOT NULL, 
ptext character varying (100),
ptitle character varying (100),
pdate character varying (40),
ptime character varying (40),
plikes integer, 
pcomments_count integer,
pauthor integer NOT NULL
);

CREATE TABLE attractions(
aid integer NOT NULL, 
aname character varying (40),
alocation character varying (40),
adescription character varying (1000),
aimageurl character varying (100)
);

CREATE TABLE services(
aid integer NOT NULL,
sid integer NOT NULL, 
sname character varying (40),
price integer NOT NULL
);

CREATE TABLE albums(
albumid integer NOT NULL,
uid integer NOT NULL,
aid integer NOT NULL,
albumname character varying (40)
);

CREATE TABLE notifications (
nid integer NOT NULL, 
uid integer NOT NULL,
ntext character varying(100),
cid integer,
lid integer,
authorid integer NOT NULL
);

CREATE TABLE wishlist (
uid integer NOT NULL, 
aid integer NOT NULL
);

CREATE TABLE friends(
randomid integer NOT NULL,
uid integer NOT NULL,
fid integer NOT NULL
);

CREATE TABLE picture(
aid integer NOT NULL,
picid integer NOT NULL,
picname character varying (100),
piclikes integer,
piccomments integer,
pimageurl character varying (100),
albumid integer NOT NULL

);


INSERT INTO users VALUES (1, 'Geraldo', 'Lopez', 'geraldo29', 'password','awesome description', true, 'geraldo.lopez1@upr.edu','http://localhost:9000/images/geraldo.jpg');
INSERT INTO users VALUES (2, 'Harry', 'Hernandez', 'harry123', 'password','awesome description', true, 'harry.hernandez1@upr.edu','http://localhost:9000/images/harry.jpg');
INSERT INTO users VALUES (3, 'Abdiel', 'Vega', 'abdiel123', 'password','awesome description', true, 'abdiel.vega1@upr.edu','http://localhost:9000/images/abdiel.jpg');
INSERT INTO users VALUES (4, 'Harambe', 'Gorilla', 'harambelives', 'password','awesome description', false, 'harambe.lives@upr.edu','http://localhost:9000/images/harambe.jpg');
INSERT INTO users VALUES (5, 'Adam', 'Ritter', 'adam123', 'password','awesome description', false, 'adam123@upr.edu','http://localhost:9000/images/adam.jpg');
INSERT INTO users VALUES (6, 'Ben', 'Young', 'ben123', 'password','awesome description', false, 'ben123@upr.edu','http://localhost:9000/images/ben.png');
INSERT INTO users VALUES (7, 'Max', 'Beatty', 'max123', 'password','awesome description', false, 'max123@upr.edu','http://localhost:9000/images/max.png');
INSERT INTO users VALUES (8, 'Mike', 'Smith', 'mike123', 'password','awesome description', false, 'mike123@upr.edu','http://localhost:9000/images/mike.png');
INSERT INTO users VALUES (9, 'Perry', 'Platipus', 'perry123', 'password','awesome description', false, 'perry123@upr.edu','http://localhost:9000/images/perry.png');

INSERT INTO friends VALUES (1,1,1);
INSERT INTO friends VALUES (2,1,2);
INSERT INTO friends VALUES (3,1,3);
INSERT INTO friends VALUES (4,1,4);
INSERT INTO friends VALUES (5,2,1);
INSERT INTO friends VALUES (6,2,2);
INSERT INTO friends VALUES (7,2,3);
INSERT INTO friends VALUES (8,2,4);
INSERT INTO friends VALUES (9,3,1);
INSERT INTO friends VALUES (10,3,2);
INSERT INTO friends VALUES (11,3,3);
INSERT INTO friends VALUES (12,3,4);
INSERT INTO friends VALUES (13,4,1);
INSERT INTO friends VALUES (14,4,2);
INSERT INTO friends VALUES (15,4,3);
INSERT INTO friends VALUES (16,4,4);

INSERT INTO attractions VALUES (1,'Cueva Ventana', 'Arecibo', 'Maravillosa cueva con una vista brutal','http://localhost:9000/images/cuevaVentana.jpg');
INSERT INTO attractions VALUES (2,'Las Cascadas', 'Aguadilla', 'Las Cascadas water park is currently known as the biggest water park in the caribbean. Recently renovated, it has several attractions to both children and adults. Its attractions include the "Crazy River" which simulates rapids river, and the Wave Pools which simulate the waves of a beach. For children there is the Kiddy Pool area, and for the lovers of speed and adventure there is the Speed Slide, "The Bomb", and the Water Tunnel. Other attractions available','http://localhost:9000/images/cascadas.jpg');
INSERT INTO attractions VALUES (3,'El Morro', 'San Juan', 'Historic fort site','http://localhost:9000/images/morro.jpg');
INSERT INTO attractions VALUES (4,'El Yunque', 'Rio Grande', 'The El Yunque National Forest is the only tropical rain forest in the national forest system.  At nearly 29,000 acres, it is one of the smallest in size, yet one of the most biologically diverse of the national forests hosting hundreds of animal and plant species, some of which are found only here.','http://localhost:9000/images/yunque.jpg');
INSERT INTO attractions VALUES (5,'Flamenco Beach', 'Culebra', 'Flamenco Beach is a public beach on the Caribbean island of Culebra. It is known for its shallow turquoise waters, white sand, swimming areas, and diving sites. It stretches for a mile around a sheltered, horseshoe-shaped bay. Playa Flamenco is a popular beach destination for both Culebra and Puerto Rico. In March 2014, Flamenco beach was ranked 3rd best beach in the world with a TripAdvisor Travelers Choice Award.','http://localhost:9000/images/flamenco.jpg');
INSERT INTO attractions VALUES (6,'Media Luna Beach', 'Vieques', 'Awesome Beach','http://localhost:9000/images/viequesbeach.jpg');
INSERT INTO attractions VALUES (7,'Crash Boat Beach', 'Aguadilla', 'Awesome Beach','http://localhost:9000/images/crashboat.jpg');
INSERT INTO attractions VALUES (8,'Toro Verde', 'Orocovis', 'Zipline','http://localhost:9000/images/toroverde.jpg');
INSERT INTO attractions VALUES (9,'Parque de las Ciencias', 'Bayamon', 'Great Science Park','http://localhost:9000/images/ciencias.jpg');
INSERT INTO attractions VALUES (10,'Gozalandia', 'San Sebastian', 'Great waterfall to go with friends','http://localhost:9000/images/goza.jpg');
INSERT INTO attractions VALUES (11,'Salto Doña Juana', 'Orocovis', 'Un pequeno rio','http://localhost:9000/images/juana.jpg');
INSERT INTO attractions VALUES (12,'Bosque Seco', 'Guanica', 'Dry Forest','http://localhost:9000/images/bosqueseco.jpg');
INSERT INTO attractions VALUES (13,'Parque De Bombas', 'Ponce', 'Terroist park','http://localhost:9000/images/bombas.jpg');
INSERT INTO attractions VALUES (14,'La Guancha', 'Ponce', 'Nice Boardwalk','http://localhost:9000/images/guancha.jpg');
INSERT INTO attractions VALUES (15,'La Parguera', 'Lajas', 'Nice family place','http://localhost:9000/images/parguera.jpg');
INSERT INTO attractions VALUES (16,'Cuevas de Camuy', 'Camuy', 'Lots of bats','http://localhost:9000/images/cuevascamuy.jpg');
INSERT INTO attractions VALUES (17,'Bio Bay', 'Fajardo', 'Green water woohoo','http://localhost:9000/images/biobay.jpg');
INSERT INTO attractions VALUES (18,'Kioskos de Luquillo', 'Luquillo', 'Comete un coco y una alcapuria','http://localhost:9000/images/kioskos.jpg');
INSERT INTO attractions VALUES (19,'Giligans Island', 'Guanica', 'Overated','http://localhost:9000/images/giligans.jpg');
INSERT INTO attractions VALUES (20,'Isla de Mona', 'Mayaguez', 'No, there are no monkeys','http://localhost:9000/images/mona.jpg');
INSERT INTO attractions VALUES (21,'Caja De Muerto', 'Ponce', 'No dead bodies here :(','http://localhost:9000/images/muerto.jpg');
INSERT INTO attractions VALUES (22,'Palomino Island', 'Fajardo', 'Private Island pa riquitillos','http://localhost:9000/images/palomino.jpg');
INSERT INTO attractions VALUES (23,'Casa Pueblo', 'Adjuntas', 'A house','http://localhost:9000/images/casapueblo.jpg');
INSERT INTO attractions VALUES (24,'Mar Chiquita', 'Manati', 'Awesome Beach','http://localhost:9000/images/chiquita.jpg');
INSERT INTO attractions VALUES (25,'Zoologico', 'Mayaguez', 'A zoo where animals get mistreated and dont get fed.','http://localhost:9000/images/zoo.jpg');
INSERT INTO attractions VALUES (26,'Cueva del Indio', 'Arecibo', 'Awesome caves','http://localhost:9000/images/cuevadelindio.jpg');
INSERT INTO attractions VALUES (27,'Museo de Artes', 'San Juan', 'Nice boring museum','http://localhost:9000/images/museo.jpg');
INSERT INTO attractions VALUES (28,'Playa Sucia', 'Cabo Rojo', 'Awesome beach and has a lighthouse too','http://localhost:9000/images/playasucia.jpg');
INSERT INTO attractions VALUES (29,'Castillo Seralles', 'Ponce', 'A Castle','http://localhost:9000/images/castillo.jpg');
INSERT INTO attractions VALUES (30,'Ice Skating Arena', 'Aguadilla', 'Want to fall? Come here','http://localhost:9000/images/iceskating.jpg');
INSERT INTO attractions VALUES (31,'Guavate', 'Cayey', 'Eat Pork, but not your wife','http://localhost:9000/images/guavate.jpg');
INSERT INTO attractions VALUES (32,'Icacos', 'Fajardo', 'Small but worth it','http://localhost:9000/images/icacos.jpg');
INSERT INTO attractions VALUES (33,'Observatorio de Arecibo', 'Arecibo', 'Big telescope with a ball.','http://localhost:9000/images/observatorio.jpg');
INSERT INTO attractions VALUES (34,'Bacardi Tour', 'Catano', 'Make sure to get the free drinks','http://localhost:9000/images/bacardi.jpg');
INSERT INTO attractions VALUES (35, 'Jobos Beach', 'Isabela', 'Awesome Beach','http://localhost:9000/images/jobos.jpg');
INSERT INTO attractions VALUES (36,'La Perla', 'San Juan', 'Make sure you are not a cop','http://localhost:9000/images/laperla.jpg');
INSERT INTO attractions VALUES (37,'Guajataca', 'Quebradillas', 'Camp here','http://localhost:9000/images/guajataca.jpg');
INSERT INTO attractions VALUES (38,'Las Croabas', 'Fajardo', 'Eat an arepa','http://localhost:9000/images/croabas.jpg');
INSERT INTO attractions VALUES (39,'Baños de Coamo', 'Coamo', 'Thermal Baths','http://localhost:9000/images/banos.jpg');
INSERT INTO attractions VALUES (40,'Bahia Urbana', 'San Juan', ' Chill Here','http://localhost:9000/images/bahiaurbana.jpg');
INSERT INTO attractions VALUES (41,'Portacoeli Church', 'San German', 'Another church','http://localhost:9000/images/portacoeli.jpg');
INSERT INTO attractions VALUES (42,'Ocean Park', 'San Juan', 'Awesome beach next to Lloren Torres, bring a gun.','http://localhost:9000/images/ocean.jpg');
INSERT INTO attractions VALUES (43,'Las Cabezas de San Juan', 'Fajardo', 'Natural reserve.','http://localhost:9000/images/cabezas.jpg');
INSERT INTO attractions VALUES (44,'Tibes Indigenous Ceremonial Center', 'Ponce', 'Tainos (naked women)','http://localhost:9000/images/tibes.jpg');
INSERT INTO attractions VALUES (45,'Lago Dos Bocas', 'Utuado', 'Fake Lake.','http://localhost:9000/images/dosbocas.jpg');


INSERT INTO events VALUES (1,1,'Geraldo is going to el Yunque', '2016-11-7 10:20:00', '2016-11-7 11:20:00',false,3);
INSERT INTO events VALUES (2,2, 'Harry is going to Cueva Ventana', '2016-11-7 10:20:00', '2016-11-7 11:20:00',false,1);
INSERT INTO events VALUES (3,3, 'Abdiel is going to El Morro', '2016-11-7 10:20:00', '2016-11-7 11:20:00',false,4);
INSERT INTO events VALUES (4,4, 'Harambe is going to las Cascadas', '2016-11-7 10:20:00', '2016-11-7 11:20:00',false,2);

INSERT INTO albums VALUES (1,1,4,'El Yunque');
INSERT INTO albums VALUES (2,1,3,'El Morro');
INSERT INTO albums VALUES (3,1,1,'Cueva Ventana');
INSERT INTO albums VALUES (4,1,2,'Las Cascadas');


INSERT INTO wishlist VALUES (1,1);
INSERT INTO wishlist VALUES (1,2);
INSERT INTO wishlist VALUES (1,3);
INSERT INTO wishlist VALUES (1,4);
INSERT INTO wishlist VALUES (2,1);
INSERT INTO wishlist VALUES (2,2);
INSERT INTO wishlist VALUES (2,3);
INSERT INTO wishlist VALUES (2,4);
INSERT INTO wishlist VALUES (3,1);
INSERT INTO wishlist VALUES (3,2);
INSERT INTO wishlist VALUES (3,3);
INSERT INTO wishlist VALUES (3,4);
INSERT INTO wishlist VALUES (4,1);
INSERT INTO wishlist VALUES (4,2);
INSERT INTO wishlist VALUES (4,3);
INSERT INTO wishlist VALUES (4,4);

INSERT INTO services VALUES (1,1,'Cueva Ventana Entrance',12);
INSERT INTO services VALUES (2,2,'Las Cascadas Entrance',16);
INSERT INTO services VALUES (4,3,'El Yunque Tour',14);
INSERT INTO services VALUES (3,4,'El Morro Entrance',6);
INSERT INTO services VALUES (3,5,'El Morro Tour',12);
INSERT INTO services VALUES (5,6,'Culebra Ferry Tickets',4);


INSERT INTO posts VALUES (1,1, 'El salto de Dona Juana was scary', 'title', '2016-11-18', '07:30 am',40,3,2);
INSERT INTO posts VALUES (1,2, 'Crash Boat was awesome', 'title', '2016-12-10', '09:30 pm',10,8,4);
INSERT INTO posts VALUES (1,3, 'PortaCoeli was one more church', 'title', '2016-11-18', '07:30 am',40,3,5);
INSERT INTO posts VALUES (1,4, 'Tibes Ceremonial Park was fun', 'title', '2016-12-10', '09:30 pm',10,8,6);
INSERT INTO posts VALUES (1,5, 'El yunque is great', 'title', '2016-11-18', '07:30 am',40,3,7);
INSERT INTO posts VALUES (1,6, 'Culebra was a pain to get to ', 'title', '2016-12-10', '09:30 pm',10,8,1);
INSERT INTO posts VALUES (1,7, 'El morro was historic', 'title', '2016-11-18', '07:30 am',40,3,2);
INSERT INTO posts VALUES (1,8, 'Vieques is better than Culebra', 'title', '2016-12-10', '09:30 pm',10,8,2);
INSERT INTO posts VALUES (1,9, 'Las cascadas was fun', 'title', '2016-11-18', '07:30 am',40,3,2);
INSERT INTO posts VALUES (1,10, 'El parque de las ciencias estuvo interesante', 'title', '2016-12-10', '09:30 pm',10,8,2);

INSERT INTO notifications VALUES (1,1, 'Harry commented on your photo',1,null,2);
INSERT INTO notifications VALUES (2,2, 'Geraldo liked your post.',null,1,1);
INSERT INTO notifications VALUES (3,1, 'Harambe commented on an attraction',3,null,4);
INSERT INTO notifications VALUES (4,1, 'Abdiel liked your photo',null,2,3);

INSERT INTO picture VALUES (1,1,'Pasandola brutal en cueva ventana',12,4,'http://localhost:9000/images/pasandolabrutal.jpg',3);
INSERT INTO picture VALUES (2,2,'Tirandome por la chorrera',18,2,'http://localhost:9000/images/chorrera.jpg',4);
INSERT INTO picture VALUES (3,3,'Las famosas garritas',12,4,'http://localhost:9000/images/garita.jpg',2);
INSERT INTO picture VALUES (4,4,'La mina',12,4,'http://localhost:9000/images/mina.jpg',1);

INSERT INTO comments VALUES (1, 2,'Awesome photos', '2016-11-18', '07:30 am',null,null,1);
INSERT INTO comments VALUES (2, 2, 'Great adventure', '2016-11-18', '07:30 am',1);
INSERT INTO comments VALUES (3, 1, 'This attraction was awesome', '2016-11-23', '07:30 am',null,1);
INSERT INTO comments VALUES (4, 4, 'Awesome', '2016-11-18', '07:30 am',null,null,1);
INSERT INTO comments VALUES (5, 2, 'Nice attraction!', '2016-11-03', '07:30 am',null,1);
INSERT INTO comments VALUES (6, 3, 'Had a great time.', '2016-08-18', '07:30 am',null,1);
INSERT INTO comments VALUES (7, 3, 'I wanna go again!', '2016-11-10', '07:30 am',null,2);
INSERT INTO comments VALUES (8, 2, 'Beautiful place', '2016-01-18', '07:30 am',null,2);
INSERT INTO comments VALUES (9, 1, 'Pretty awesome!', '2015-11-18', '07:30 am',null,2);
INSERT INTO comments VALUES (10, 4, 'I wanna go again!', '2016-02-07', '07:30 am',null,3);
INSERT INTO comments VALUES (11, 2, 'Beautiful place', '2016-04-01', '07:30 am',null,3);
INSERT INTO comments VALUES (12, 3, 'Pretty awesome!', '2016-09-16', '07:30 am',null,3);
INSERT INTO comments VALUES (13, 3, 'This attraction was awesome', '2013-1-18', '07:30 am',null,4);
INSERT INTO comments VALUES (14, 2, 'Nice attraction!', '2016-07-26', '07:30 am',null,4);
INSERT INTO comments VALUES (15, 4, 'Had a great time.', '2016-03-07', '07:30 am',null,4);
INSERT INTO comments VALUES (16, 1, 'Nice attraction!', '2016-05-19', '07:30 am',null,5);
INSERT INTO comments VALUES (17, 3, 'I wanna go again!', '2016-09-14', '07:30 am',null,5);
INSERT INTO comments VALUES (18, 2, 'Nice attraction!', '2016-08-12', '07:30 am',null,5);
INSERT INTO comments VALUES (19, 2,'Awesome photos', '2016-11-18', '07:30 am',10,null,1);
INSERT INTO comments VALUES (20, 3, 'Great adventure', '2016-11-18', '07:30 am',10);
INSERT INTO comments VALUES (21, 2,'Awesome photos', '2016-11-18', '07:30 am',10,null,2);
INSERT INTO comments VALUES (22, 4, 'Great adventure', '2016-11-18', '07:30 am',10);
INSERT INTO comments VALUES (23, 6,'Awesome photos', '2016-11-18', '07:30 am',10,null,2);
INSERT INTO comments VALUES (24, 2, 'Great adventure', '2016-11-18', '07:30 am',10);
INSERT INTO comments VALUES (25, 2,'Awesome photos', '2016-11-18', '07:30 am',10,null,1);
INSERT INTO comments VALUES (26, 2, 'Great adventure', '2016-11-18', '07:30 am',10);
INSERT INTO comments VALUES (27, 2,'Awesome photos', '2016-11-18', '07:30 am',10,null,1);
INSERT INTO comments VALUES (28, 2, 'Great adventure', '2016-11-18', '07:30 am',10);
INSERT INTO comments VALUES (29, 2,'Awesome photos', '2016-11-18', '07:30 am',10,null,1);
INSERT INTO comments VALUES (30, 2, 'Great adventure', '2016-11-18', '07:30 am',10);

ALTER TABLE ONLY users
    ADD CONSTRAINT users_uusername_key UNIQUE (uusername);
ALTER TABLE ONLY users
    ADD CONSTRAINT users_uemail_key UNIQUE (uemail);
ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (uid);



ALTER TABLE ONLY attractions
    ADD CONSTRAINT attractions_pkey PRIMARY KEY (aid);

ALTER TABLE ONLY posts
    ADD CONSTRAINT posts_pkey PRIMARY KEY (pid);
ALTER TABLE ONLY posts
    ADD CONSTRAINT posts_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);

ALTER TABLE ONLY albums
    ADD CONSTRAINT albums_pkey PRIMARY KEY (albumid);
ALTER TABLE ONLY albums
    ADD CONSTRAINT albums_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);
ALTER TABLE ONLY albums
    ADD CONSTRAINT albums_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);

ALTER TABLE ONLY picture
    ADD CONSTRAINT picture_pkey PRIMARY KEY (picid);
ALTER TABLE ONLY picture
    ADD CONSTRAINT picture_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);
ALTER TABLE ONLY picture
    ADD CONSTRAINT picture_albumid_fkey FOREIGN KEY (albumid) REFERENCES albums(albumid);

ALTER TABLE ONLY comments
    ADD CONSTRAINT comments_pkey PRIMARY KEY (cid);
ALTER TABLE ONLY comments
    ADD CONSTRAINT comments_pid_fkey FOREIGN KEY (pid) REFERENCES posts(pid);
ALTER TABLE ONLY comments
    ADD CONSTRAINT comments_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);
ALTER TABLE ONLY comments
    ADD CONSTRAINT comments_picid_fkey FOREIGN KEY (picid) REFERENCES picture(picid);

ALTER TABLE ONLY notifications
    ADD CONSTRAINT notifications_pkey PRIMARY KEY (nid);
ALTER TABLE ONLY notifications 
    ADD CONSTRAINT notifications_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);
ALTER TABLE ONLY notifications 
    ADD CONSTRAINT notifications_cid_fkey FOREIGN KEY (cid) REFERENCES comments(cid);
ALTER TABLE ONLY notifications 
    ADD CONSTRAINT notifications_authorid_fkey FOREIGN KEY (authorid) REFERENCES users(uid);


ALTER TABLE ONLY events
    ADD CONSTRAINT events_pkey PRIMARY KEY (eid);
ALTER TABLE ONLY events 
    ADD CONSTRAINT events_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);
ALTER TABLE ONLY events 
    ADD CONSTRAINT events_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);


ALTER TABLE ONLY services
    ADD CONSTRAINT services_pkey PRIMARY KEY (sid);
ALTER TABLE ONLY services
    ADD CONSTRAINT services_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);

ALTER TABLE ONLY friends
    ADD CONSTRAINT friends_pkey PRIMARY KEY (randomid);
ALTER TABLE ONLY friends
    ADD CONSTRAINT friends_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);
ALTER TABLE ONLY friends
    ADD CONSTRAINT friends_fid_fkey FOREIGN KEY (fid) REFERENCES users(uid);


ALTER TABLE ONLY wishlist
    ADD CONSTRAINT wishlist_uid_fkey FOREIGN KEY (uid) REFERENCES users(uid);
ALTER TABLE ONLY wishlist
    ADD CONSTRAINT wishlist_aid_fkey FOREIGN KEY (aid) REFERENCES attractions(aid);