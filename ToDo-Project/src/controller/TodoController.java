package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.*;

import entity.ToDo;
import model.ToDoModel;

@ManagedBean(name = "todoController")
@SessionScoped
public class TodoController implements Serializable {

	ToDoModel todoModel = new ToDoModel();
	ToDo todo = new ToDo();

	public List<ToDo> todoList() {
		return todoModel.findAll();
	}

	public String add() {
		this.todoModel.save(todo);
		todo = new ToDo();
		return "index";
	}

	public void delete(ToDo todo) {
		this.todoModel.delete(todo);

	}

	public void deleteAll(ToDo todo) {
		this.todoModel.deleteAll(todo);
	}

	public ToDo getTodo() {
		return todo;
	}

	public void setTodo(ToDo todo) {
		this.todo = todo;
	}

}
