package week1;

public class Lamp {
	private int setting;
	public Lamp(){
		this.setting = 0;
	}
	public void pushButton(){
		this.setting = this.setting + 1;
		if (this.setting > 3){
			this.setting = 0;
		}
	}
	public int getSetting(){
		return this.setting;
	}
}
