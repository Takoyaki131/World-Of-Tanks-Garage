package tank_components;

public abstract class Radio {
	private int signal_range;
	
	private int weight;

	public Radio(int signal_range, int weight) {
		super();
		this.signal_range = signal_range;
		this.weight = weight;
	}

	public int getSignal_range() {
		return signal_range;
	}

	public void setSignal_range(int signal_range) {
		this.signal_range = signal_range;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
