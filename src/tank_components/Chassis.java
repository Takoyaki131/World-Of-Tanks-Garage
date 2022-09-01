package tank_components;

public abstract class Chassis {
	private int hit_points;
	private int[] hull_armor = new int[3];
	private int gun_depression;
	private int gun_elevation;
	private int top_speed;
	private int reverse_speed;
	
	public Chassis(int hit_points, int[] hull_armor, int gun_depression, int gun_elevation, int top_speed,
			int reverse_speed) {
		super();
		this.hit_points = hit_points;
		this.hull_armor = hull_armor;
		this.gun_depression = gun_depression;
		this.gun_elevation = gun_elevation;
		this.top_speed = top_speed;
		this.reverse_speed = reverse_speed;
	}
	
	public int getHit_points() {
		return hit_points;
	}
	public void setHit_points(int hit_points) {
		this.hit_points = hit_points;
	}
	public int[] getHull_armor() {
		return hull_armor;
	}
	public void setHull_armor(int[] hull_armor) {
		this.hull_armor = hull_armor;
	}
	public int getGun_depression() {
		return gun_depression;
	}
	public void setGun_depression(int gun_depression) {
		this.gun_depression = gun_depression;
	}
	public int getGun_elevation() {
		return gun_elevation;
	}
	public void setGun_elevation(int gun_elevation) {
		this.gun_elevation = gun_elevation;
	}
	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	public int getReverse_speed() {
		return reverse_speed;
	}

	public void setReverse_speed(int reverse_speed) {
		this.reverse_speed = reverse_speed;
	}
	
}
