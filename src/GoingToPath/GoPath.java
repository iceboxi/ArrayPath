package GoingToPath;
import java.util.ArrayList;
import java.util.List;


public class GoPath {
	public static int count = 1;
	public static void goPath(List<List<String>> points) {
		List<Integer> path = new ArrayList<Integer>();
		int flag = points.size()-1;
		
		for (int i = 0; i < points.size(); i++) {
			path.add(0);
		}
		
		while (true) {
			printPath(path);
			path.set(flag, path.get(flag)+1);
			while (true) {
				if (path.get(flag) == points.get(flag).size()) {
					path.set(flag, 0);
					flag--;
					if (flag < 0) {
						break;
					}
					path.set(flag, path.get(flag)+1);
				}else {
					flag = points.size()-1;
					break;
				}
			}
			
			if (flag < 0) {
				break;
			}
		}
	}
	
	public static void printPath(List<Integer> path) {
		// path等於要去points拿的位置的排列
		
		System.out.println("count = " + count++);
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i) + ", ");
		}
		System.out.println();
	}
}
