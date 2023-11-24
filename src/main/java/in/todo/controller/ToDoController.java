package in.todo.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

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
	@Autowired
	 private IToDoService doService;


	@GetMapping("/testApp")
	public String testApp() {
		
		
		return "testApp";
	}
	
	
	@GetMapping("/todo")
	public String testAppMVC() {
		
		
		
		return "ToDoView";
	}
	
	@PostMapping("/save")
	public String saveOrUpdateToDoList(Model model ,@ModelAttribute("message")ToDoData toDoData) {
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		toDoData.setDate(date);
	    doService.saveOrUpdateToDoList(toDoData);
	    
	    model.addAttribute("data",toDoData);
         
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

	
	@GetMapping(value = "/viewALl")
	public String getAllToDo(Model model) {
		
		
		
		List<ToDoData> todoList  =   doService.getAllToDo();
		 model.addAttribute("todoList", todoList);
		  
		return "ViewAll";
	}

	
	@DeleteMapping("/delete")
	public boolean deleteToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
