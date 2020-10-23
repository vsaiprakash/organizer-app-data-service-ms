package com.backend.organizerappdataservicems.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/*
 *    "id": 1,
      "title": "Grociers",
      "todolist": array of  ToDoListItem s
 */

@Entity
@Table(name="todomasterlist")
public class ToDoMasterListItem {
	
	@Id
	private Integer id;
	private String title;
	
	//added the list manually
	@Transient
	private List<ToDoListItem> todolist;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ToDoListItem> getTodolist() {
		return todolist;
	}

	public void setTodolist(List<ToDoListItem> todolist) {
		this.todolist = todolist;
	}
	
	

}
