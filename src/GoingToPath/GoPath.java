package GoingToPath;
import java.util.ArrayList;
import java.util.List;


public class GoPath {
	private List<List<String>> points;
	private List<Integer> path;
	private int addendFlag;
	
	public GoPath(List<List<String>> points) {
		this.points = points;
		initPath();
		resetAddendFlag();
	}
	
	public void goThroughPath() {
		while (!isOutOfDigit()) {
			printPath(path);
			
			goToNextPoint();
			checkNumberCarray();
		}
	}
	
	public void printPath(List<Integer> path) {
		// path等於要去points拿的位置的排列
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i) + ", ");
		}
		System.out.println();
	}
	
	private boolean isOutOfDigit() {
		return addendFlag<0 ? true : false;
	}
	
	private void goToNextPoint() {
		path.set(addendFlag, path.get(addendFlag)+1);
	}
	
	private void checkNumberCarray() {
		while (true) {
			if (path.get(addendFlag) == points.get(addendFlag).size()) {
				path.set(addendFlag, 0);
				addendFlag--;
				if (addendFlag < 0) {
					break;
				}
				path.set(addendFlag, path.get(addendFlag)+1);
			}else {
				resetAddendFlag();
				break;
			}
		}
	}
	
	private void initPath() {
		path = new ArrayList<Integer>();
		for (int i = 0; i < points.size(); i++) {
			path.add(0);
		}
	}
	
	private void resetAddendFlag() {
		addendFlag = points.size()-1;
	}
}
