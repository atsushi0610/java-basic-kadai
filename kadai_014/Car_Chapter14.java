package kadai_014;

public class Car_Chapter14 {

	// フィールド(内部データ)
	private int gear = 0;
	private int speed = 0;
	
	// コンストラクタ(初期化処理)
	public Car_Chapter14(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// 【メソッド】ギアの値に応じて速度を変える
	// afterGear:ギアの値
	public void gearChange( final int afterGear ) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
	}
	
	// 【メソッド】ギアチェンジ後の速度を表示する
	public void run() {
		switch(this.gear) {
			case 1 -> System.out.println("速度は10kmです");
			case 2 -> System.out.println("速度は20kmです");
			case 3 -> System.out.println("速度は30kmです");
			case 4 -> System.out.println("速度は40kmです");
			case 5 -> System.out.println("速度は50kmです");
			default -> System.out.println("速度は" + this.speed + "です");
		}
	}
}
