package in.todo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.todo.model.ToDoData;
import in.todo.model.repo.ToDoRepo;

@Service
public class TodoServiceImpl implements IToDoService{
	
	@Autowired
	private ToDoRepo doRepo;

	@Override
	public String saveOrUpdateToDoList(ToDoData doData) {
         doRepo.save(doData);
         
         System.out.println(doData);
		return "Saved";
	}

	@Override
	public ToDoData getTodoItemByItems(int toDoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ToDoData> getAllToDo() {
		
		    
		return doRepo.findAll();
	}

	@Override
	public boolean deleteToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
