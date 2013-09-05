package GoPathByCalculate;

import java.util.List;

public class CalculatePosition {
	private List<List<String>> points;
	
	public CalculatePosition(List<List<String>> points) {
		this.points = points;
	}
	
	public void goThroughPath() {
		int totalPoints = getTotalNumber();
		
		for (int i = 0; i < totalPoints; i++) {
			int position = i;
			String path = "";
			
			for (List<String> point : points) {
				path += String.format(" %d", position%point.size());
				position /= point.size();
			}
			
			System.out.println(path);
		}
		
	}
	
	private int getTotalNumber() {
		int totalPoints = 1;
		
		for (List<String> point : points) {
			totalPoints *= point.size();
		}
		
		return totalPoints;
	}
}
