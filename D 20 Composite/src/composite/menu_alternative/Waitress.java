package composite.menu_alternative;

public class Waitress {
	private MenuI allMenus;

	public Waitress(MenuI allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
}
