package FacadePattern;

public class TheaterLights {
	public void on() {};
	
	public void off() {};
	
	public void dim(int i) {}

	@Override
	public String toString() {
		return "TheaterLights [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	};
	
}
