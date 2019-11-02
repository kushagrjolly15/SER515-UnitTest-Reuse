package test.hacs;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import hacs.ListIterator;

class TestListIterator {
	
	ArrayList<String> st;

	TestListIterator() {
		// TODO Auto-generated constructor stub
		st= new ArrayList<>();
		st.add("test");
	}
	
	@Test
	void testNext() {
		ListIterator<String> list= new ListIterator<>(st);
		list.remove();
		Assert.assertEquals(list.next(), null);	
	}
	
	@Test
	void testHasNext() {
		ListIterator<String> list= new ListIterator<>(st);
		Assert.assertTrue(list.hasNext());
		list.next();
		Assert.assertFalse(list.hasNext());
		
	}
	@Test
	void testRemove() {
		ListIterator<String> list= new ListIterator<>(st);
		list.next();
		list.remove();
		Assert.assertEquals(st.size(),0);		
	}
}
