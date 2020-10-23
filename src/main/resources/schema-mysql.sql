CREATE TABLE todomasterlist ( id int, title varchar(255), PRIMARY KEY (id));

CREATE TABLE todolist ( id int, listId int, completed boolean, content varchar(255), PRIMARY KEY (id, listId), FOREIGN KEY (listId) REFERENCES todomasterlist(id));

INSERT INTO todomasterlist(id, title) VALUES (1,'Grociers');
INSERT INTO todomasterlist(id, title) VALUES (2,'Homework');

INSERT INTO todolist(id, listId, completed, content) VALUES (1,1,true,'sugar');
INSERT INTO todolist(id, listId, completed, content) VALUES (2,1,false,'dhal');
INSERT INTO todolist(id, listId, completed, content) VALUES (1,2,false,'social');
INSERT INTO todolist(id, listId, completed, content) VALUES (2,2,true,'math');
