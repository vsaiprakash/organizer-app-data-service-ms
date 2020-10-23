/*
{
  "todomasterlist": [
    {
      "id": 1,
      "title": "Grociers",
      "todolist": [
        {
          "id": 1,
          "completed": true,
          "content": "sugar"
        },
        {
          "id": 2,
          "completed": false,
          "content": "dhal"
        }
      ]
    },
    {
      "id": 2,
      "title": "Homework",
      "todolist": [
        {
          "id": "1",
          "completed": false,
          "content": "social"
        },
        {
          "id": "2",
          "completed": true,
          "content": "math"
        }
      ]
    }
  ]
}
=============================================================================================
*/

CREATE TABLE todomasterlist ( id int, title varchar(255), PRIMARY KEY (id));

CREATE TABLE todolist ( id int, list_id int, completed boolean, content varchar(255), PRIMARY KEY (id, list_id), FOREIGN KEY (list_id) REFERENCES todomasterlist(id));

INSERT INTO todomasterlist(id, title) VALUES (1,'Grociers');
INSERT INTO todomasterlist(id, title) VALUES (2,'Homework');

INSERT INTO todolist(id, list_id, completed, content) VALUES (1,1,true,'sugar');
INSERT INTO todolist(id, list_id, completed, content) VALUES (2,1,false,'dhal');
INSERT INTO todolist(id, list_id, completed, content) VALUES (1,2,false,'social');
INSERT INTO todolist(id, list_id, completed, content) VALUES (2,2,true,'math');



