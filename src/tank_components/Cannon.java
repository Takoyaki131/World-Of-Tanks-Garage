package tank_components;

public abstract class Cannon {
	private int[] damage = new int[3];
	private int[] penetration = new int[3];
	private double gun_loading;
	private double dispersion;
	private double aim_time;
	
	private int weight;

	public Cannon(int[] damage, int[] penetration, double gun_loading, double dispersion, double aim_time, int weight) {
		super();
		this.damage = damage;
		this.penetration = penetration;
		this.gun_loading = gun_loading;
		this.dispersion = dispersion;
		this.aim_time = aim_time;
		this.weight = weight;
	}

	public double getRateOfFire()
	{
		return 60/this.gun_loading;
	}
	
	public int getDamagePerMinute()
	{
		return (int) (getRateOfFire() * this.damage[0]);
	}
	
	// Getters & Setters
	public int[] getDamage() {
		return damage;
	}

	public void setDamage(int[] damage) {
		this.damage = damage;
	}

	public int[] getPenetration() {
		return penetration;
	}

	public void setPenetration(int[] penetration) {
		this.penetration = penetration;
	}

	public double getGun_loading() {
		return gun_loading;
	}

	public void setGun_loading(double gun_loading) {
		this.gun_loading = gun_loading;
	}

	public double getDispersion() {
		return dispersion;
	}

	public void setDispersion(double dispersion) {
		this.dispersion = dispersion;
	}

	public double getAim_time() {
		return aim_time;
	}

	public void setAim_time(double aim_time) {
		this.aim_time = aim_time;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
