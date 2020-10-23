package com.backend.organizerappdataservicems.dataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.organizerappdataservicems.bean.ToDoMasterList;
import com.backend.organizerappdataservicems.bean.ToDoMasterListItem;

/*
 * REST API used at Front end
 * get("/api/todomasterlist");
 * get("/api/todomasterlist/" + listId);
 * put("/api/todomasterlist/" + listId, JSON.stringify(jsonBody), this.httpOptions);
 * 
 * 
 */
@RestController("/api")
public class ToDoController {
	
	@Autowired
	ToDoMasterListRepository toDoMasterListRepository;
	
	@GetMapping("/todomasterlist")
	List<ToDoMasterListItem> retrieveToDoMasterList() {
		return toDoMasterListRepository.findAll();
	}
	
	@GetMapping("/todomasterlist/{id}")
	ToDoMasterListItem retrieveToDoMasterListItem(@PathVariable int id) {
		return toDoMasterListRepository.getOne(id);
	}
	
	@PutMapping(path="/todomasterlist/{id}",
			consumes=MediaType.APPLICATION_JSON_VALUE, 
		    produces =MediaType.APPLICATION_JSON_VALUE)
	ToDoMasterListItem updateToDoMasterListItem(@PathVariable int id, @RequestBody ToDoMasterListItem todoMasterListItem ) {
		return null;
	}

}
