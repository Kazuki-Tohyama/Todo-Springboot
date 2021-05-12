package com.example.todorest.todo;

import java.util.List;

public interface ServiceInterface {
	List<Task> getTaskList();
	void add(Task item);
	void delete(int id);
}