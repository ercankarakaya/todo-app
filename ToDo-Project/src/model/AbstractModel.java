package model;

import java.util.ArrayList;
import java.util.List;

import entity.ToDo;

public abstract class AbstractModel<T> {

	private Class<T> entity;

	private List<T> todoList;

	public AbstractModel(Class<T> entity) {
		super();
		todoList = new ArrayList();
		this.entity = entity;
	}

	public List<T> findAll() {

		return todoList;
	}

	public boolean save(T entity) {
		boolean result = true;
		if (entity != null) {
			todoList.add(entity);
		} else {
			result = false;
		}
		return result;
	}

	public boolean delete(T entity) {
		boolean result = true;
		todoList.remove(entity);
		return result;
	}

	public boolean deleteAll(T entity) {
		todoList.clear();
		return true;
	}

	/*
	 * public boolean update(Integer id, T entity) { boolean result = true; if
	 * (entity != null) { todoList.set(id, entity); } else { result = false; }
	 * return result; }
	 */

}
