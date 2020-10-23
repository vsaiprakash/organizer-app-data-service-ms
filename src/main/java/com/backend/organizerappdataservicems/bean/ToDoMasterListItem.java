package com.backend.organizerappdataservicems.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 *    "id": 1,
      "title": "Grociers",
      "todolist": array of  ToDoListItem s
 */

@Entity
@Table(name="todomasterlist")
public class ToDoMasterListItem {
	
	@Id
	public Integer id;
	public String title;

}
