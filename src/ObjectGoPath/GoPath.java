package ObjectGoPath;


public class GoPath {
	private Bit number;
	
	public GoPath(Integer... args) {
		initPath(args);
	}
	
	private void initPath(Integer... args) {
		Bit headBit = new Bit(args[0]);
		Bit tailBit = null;
		
		for (int i = 1; i < args.length; i++) {
			tailBit = new Bit(args[i]);
			tailBit.setNextBit(headBit);
			
			headBit = tailBit;
		}
		
		number = tailBit;
	}
	
	public void goThroughPath() {
		number.print();
		while (number.plus()) {
			number.print();
		}
	}
}
