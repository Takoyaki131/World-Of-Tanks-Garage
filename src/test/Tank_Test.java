package test;
import tank_components.Tank;

public class Tank_Test extends Tank{

	public Tank_Test() {
		super(new Cannon_Test(),
				new Chassis_Test(),
				new Suspension_Test(),
				new Turret_Test(),
				new Radio_Test(),
				new Engine_Test(),
				"STA 2");
		// TODO Auto-generated constructor stub
	}

}
