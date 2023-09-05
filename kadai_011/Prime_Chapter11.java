package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		boolean[] numArray = new boolean[101];
		
		// 初期化
		for(int i = 2; i < numArray.length; i++) {
			numArray[i] = true;
		}
		
		// 素数を求める
		for(int i = 2; i < numArray.length; i++) {
			if(numArray[i]) {
				for(int j = i + 1; j < numArray.length; j++) {
					numArray[j] = (j % i != 0) && numArray[j];
				}
			}
		}
		
		// 出力
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]) {
				System.out.println(i);
			}
		}
	}

}
