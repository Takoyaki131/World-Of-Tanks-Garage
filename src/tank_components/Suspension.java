package tank_components;

public abstract class Suspension {

	private int load_limit;
	private int traverse_speed;
	private double suspension_repair_time;
	
	private int weight;

	public Suspension(int load_limit, int traverse_speed, double suspension_repair_time, int weight) {
		super();
		this.load_limit = load_limit;
		this.traverse_speed = traverse_speed;
		this.suspension_repair_time = suspension_repair_time;
		this.weight = weight;
	}

	public int getLoad_limit() {
		return load_limit;
	}

	public void setLoad_limit(int load_limit) {
		this.load_limit = load_limit;
	}

	public int getTraverse_speed() {
		return traverse_speed;
	}

	public void setTraverse_speed(int traverse_speed) {
		this.traverse_speed = traverse_speed;
	}

	public double getSuspension_repair_time() {
		return suspension_repair_time;
	}

	public void setSuspension_repair_time(double suspension_repair_time) {
		this.suspension_repair_time = suspension_repair_time;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
