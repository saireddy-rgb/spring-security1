1. this project spring security1 is about authenticating and to the verify the details user gave and check with the database to see whether the user is present or not
2. returns the students id , name , marks
 
open sql workbench paste these lines :

create database student;
use student;
create table users (id int primary key, username varchar(255), password varchar(255));
insert into users values(1,"sai","emo"),(2,"laxmi","kanth"),(3,"harsh","harsh");

or enter your own details
press alt+shift+enter.

how to use
2. in application.properties enter your database login details
2. run the project
2. open postman
3. url : localhost:8080/students
4. in the authorization tab select auth type as "basic auth"
5. give the login details 
6. can use any one

this works for get mapping  only for others need csrf token

hit url : localhost:8080
it gives the csrf token copy it

on post mapping 
1. address is : localhost:8080/students
2. enter login details
3. in the headers tab 
4. key : X-CSRF-TOKEN , value : paste csrf token
5. enter the data in jason format 
6. verify on get mapping with the same address

other https methods I will add soon