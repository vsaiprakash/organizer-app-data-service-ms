package com.backend.organizerappdataservicems.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Array of ToDoMasterListItem s
 */


public class ToDoListId implements Serializable {
	
	@Id
	private Integer id;
	@Id
	@Column(name="list_id")
	private Integer listId;
	
	public ToDoListId(Integer id, Integer listId) {
		super();
		this.id = id;
		this.listId = listId;
	}
	
	public ToDoListId() {
		
	}

}
