package com.cg.business;

import java.util.ArrayList;
import java.util.List;

import com.cg.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	
	public List<String> retrieveTodosOfSpring(String user)
	{
		
		List<String> filterTodoList=new ArrayList<String>();
		
		List<String> todos=todoService.retrieveTodos(user);
		
		for(String todo:todos)
		{
			if(todo.contains("spring"))
			{
				filterTodoList.add(todo);
				
			}
		}
		
		return filterTodoList;
	}

}
