package GoPathByCalculate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tester {
	private List<List<String>> points;
	
	@Before
	public void setUp() throws Exception {
		initPoints();
		printPointsInfo();
	}
	
	private void initPoints() {
		points = new ArrayList<List<String>>();
		int pathLength = (int)(Math.random()*5+1);
		
		for (int i = 0; i < pathLength; i++) {
			List<String> strings = new ArrayList<String>();
			int choiceOfPoint = (int)(Math.random()*5+1);
			
			for (int j = 0; j < choiceOfPoint; j++) {
				// we don't care what does strings have
				strings.add(String.valueOf((Math.random()*10)));
			}
			points.add(strings);
		}
	}
	
	private void printPointsInfo() {
		System.out.println("size of points: " + points.size());
		System.out.print("paths: ");
		for (List<String> strings : points) {
			System.out.print(strings.size() + ", ");
		}
		System.out.println();
	}

	@After
	public void tearDown() throws Exception {
		points = null;
	}

	@Test
	public void test() {
		CalculatePosition test = new CalculatePosition(points);
		
		test.goThroughPath();
	}

}
