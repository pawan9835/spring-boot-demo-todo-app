package in.todo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToDoData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int todoId;
	private String title;
	private Date date;
	private String msg;
	private String status;

	public String getTitle() {
		return title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ToDoData [todoId=" + todoId + ", title=" + title + ", date=" + date + ", msg=" + msg + ", status="
				+ status + "]";
	}

	
	

}
