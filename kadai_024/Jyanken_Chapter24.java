package kadai_024;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		String myChoice = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while (true) {
			try {
				String inputStr = scanner.next();
				if (inputStr.equals("r")) {
					myChoice = "r";
				} else if (inputStr.equals("s")) {
					myChoice = "s";
				} else if (inputStr.equals("p")) {
					myChoice = "p";
				} else {
					throw new IllegalArgumentException("正しい手を入力してください（r、s、p）");
				}
			} catch (InputMismatchException e) {
				System.out.println("エラー: " + e.getMessage());
			} finally {
				scanner.close();
			}
			return myChoice;
		}
		
		
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		
		// 乱数を格納するための変数
		double num = 0;
		// プレイヤーが何を出すか決める
		String pcChoice = null;
		
		// 0以上3未満の少数として乱数を得る
		num = Math.floor(Math.random() * 3);
		
		pcChoice = hands[(int) num];
		
		return pcChoice;
	}
	
	public void playGame(String myChoice, String pcChoice) {
		
		HashMap<String, String> handsMap = new HashMap<String, String>();
		
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		System.out.println("自分の手は" + handsMap.get(myChoice) + "," + "対戦相手の手は" + handsMap.get(pcChoice));
		
		if (myChoice == "r" && pcChoice == "r") {
			System.out.println("あいこです");
		} else if (myChoice == "r" && pcChoice == "s") {
			System.out.println("自分の勝ちです");
		} else if (myChoice == "r" && pcChoice == "p") {
			System.out.println("自分の負けです");
		} else if (myChoice == "s" && pcChoice == "r") {
			System.out.println("自分の負けです");
		} else if (myChoice == "s" && pcChoice == "s") {
			System.out.println("あいこです");
		} else if (myChoice == "s" && pcChoice == "p") {
			System.out.println("自分の勝ちです");
		} else if (myChoice == "p" && pcChoice == "r") {
			System.out.println("自分の勝ちです");
		} else if (myChoice == "p" && pcChoice == "s") {
			System.out.println("自分の負けです");
		} else if (myChoice == "p" && pcChoice == "p") {
			System.out.println("あいこです");
		}
	}
}
