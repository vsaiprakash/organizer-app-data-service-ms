package com.backend.organizerappdataservicems.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/*
 *        "id": 1,
          "completed": true,
          "content": "sugar"
 */
@Entity
@Table(name="todolist")
@IdClass(ToDoListId.class)
public class ToDoListItem {
	
	@Id
	private Integer id;
	@Id
	@Column(name="list_id")
	private Integer listId;
	private Boolean completed;
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getListId() {
		return listId;
	}
	public void setListId(Integer listId) {
		this.listId = listId;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
