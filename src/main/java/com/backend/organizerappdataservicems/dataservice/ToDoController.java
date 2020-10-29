package com.backend.organizerappdataservicems.dataservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.organizerappdataservicems.bean.ToDoListId;
import com.backend.organizerappdataservicems.bean.ToDoListItem;
import com.backend.organizerappdataservicems.bean.ToDoMasterListItem;

/*
 * REST API used at Front end
 * get("/api/todomasterlist");
 * get("/api/todomasterlist/" + listId);
 * put("/api/todomasterlist/" + listId, JSON.stringify(jsonBody), this.httpOptions);
 * 
 * 
 */
@RestController
@RequestMapping("/api")
public class ToDoController {
	
	@Autowired
	ToDoMasterListRepository toDoMasterListRepository;
	
	@Autowired
	ToDoListRepository toDoListRepository;
	
	@GetMapping("/todomasterlist")
	List<ToDoMasterListItem> retrieveToDoMasterList() {
		
		List<ToDoMasterListItem> masterlist = toDoMasterListRepository.findAll();
		List<ToDoListItem> list = toDoListRepository.findAll();
		
		for(int i=0; i< masterlist.size(); ++i) {
			
			List<ToDoListItem> todolist = new ArrayList<ToDoListItem>();
			for(int j=0;j<list.size();++j ) {
				if(masterlist.get(i).getId().equalsIgnoreCase(list.get(j).getListId())) {
					todolist.add(list.get(j));
				}
			}
			masterlist.get(i).setTodolist(todolist);
		}
		
		return masterlist;
	}
	
	@GetMapping("/todomasterlist/{id}")
	ToDoMasterListItem retrieveToDoMasterListItem(@PathVariable String id) {
		
		ToDoMasterListItem toDoMasterListItem = toDoMasterListRepository.findById(id).get();
		List<ToDoListItem> list = toDoListRepository.findAll();
		
		List<ToDoListItem> todolist = new ArrayList<ToDoListItem>();
		
		for(int j=0;j<list.size();++j ) {
			if(toDoMasterListItem.getId().equalsIgnoreCase(list.get(j).getListId())) {
				todolist.add(list.get(j));
			}
		}
		toDoMasterListItem.setTodolist(todolist);
		
		
		return toDoMasterListItem;
	}
	
	@PutMapping(path="/todomasterlist/{id}",
			consumes=MediaType.APPLICATION_JSON_VALUE, 
		    produces =MediaType.APPLICATION_JSON_VALUE)
	ToDoMasterListItem updateToDoMasterListItem(@PathVariable String id, @RequestBody ToDoMasterListItem todoMasterListItem ) {
		
		//master list item
		ToDoMasterListItem masterlistitem = new ToDoMasterListItem();
		masterlistitem.setId(todoMasterListItem.getId());
		masterlistitem.setTitle(todoMasterListItem.getTitle());
		toDoMasterListRepository.save(masterlistitem);
		
		//todo list
		List<ToDoListItem> listitems = todoMasterListItem.getTodolist();
		for(int i=0; i< listitems.size(); ++i) {
			listitems.get(i).setListId(id);
		}
		toDoListRepository.saveAll(listitems);
		
		
		return todoMasterListItem;
	}
	
	@PostMapping(path="/todomasterlist",
			consumes=MediaType.APPLICATION_JSON_VALUE, 
		    produces =MediaType.APPLICATION_JSON_VALUE)
	ToDoMasterListItem updateToDoMasterList( @RequestBody ToDoMasterListItem todoMasterListItem ) {
		
		return toDoMasterListRepository.save(todoMasterListItem);
	}
	
	@DeleteMapping(path="/todomasterlist/{id}",
			consumes=MediaType.APPLICATION_JSON_VALUE)
	String deleteToDoMasterListItemById(@PathVariable String id) {
		
		List<ToDoListItem> todolist = toDoListRepository.findAll();
		
		//delete the items in the master list
		todolist.forEach((item)->{
			if(item.getListId().equalsIgnoreCase(id)) {
				System.out.println("ID:"+id);
				ToDoListId primaryId = new ToDoListId(item.getId(), id);
				System.out.println("DELETE BY ID master ID: "+id+" ID: "+item.getId());
				toDoListRepository.deleteById(primaryId);
			}
			
		});
		
//		//delete the whole master list entry
		toDoMasterListRepository.deleteById(id);
		System.out.println("DELETE BY ID from todomasterlist - "+id);
		
		return "{}";
	}
	
//	, produces =MediaType.APPLICATION_JSON_VALUE
	
	@GetMapping("/todolist")
	List<ToDoListItem> retrieveToDoList() {
		List<ToDoListItem> list = toDoListRepository.findAll();
		
		return list;
	}

}
