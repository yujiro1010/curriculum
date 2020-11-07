package check;

import constants.Constants;

public class Check {
	private String lastName = "牧野";
	private String firstName = "祐介";

	private void printName() {
			System.out.println("printNameメソッド　→ "+ lastName + firstName);
		}

	public static void main(String[] args) {
		Check c = new Check();
		c.printName();

		Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet r = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);

		p.introduce();
		r.introduce();


	}

}
