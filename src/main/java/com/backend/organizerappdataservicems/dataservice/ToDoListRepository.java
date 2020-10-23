package com.backend.organizerappdataservicems.dataservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.organizerappdataservicems.bean.ToDoListItem;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoListItem, Integer> {
	//Get
	List<ToDoListItem> findAll();
	Optional<ToDoListItem> findById(Integer id);
	
	//Update/Put
	ToDoListItem save(ToDoListItem item);
//	List<ToDoListItem> saveAll(List<ToDoListItem> itemList);
}
