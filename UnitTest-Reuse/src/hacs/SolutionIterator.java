package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class SolutionIterator extends ListIterator<Solution> {
	SolutionList solutionlist;

	/// CurrentSolutionNumber: point to the location before the first element
	int currentSolutionNumber = -1;

	public SolutionIterator() {
	}

	public SolutionIterator(SolutionList thesolutionlist) {
		super(thesolutionlist);
		MoveToHead();
	}

	public void MoveToHead() {
		/// CurrentSolutionNumber: point to the location before the first element
		currentSolutionNumber = -1;
	}

	/// get the next Solution that fits the Username;
	public Solution next(String UserName) {
		Solution theSolution;
		theSolution = (Solution) next();
		while (theSolution != null) {
			if (UserName.compareTo(theSolution.getTheAuthor()) == 0) {
				return theSolution;
			}
			theSolution = (Solution) next();
		}
		return null;
	}

}