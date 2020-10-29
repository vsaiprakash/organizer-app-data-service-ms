package com.backend.organizerappdataservicems.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Array of ToDoMasterListItem s
 */


public class ToDoListId implements Serializable {
	
	//Item Id
	@Id
	private String id;
	
	//MasterList's Id
	@Id
	@Column(name="list_id")
	private String listId;
	
	public ToDoListId(String id, String listId) {
		super();
		this.id = id;
		this.listId = listId;
	}
	
	public ToDoListId() {
		
	}

}
