use alexandria;


insert into author values (1, 'Jamie Chan');
insert into media values (100000, 'Java: Learn Java in One Day and Learn It Well.', '978-1539397830', 1, 1, "BOOK");

insert into author values (2, 'Kathy Sierra');
insert into media values (100001, 'Head First Java, 2nd Edition', '978-0596009205', 1, 2, "BOOK");

insert into author values (3, 'Herbert Schildt');
insert into media values (100002, 'Java: The Complete Reference, Ninth Edition', '978-0071808552', 1, 3, "BOOK");

insert into author values (4, 'Steve Tale');
insert into media values (100003, 'Java: The Ultimate Beginners Guide to Java Programming', '978-1539591214', 1, 4, "BOOK");
insert into media values (100004, 'JavaScript: The Ultimate Beginners Guide', '978-1539984634', 1, 4, "BOOK");
insert into media values (100005, 'SQL: The Ultimate Beginners Guide - Learn SQL Today', '978-1533604569', 1, 4, "BOOK");

insert into author values (5, 'John Joseph Stockdale');
insert into media values (100006, 'Island of Java (Periplus Classics Series)', '978-9628734238', 1, 5, "BOOK");

insert into author values (6, 'John MacKinnon');
insert into media values (100007, 'A Field Guide to the Birds of Borneo, Sumatra, Java, and Bali: The Greater Sunda Islands', '978-0198540342', 1, 6, "BOOK");

insert into author values (7, 'Dian Pramesti');
insert into media values (100008, 'Greater Than a Tourist – Java, Indonesia: 50 Travel Tips from a Local', '978-1521199466', 1, 7, "BOOK");

insert into author values (8, 'Jeffrey E. F. Friedl');
insert into media values (100009, 'Mastering Regular Expressions', '978-0596528126', 1, 8, "BOOK");


INSERT INTO author (id,name)
VALUES (9, "Kathy Sierra"),
		(10,"Herbert Schildt"),
        (11,"Elisabeth Robson"),
        (12,"Y. Daniel Liang"),
        (13,"Royne Mercurio");
        
        
 insert into person (id, name)
 values (1,"Oscar Person"),
		 (2,"Mona Muffins"),
		 (3,"Pia Pralin"),
		 (4,"Willy Wonka"),
		 (5,"Daniel Smith"),
		 (6,"Tina Forrest"),
		 (7,"David Karlsson"),
		 (8,"Lisa Nilsson");
         
         
 INSERT INTO Media (id,name, ISBN, status,authorID, mediatype)
VALUES (1000,"Head First Java 2nd Edition", 9780596009205,1, 9, "BOOK"),
(1001, "Java: A Beginner's Guide Sixth Edition",9780071809252, 1, 10, "BOOK"),
(1002, "Introduction to Java Programming: Brief Version, 10th Edition", 9780596007126, 1,11, "BOOK"),
(1003, "Intro to Java Programming, Comprehensive Version (10th Edition)", 9780133761313,2, 12, "BOOK"),
(1004, "Herregud & Co. Familjekalender 2018", 9789173875714,1, 13, "BOOK"); 


insert into loan (id, personid, mediaid, dateOut, dueBack, returned, fee)
values 	(1, 4, 1000, "2017-01-01", "2017-03-27", "2017-09-01", "500 kr"),
		(2, 8, 1001, "2017-02-01", "2017-04-27", "2017-04-27", ""),
		(3, 2, 1002, "2017-05-10", "2017-08-27", "2017-09-27", "50 kr"),
		(4, 3, 1003, "2017-08-27", "2017-10-27", null, ""),
		(5, 3, 1004, "2017-08-27", "2017-10-27", "2017-09-30", "");

         
      

