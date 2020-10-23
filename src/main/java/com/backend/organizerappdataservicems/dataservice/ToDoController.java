package com.backend.organizerappdataservicems.dataservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController("/api")
public class ToDoController {
	
	@Autowired
	ToDoMasterListRepository toDoMasterListRepository;
	
	@Autowired
	ToDoListRepository toDoListRepository;
	
	@GetMapping("/todomasterlist")
	List<ToDoMasterListItem> retrieveToDoMasterList() {
		
		List<ToDoMasterListItem> masterlist = toDoMasterListRepository.findAll();
		List<ToDoListItem> list = toDoListRepository.findAll();
		
		for(int j=0;j<list.size();++j ) {
			System.out.println("listId:"+list.get(j).getListId());
			System.out.println("content:"+list.get(j).getContent());
		}
		
//		for(int i=0; i< masterlist.size(); ++i) {
//			
//			List<ToDoListItem> todolist = new ArrayList<ToDoListItem>();
//			for(int j=0;j<list.size();++j ) {
//				System.out.println("masterlist.get(i).getId()["+i+"]:"+masterlist.get(i).getId()+"list.get(j).getListId()["+j+"]:"+list.get(j).getListId());
//				if(masterlist.get(i).getId()==list.get(j).getListId()) {
//					todolist.add(list.get(j));
//				}
//			}
//			masterlist.get(i).setTodolist(todolist);
//		}
		
		return masterlist;
	}
	
	@GetMapping("/todomasterlist/{id}")
	Optional<ToDoMasterListItem> retrieveToDoMasterListItem(@PathVariable int id) {
		return toDoMasterListRepository.findById(id);
	}
	
	@PutMapping(path="/todomasterlist/{id}",
			consumes=MediaType.APPLICATION_JSON_VALUE, 
		    produces =MediaType.APPLICATION_JSON_VALUE)
	ToDoMasterListItem updateToDoMasterListItem(@PathVariable int id, @RequestBody ToDoMasterListItem todoMasterListItem ) {
		return null;
	}
	
	@GetMapping("/todolist")
	List<ToDoListItem> retrieveToDoList() {
		List<ToDoListItem> list = toDoListRepository.findAll();
		
		return list;
	}

}
