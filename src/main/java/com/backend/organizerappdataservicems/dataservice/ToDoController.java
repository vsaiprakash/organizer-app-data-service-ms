package com.backend.organizerappdataservicems.dataservice;

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
	
	@GetMapping("/todomasterlist")
	ToDoMasterList retrieveToDoMasterList() {
		return null;
	}
	
	@GetMapping("/todomasterlist/{id}")
	ToDoMasterListItem retrieveToDoMasterListItem(@PathVariable int id) {
		return null;
	}
	
	@PutMapping(path="/todomasterlist/{id}",
			consumes=MediaType.APPLICATION_JSON_VALUE, 
		    produces =MediaType.APPLICATION_JSON_VALUE)
	ToDoMasterListItem updateToDoMasterListItem(@PathVariable int id, @RequestBody ToDoMasterListItem todoMasterListItem ) {
		return null;
	}

}
