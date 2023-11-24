package in.todo.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.todo.model.ToDoData;

@Repository
public interface ToDoRepo extends JpaRepository<ToDoData,Integer>{

}
