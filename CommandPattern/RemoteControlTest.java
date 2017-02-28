package CommandPattern;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand loghtOn = new LightOnCommand(light);
		
		remote.setCommand(loghtOn);
		remote.buttonWasPressed();
	}
}
