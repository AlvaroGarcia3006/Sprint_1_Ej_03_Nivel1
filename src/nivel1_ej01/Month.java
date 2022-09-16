package nivel1_ej01;

public class Month {
	
	private String name;

	public Month(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + "]";
	}
	
}
