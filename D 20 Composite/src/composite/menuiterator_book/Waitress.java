package composite.menuiterator_book;

import java.util.Iterator;

public class Waitress {
	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	//-------------------------------------------------------------------------

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
//			try {
//				if (menuComponent.isVegetarian()) {
//					menuComponent.print();
//				}
//			} catch (UnsupportedOperationException e) {
//			}
			if (menuComponent instanceof MenuItem && menuComponent.isVegetarian()) {
				menuComponent.print();
			}
		}
	}
}
