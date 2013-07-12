package GoingToPath;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class GoPathTester {
	private List<List<String>> points;
	
	@Before
	public void setUp() throws Exception {
		points = new ArrayList<List<String>>();
		int size1 = (int)(Math.random()*5+1);
		System.out.println(size1);
		for (int i = 0; i < size1; i++) {
			List<String> strings = new ArrayList<String>();
			int size2 = (int)(Math.random()*5+1);
			System.out.print(size2 + " ");
			for (int j = 0; j < size2; j++) {
				strings.add(String.valueOf((Math.random()*10)));
			}
			points.add(strings);
		}
		System.out.println();
	}

	@After
	public void tearDown() throws Exception {
		points = null;
	}

	@Test
	public void test() {
		GoPath goPath = new GoPath(points);
		goPath.goThroughPath();
	}
	
	@Test
	public void testRecursive() {
		GoPathRecursive goPath = new GoPathRecursive(points);
		goPath.goThroughPath();
	}

}
