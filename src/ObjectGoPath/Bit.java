package ObjectGoPath;

public class Bit {
	private int maxNum;
	private int currentNumber;
	private Bit nextBit;
	
	public Bit(){
		
	}
	
	public Bit(Integer maxNum) {
		this.maxNum = maxNum;
		currentNumber = 0;
		nextBit = new EmptyBit();
	}
	
	public void setNextBit(Bit nextBit) {
		this.nextBit = nextBit;
	}
	
	public boolean plus() {
		currentNumber++;
		return checkCarry();
	}
	
	private boolean checkCarry() {
		if (outOfBound()) {
			return carryNextBit();
		}
		
		return true;
	}
	
	private boolean carryNextBit() {
		if (!(nextBit.isNull())) {
			currentNumber = 0;
			return nextBit.plus();
		}else {
			currentNumber--;
			return false;
		}
	}
	
	private boolean outOfBound() {
		if (currentNumber == maxNum) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isNull() {
		return false;
	}
	
	private String getCurrentNumber() {
		if (nextBit.isNull()) {
			return String.format("%d", currentNumber);
		}else {
			return String.format("%s %d", nextBit.getCurrentNumber(), currentNumber);
		}
	}
	
	public void print() {
		System.out.println(getCurrentNumber());
	}
}
