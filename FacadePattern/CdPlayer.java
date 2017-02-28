package FacadePattern;

public class CdPlayer {
	private Amplifier amplifier;

	public void on() {};

	public void off() {};	

	public void eject() {};

	public void pause() {};

	public void play() {};

	public void stop() {}

	@Override
	public String toString() {
		return "CdPlayer [amplifier=" + amplifier + "]";
	};
	
	
}
