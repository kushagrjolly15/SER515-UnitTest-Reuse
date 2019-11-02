package test.hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import hacs.Solution;
import hacs.SolutionIterator;
import hacs.SolutionList;

class TestSolutionIterator {

	SolutionList solutionlist;

	TestSolutionIterator() {
		solutionlist = new SolutionList();
		Solution sol = new Solution();
		sol.setTheAuthor("test");
		sol.setSolutionFileName("new");
		solutionlist.add(sol);
	}

	@Test
	void testHasNext() {
		SolutionIterator iter = new SolutionIterator(solutionlist);
		assertTrue(iter.hasNext());
	}

	@Test
	void testNext() {
		SolutionIterator iter = new SolutionIterator(solutionlist);
		System.out.print(solutionlist.get(0).getTheAuthor());
		assertEquals(iter.next("null"), null);
	}

	@Test
	void testRemove() {
		SolutionIterator iter = new SolutionIterator(solutionlist);
		iter.next();
		iter.remove();
		assertEquals(solutionlist.size(), 0);
	}

}
