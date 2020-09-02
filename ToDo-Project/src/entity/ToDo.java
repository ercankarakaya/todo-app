package entity;

import java.io.Serializable;
import java.util.Date;

public class ToDo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String toDoName;

	private Integer items;
	public static int INCREMENT=0;


	public ToDo() {
		this.id = INCREMENT;

	}

	public ToDo(String toDoName) {
		super();
		this.toDoName = toDoName;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToDoName() {
		return toDoName;
	}

	public void setToDoName(String toDoName) {
		this.toDoName = toDoName;
	}

	public Integer getItems() {
		items = INCREMENT;
		return items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", toDoName=" + toDoName + "]";
	}

}
