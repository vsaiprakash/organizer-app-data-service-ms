package com.backend.organizerappdataservicems.dataservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.organizerappdataservicems.bean.ToDoMasterListItem;

@Repository
public interface ToDoMasterListRepository extends JpaRepository<ToDoMasterListItem, Integer>{
	//Get
	List<ToDoMasterListItem> findAll();
	Optional<ToDoMasterListItem> findById(Integer id);
	
	//Update/Put
	ToDoMasterListItem save(ToDoMasterListItem item);
	//Delete a master list
	void deleteById(int id);
//	List<ToDoMasterListItem> saveAll(List<ToDoMasterListItem> itemList);
}
