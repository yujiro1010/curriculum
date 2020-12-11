package Abstract;


public class Trainee extends JavaCurriculumTrainee{

	public Trainee(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void doJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("わたくしは、"+super.getname()+"は、Javaカリキュラムをこなします(｀･ω･´)ゞ！");

	}

}
