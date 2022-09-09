package composite.menuiterator_alternative;

public class MenuItem implements MenuI {
	private String name;
	private String description;
	private boolean vegetarian;

	public MenuItem(String name, String description,
			boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.print("  " + this.getName());
		if (this.isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println("     -- " + this.getDescription());
	}
}
