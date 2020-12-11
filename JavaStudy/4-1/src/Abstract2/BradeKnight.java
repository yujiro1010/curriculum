package Abstract2;

public class BradeKnight extends AbilityOfEnemy {
	public BradeKnight(String attackName) {
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.attackName);

	}


}
