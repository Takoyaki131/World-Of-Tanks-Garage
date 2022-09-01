package tank_components;

public abstract class Engine {
	private int engine_power;
	private int chance_of_fire;
	
	private int weight;
	
	public Engine(int engine_power, int chance_of_fire, int weight) {
		super();
		this.engine_power = engine_power;
		this.chance_of_fire = chance_of_fire;
		this.weight = weight;
	}

	public int getEngine_power() {
		return engine_power;
	}

	public void setEngine_power(int engine_power) {
		this.engine_power = engine_power;
	}

	public int getChance_of_fire() {
		return chance_of_fire;
	}

	public void setChance_of_fire(int chance_of_fire) {
		this.chance_of_fire = chance_of_fire;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
