/*
CREATE DATABASE IF NOT EXISTS `baseball`;
CREATE USER 'sqoopuser'@'localhost' IDENTIFIED BY 'sqooppassword';
GRANT ALL PRIVILEGES ON baseball.* TO 'sqoopuser'@'localhost';
*/

use baseball;
create table home_games(
id int not null auto_increment primary key,
year int,
league varchar(10),
team varchar(10), 
park varchar(10),
first date,
last date,
games int,
openings int,
attendance int);
