package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	// フィールド
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	// 抽象メソッドの処理
	void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
