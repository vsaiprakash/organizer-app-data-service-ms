package com.backend.organizerappdataservicems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.organizerappdataservicems.bean.ToDoMasterListItem;
import com.backend.organizerappdataservicems.dataservice.ToDoMasterListRepository;

@SpringBootApplication
public class OrganizerAppDataServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizerAppDataServiceMsApplication.class, args);
	}

}
