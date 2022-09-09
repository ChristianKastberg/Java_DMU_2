package composite.menu_alternative;

import java.util.ArrayList;

public class CompositeMenu implements MenuI { // CompositeMenu is named Menu in book 
	private String name;
	private String description;
	private ArrayList<MenuI> menus = new ArrayList<>();

	public CompositeMenu(String name, String description) {
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
		System.out.print("\n" + this.getName());
		System.out.println(", " + this.getDescription());
		System.out.println("---------------------");

//		Iterator<AbstractMenu> iterator = menus.iterator();
//		while (iterator.hasNext()) {
//			AbstractMenu menu = iterator.next();
//			menu.print();
//		}
		for (MenuI menu : menus) {
			menu.print();
		}
	}

	//-------------------------------------------------------------------------

	public void add(MenuI menu) {
		menus.add(menu);
	}

	public void remove(MenuI menu) {
		menus.remove(menu);
	}

	public MenuI getChild(int i) {
		return menus.get(i);
	}
}
