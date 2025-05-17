package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {
	
	    public static void main(String[] args) {
	    	
	    	Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
	    	 Scanner scanner = new Scanner(System.in);
	    	
	    	//開始メッセージを出力
	    	System.out.println("自分のじゃんけんの手を入力しましょう");
	    	System.out.println("グーはrockのrを入力しましょう");
	    	System.out.println("チョキはscissorsのsを入力しましょう");
	    	System.out.println("パーはpaperのpを入力しましょう");
	    	
	    	String input = jyanken.getMyChoice();
	 
	    	String choice = jyanken.getRandom();
	    	
	        jyanken.playGame(input, choice);

	        scanner.close();
	    	}  
	}
