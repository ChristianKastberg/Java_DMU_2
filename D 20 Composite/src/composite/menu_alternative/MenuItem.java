package composite.menu_alternative;

public class MenuItem implements MenuI {
	private String name;
	private String description;

	public MenuItem(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.print("  " + this.getName());
		System.out.println("     -- " + this.getDescription());
	}
}
