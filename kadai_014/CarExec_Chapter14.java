package kadai_014;

public class CarExec_Chapter14 {
	
	public static void main(String[] args) {
		
		// 車のデータを生成
		Car_Chapter14 car = new Car_Chapter14 (1, 10);
		
		// gearChanegeメソッドの実行
		car.gearChange(3);
		
		// runメソッドの実行
		car.run();
	}
}
