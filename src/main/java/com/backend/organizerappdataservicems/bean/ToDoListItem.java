package com.backend.organizerappdataservicems.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *        "id": 1,
          "completed": true,
          "content": "sugar"
 */
@Entity
public class ToDoListItem {
	
	@Id
	public Integer id;
	public Integer listId;
	public Boolean completed;
	public String content;

}
