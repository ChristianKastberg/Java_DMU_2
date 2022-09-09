package composite.menuiterator_alternative;

import java.util.Iterator;

// The waitress is always given a CompositeMenu (and not a single MenuItem)
public class Waitress {
	private CompositeMenu allMenus;

	public Waitress(CompositeMenu allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	//-------------------------------------------------------------------------

	public void printVegetarianMenu() {
		Iterator<MenuI> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuI menu = iterator.next();
			if (menu instanceof MenuItem) {
				MenuItem menuItem = (MenuItem) menu;
				if (menuItem.isVegetarian()) {
					menu.print();
				}
			}
		}
	}
}
