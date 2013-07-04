package Tester;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import GoingToPath.GoPath;


public class TestGoPath {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<List<String>> points = new ArrayList<List<String>>();
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
		
		GoPath.goPath(points);
	}

}
