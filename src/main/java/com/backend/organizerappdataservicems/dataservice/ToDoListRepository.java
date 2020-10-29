package com.backend.organizerappdataservicems.dataservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.organizerappdataservicems.bean.ToDoListId;
import com.backend.organizerappdataservicems.bean.ToDoListItem;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoListItem, ToDoListId> {
	//Get
	List<ToDoListItem> findAll();
	Optional<ToDoListItem> findById(Integer id);
	
	//Update/Put
	ToDoListItem save(ToDoListItem item);
	//Delete an item from master list
//	void delete(ToDoListItem item);
	//Delete a master list & its items
	void deleteById(ToDoListId id);
//	int deleteByIdAndListId(int id, int listId);
//	List<ToDoListItem> saveAll(List<ToDoListItem> itemList);
}
