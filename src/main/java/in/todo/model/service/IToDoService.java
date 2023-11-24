package in.todo.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.todo.model.ToDoData;


public interface IToDoService {

	public String saveOrUpdateToDoList(ToDoData doData);

	public ToDoData getTodoItemByItems(int toDoId);

	public boolean updateStatus();

	public List<ToDoData> getAllToDo();

	public boolean deleteToDo(int id);

}
