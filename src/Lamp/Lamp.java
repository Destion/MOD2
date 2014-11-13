package Lamp;

public class Lamp {
	private int setting;

	//The lamp starts at the off state.

	public Lamp() {
		this.setting = 0;
	}

	//This setting is the modulo of this setting + 1. This results in it changing the setting to 0,1,2,3 and than back to 0.

	public void switchSetting() {
		this.setting = (this.setting +  1) % 4;
		}


	//Method getSetting returns the current state of the lamp

	public int getSetting() {
		return this.setting;
	}
}

