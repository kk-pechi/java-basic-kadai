package kadai_015;

public class Car_Chapter15 {

		private int gear = 1; //1速から5速のギアを表す
		
		private int speed = 10; //ギアチェンジ後の速度を表す

	public Car_Chapter15( int gear, int speed ) {
		
		this.gear = gear;
		
		this.speed = speed;
		
	}
	
	public Car_Chapter15( ) {		
	}
	
	public void gearChange( int afterGear ) {
		
		int beforeGear = this.gear;
		
		this.gear = afterGear;
		
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};
	
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	
	}
	
	public void run() {	
		
		System.out.println("速度は時速"+ this.speed + "kmです");
		
	}

}	
