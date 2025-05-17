package kadai_028;

import java.util.Scanner;
import java.util.HashMap;

public class Jyanken_Chapter28 {
	
	//取得した手をHashMapで日本語に変換する
	public static HashMap<String, String> handMap = new HashMap<>();{
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
	}

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
    	//コンソールにキーボードで入力された文字を取得する
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.print("自分の手は" + handMap.get(input));
		scanner.close();
		return input;

	}
	
	//乱数でじゃんけんの手を選び、対戦相手の手を決める
	public String getRandom() {

	double randomValue = Math.random()*3;
	int value = (int)Math.floor(randomValue);
	
	String[] choices = {"r", "s", "p"};
	String choice = choices[value];
	System.out.println(",対戦相手の手は" + handMap.get(choice));
	return choice;
	}
	
	//自分の手と相手の手を比較し、比較した結果を表示する
	public void playGame(String input, String choice) {
		
		String myChoice = input;		
		
		if((input.equals("r")&&choice.equals("s"))||(myChoice.equals("s")&&choice.equals("p"))||(myChoice.equals("p")&&choice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else if((myChoice.equals("s")&&choice.equals("r"))||(myChoice.equals("p")&&choice.equals("s"))||(myChoice.equals("r")&&choice.equals("p"))){
			System.out.println("自分の負けです");
		}else if(myChoice.equals(choice)){
			System.out.println("あいこです");
		}else {
			System.out.println("入力エラーです");
		}
		    	    	
	}
	

}
