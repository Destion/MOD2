package week1;

public class Main {
	public static void main(String[] args){
		Lamp lamp = new Lamp(2);
		System.out.println(lamp.getSetting());
		lamp.setSetting(1);
		System.out.println(lamp.getSetting());
	}

}
