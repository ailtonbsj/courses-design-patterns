package one.digitalinnovation.strategy;

public class Test {

	public static void main(String[] args) {
		Behavior normal = new NormalBehavior();
		Behavior aggressive = new AggressiveBehavior();
		Behavior defensive = new DefensiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		robot.move();
		robot.move();
		
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(aggressive);
		robot.move();
	}

}
