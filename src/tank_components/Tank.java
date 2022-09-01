package tank_components;

public abstract class Tank {
	protected Cannon cannon;
	protected Chassis chassis;
	protected Suspension suspension;
	protected Turret turret;
	protected Radio radio;
	protected Engine engine;
	
	protected String name;
	protected int weight;
	public Tank(Cannon cannon, Chassis chassis, Suspension suspension, Turret turret, Radio radio, Engine engine, String name) {
		super();
		this.cannon = cannon;
		this.chassis = chassis;
		this.suspension = suspension;
		this.turret = turret;
		this.radio = radio;
		this.engine = engine;
		this.name = name;
	}
	
	public void displayFirepower()
	{
		System.out.println("FIREPOWER");
		System.out.println(cannon.getDamage()[0] + "/" + cannon.getDamage()[1] + "/" + cannon.getDamage()[2]  + "\t Damage");
		System.out.println(cannon.getPenetration()[0] + "/" + cannon.getPenetration()[1] + "/" + cannon.getPenetration()[2]  + "\t Penetration");
		System.out.printf("%.2f", cannon.getRateOfFire());
		System.out.println("\t\t Rate of Fire");
		System.out.println(cannon.getGun_loading() + "\t\t Gun Loading");
		System.out.println(turret.getTraverse_speed() + "\t\t Gun Traverse Speed");
		System.out.println(chassis.getGun_depression() + "/" + chassis.getGun_elevation() + "\t\t Gun Depression/Elevation Angles");
		System.out.println(cannon.getAim_time() + "\t\t Aiming Time");
		System.out.println(cannon.getDispersion() + "\t\t Dispersion at 100 m");
		System.out.println(cannon.getDamagePerMinute() + "\t\t Average Damage per Minute");
	}
	
	public void displaySurvivability()
	{
		System.out.println("SURVIVABILITY");
		System.out.println(chassis.getHit_points()  + "\t\t Hit Points");
		System.out.println(chassis.getHull_armor()[0] + "/" + chassis.getHull_armor()[1] + "/" + chassis.getHull_armor()[2]  + "\t Hull Armor");
		System.out.println(turret.getArmor()[0] + "/" + turret.getArmor()[1] + "/" + turret.getArmor()[2]  + "\t Turret Armor");
		System.out.printf("%.2f", suspension.getSuspension_repair_time());
		System.out.println("\t\t Suspension Repair Time");
	}
	
	public void displayMobility() 
	{
		System.out.println("MOBILITY");
		System.out.println(this.weight + "/" + suspension.getLoad_limit() + "\t\t" + "Weight/Load Limit");
		System.out.println(engine.getEngine_power() + "\t\t Engine Power");
		System.out.printf("%.2f",engine.getEngine_power() / this.weight);
		System.out.println("\t\t Specific Power");
		System.out.println(chassis.getTop_speed() + "/" + chassis.getReverse_speed() + "\t\t Top speed/Reverse Speed");
		System.out.println(suspension.getTraverse_speed() + "\t\t Traverse Speed");
	}
	
	public void displaySpotting()
	{
		System.out.println("SPOTTING");
		System.out.println(turret.getView_range() + "\t\t View Range");
		System.out.println(radio.getSignal_range() + "\t\t Signal Range");
	}
}
