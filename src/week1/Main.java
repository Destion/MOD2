package week1;

public class Main {
	public static void main(String[] args){
		Lamp lamp = new Lamp();
		for (int i = 0; i < 100; i++){
			lamp.pushButton();
			System.out.println(lamp.getSetting());
		}
	}

}
