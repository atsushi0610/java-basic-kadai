package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public static void main(String[] args) {

		// HashMapの宣言
		HashMap<String,String> dictionaryMap = new HashMap<String,String>();
		
		// 英単語を辞書に追加する
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウイ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		// 調べる英単語の配列を宣言する
		String[] wordArray = {"apple", "banana", "grape", "orange"};
		
		// 英単語が辞書に追加されているか判定する
		for(String word: wordArray) {
			if(dictionaryMap.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionaryMap.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません\n");
			}
		}
	
	}
}
