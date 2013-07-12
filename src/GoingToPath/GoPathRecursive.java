package GoingToPath;

import java.util.ArrayList;
import java.util.List;

public class GoPathRecursive {
	private List<List<String>> points;
	private List<Integer> path;
	
	public GoPathRecursive(List<List<String>> points) {
		this.points = points;
		initPath();
	}

	public void goThroughPath() {
		goThroughPath(0);
	}
	
	private void goThroughPath(int order) {
		if (order < points.size()-1) {
			for (int i = 0; i < points.get(order).size(); i++) {
				path.set(order, i);
				goThroughPath(order+1);
			}
		}else {
			for (int i = 0; i < points.get(order).size(); i++) {
				path.set(order, i);
				printPath(path);
			}
		}
	}
	
	public void printPath(List<Integer> path) {
		// path等於要去points拿的位置的排列
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i) + ", ");
		}
		System.out.println();
	}
	
	private void initPath() {
		path = new ArrayList<Integer>();
		for (int i = 0; i < points.size(); i++) {
			path.add(0);
		}
	}
}
