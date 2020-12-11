package Abstract2;

public class PlasmaWisp extends AbilityOfEnemy{
	public PlasmaWisp(String attackName) {
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		System.out.println(super.attackName);
		// TODO 自動生成されたメソッド・スタブ

	}

}
