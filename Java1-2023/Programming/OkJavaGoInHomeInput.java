import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput
{
	public static void main(String[] args)
	{
		String id = JOptionPane.showInputDialog("ID");
		String bright = JOptionPane.showInputDialog("Bright Level");
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLampe = new Lighting(id+" / HallLamp");
		hallLampe.on();
		
		Lighting floorLampe = new Lighting(id+" / floorLamp");
		floorLampe.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
}
