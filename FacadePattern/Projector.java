package FacadePattern;

public class Projector {
	private DvdPlayer dvdPlayer;
	
	public void on() {};
	
	public void off() {};

	public void tvMode() {};
	
	public void wideScreenMode() {}

	@Override
	public String toString() {
		return "Projector [dvdPlayer=" + dvdPlayer + "]";
	};
}
