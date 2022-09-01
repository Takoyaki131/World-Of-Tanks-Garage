package tank_components;

public abstract class Turret {
	private int[] armor = new int[3];
	private int traverse_speed;
	private int view_range;
	
	private int weight;

	public Turret(int[] armor, int traverse_speed, int view_range, int weight) {
		super();
		this.armor = armor;
		this.traverse_speed = traverse_speed;
		this.view_range = view_range;
		this.weight = weight;
	}

	public int[] getArmor() {
		return armor;
	}

	public void setArmor(int[] armor) {
		this.armor = armor;
	}

	public int getTraverse_speed() {
		return traverse_speed;
	}

	public void setTraverse_speed(int traverse_speed) {
		this.traverse_speed = traverse_speed;
	}

	public int getView_range() {
		return view_range;
	}

	public void setView_range(int view_range) {
		this.view_range = view_range;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
