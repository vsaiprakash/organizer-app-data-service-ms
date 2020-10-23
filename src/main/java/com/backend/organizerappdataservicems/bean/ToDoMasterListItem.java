package com.backend.organizerappdataservicems.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *    "id": 1,
      "title": "Grociers",
      "todolist": array of  ToDoListItem s
 */

@Entity
public class ToDoMasterListItem {
	
	@Id
	public Integer id;
	public String title;

}
