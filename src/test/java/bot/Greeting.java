package bot;

import java.util.ArrayList;
import java.util.List;

public class Greeting { //挨拶の貯蔵クラス
	public List<String> Greetings() {
	List<String> Greeting = new ArrayList<String>(); //ArrayListを生成
	//挨拶追加
	Greeting.add("こんにちは");
	Greeting.add("おはよう");
	Greeting.add("こんばんは");
	Greeting.add("Hi");
	Greeting.add("やあ");
	Greeting.add("よう");
	Greeting.add("Hello");
	Greeting.add("Γεια σου");
	Greeting.add("うお");
	Greeting.add("うぉ");
	Greeting.add("Здравейте");
	Greeting.add("Kamusta");
	//上記の挨拶をコメントされると返信できる
	return (Greeting); //このクラスを呼び出すと"return"から後ろの内容を返す。この場合はGreeting配列内の文字を返す
	}
}
