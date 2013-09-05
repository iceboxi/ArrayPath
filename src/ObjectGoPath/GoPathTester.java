package ObjectGoPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GoPathTester {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		GoPath tester = new GoPath(3, 2, 5, 3, 5);
		tester.goThroughPath();
	}

}
