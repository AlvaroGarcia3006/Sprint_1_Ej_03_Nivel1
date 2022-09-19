package nivel1_ej01;

public class Month {
	
	private final int MONTH_HASH = 1;
	private final String name;

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
	
	@Override
	public int hashCode() {
		return MONTH_HASH;
	}
	@Override
	public boolean equals(Object obj) {
		Month month = (Month)obj;
		return name.equals(month.getName());
	}
}
