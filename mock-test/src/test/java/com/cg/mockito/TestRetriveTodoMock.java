package com.cg.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cg.api.TodoService;
import com.cg.business.TodoBusinessImpl;

public class TestRetriveTodoMock {

	@Test
	public void testRetriveTodosOfSpring_usingMock() {
		TodoService todoServiceMock=mock(TodoService.class);
		List<String> todos=Arrays.asList("learn spring","learn to spring mvc","learn java");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredList=todoBusinessImpl.retrieveTodosOfSpring("Dummy");
		
		assertEquals(2, filteredList.size());
		
		
	}

}
