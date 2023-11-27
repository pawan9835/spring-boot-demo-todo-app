package in.todo.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.todo.model.ToDoData;
import in.todo.model.service.IToDoService;

@Controller
public class ToDoController{
	
	Logger  logger = LoggerFactory.getLogger(ToDoController.class);
	@Autowired
	 private IToDoService doService;


	@GetMapping("/testApp")
	public String testApp() {
		
		  logger.info("APplication is up and running .......");
		
		return "testApp";
	}
	
	
	@GetMapping("/todo")
	public String testAppMVC() {
		
		  logger.info("Accessing the Home page  .......");
		
		return "ToDoView";
	}
	
	@PostMapping("/save")
	public String saveOrUpdateToDoList(Model model ,@ModelAttribute("message")ToDoData toDoData) {
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		toDoData.setDate(date);
	    doService.saveOrUpdateToDoList(toDoData);
	    
	    model.addAttribute("data",toDoData);
	    
	    logger.info("save data performed.......");
         
		return "ToDoView";
	}

	@GetMapping(value = "/todoId/{toDoId}")
	public ToDoData getTodoItemByItems(@PathVariable int toDoId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@PutMapping("/updateSts/")
	public boolean updateStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@GetMapping(value = "/viewAllList")
	public String getAllToDo(Model model) {
		
		  logger.info("Enter into getALlTodo list  .......");
		
		  Boolean status =false;
		List<ToDoData> todoList  ;//=   doService.getAllToDo();
  
todoList = new ArrayList();

       todoList.add("To Do View Under Development ");
		 model.addAttribute("todoList", todoList);
		  logger.info("returning with data  ......."+todoList);
		  
		      if (!todoList.isEmpty()||todoList!=null) {
				return "ViewAll";
			}
		      else {
		    	  return "error";
		      }
		    
		
	}

	
	@DeleteMapping("/delete")
	public boolean deleteToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
