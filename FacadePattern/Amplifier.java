package FacadePattern;

public class Amplifier {
	private Tuner tunder;
	
	private DvdPlayer dvdPlayer;
	
	public void on() {};
	
	public void off() {};
	
	public void setCd() {};
	
	public void setDvd(DvdPlayer dvd) {
		dvdPlayer = dvd;
	};
	
	public void setStereoSound() {};
	
	public void setSurroundSound() {};
	
	public void setVolume() {}

	@Override
	public String toString() {
		return "Amplifier [tunder=" + tunder + ", dvdPlayer=" + dvdPlayer + "]";
	};
	
	
}
