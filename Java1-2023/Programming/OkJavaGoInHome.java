import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome
{
	public static void main(String[] args)
	{
		String id = "JiWoo APT 404";
		
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
	}
}
