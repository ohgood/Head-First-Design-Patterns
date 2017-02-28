package FacadePattern;

public class Tuner {
	private Amplifier amplifier;
	
	public void on() {};
	
	public void off() {};
	
	public void setAm() {};
	
	public void setFm() {};
	
	public void setFrequency() {}

	@Override
	public String toString() {
		return "Tunder [amplifier=" + amplifier + "]";
	};
}
