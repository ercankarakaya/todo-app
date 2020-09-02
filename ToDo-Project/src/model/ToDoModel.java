package model;

import entity.ToDo;

public class ToDoModel extends AbstractModel<ToDo> {

	public ToDoModel() {
		super(ToDo.class);

	}

	@Override
	public boolean save(ToDo entity) {
		if (!entity.getToDoName().equals("")) {
			System.out.println("todo: "+entity);
			ToDo.INCREMENT++;
			return super.save(entity);
		}
		return false;

	}

	@Override
	public boolean delete(ToDo entity) {
		ToDo.INCREMENT--;
		return super.delete(entity);
	}

	@Override
	public boolean deleteAll(ToDo entity) {
		ToDo.INCREMENT = 0;
		return super.deleteAll(entity);
	}

}
