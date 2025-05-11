package kadai_018;

import java.util.ArrayList;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		ArrayList<Kato_Chapter18> members = new ArrayList<>();
		
		 KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		 KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		 KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		 taro.setGivenName("太郎");
		 ichiro.setGivenName("一郎");
		 hanako.setGivenName("花子");
		 
		members.add(taro);
		members.add(ichiro);
		members.add(hanako);
		
	
		for(Kato_Chapter18 person: members) {
			person.execIntroduce();
			System.out.println();
			
		}
		
		
	}
	
}
