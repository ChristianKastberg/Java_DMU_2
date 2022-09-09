package composite.menu_alternative;

public class MenuTestDrive {

	public static void main(String args[]) {
		CompositeMenu pancakeHouseMenu = new CompositeMenu("PANCAKE HOUSE MENU", "Breakfast");
		CompositeMenu dinerMenu = new CompositeMenu("DINER MENU", "Lunch");
		CompositeMenu cafeMenu = new CompositeMenu("CAFE MENU", "Dinner");

		CompositeMenu allMenus = new CompositeMenu("ALL MENUS", "All menus combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem(
				"PH: K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast"));
		pancakeHouseMenu.add(new MenuItem(
				"PH: Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage"));
		pancakeHouseMenu.add(new MenuItem(
				"PH: Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup"));
		pancakeHouseMenu.add(new MenuItem(
				"PH: Waffles",
				"Waffles, with your choice of blueberries or strawberries"));

		dinerMenu.add(new MenuItem(
				"DI: Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat"));
		dinerMenu.add(new MenuItem(
				"DI: BLT",
				"Bacon with lettuce & tomato on whole wheat"));
		dinerMenu.add(new MenuItem(
				"DI: Soup of the day",
				"A bowl of the soup of the day, with a side of potato salad"));
		dinerMenu.add(new MenuItem(
				"DI: Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese"));
		dinerMenu.add(new MenuItem(
				"DI: Steamed Veggies and Brown Rice",
				"Steamed vegetables over brown rice"));

		dinerMenu.add(new MenuItem(
				"DI: Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread"));

		CompositeMenu dessertMenu = new CompositeMenu("DI: DESSERT MENU", "Dessert of course!");

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem(
				"D: Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla icecream"));

		dessertMenu.add(new MenuItem(
				"D: Cheesecake",
				"Creamy New York cheesecake, with a chocolate graham crust"));
		dessertMenu.add(new MenuItem(
				"D: Sorbet",
				"A scoop of raspberry and a scoop of lime"));

		cafeMenu.add(new MenuItem(
				"CA: Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries"));
		cafeMenu.add(new MenuItem(
				"CA: Soup of the day",
				"A cup of the soup of the day, with a side salad"));
		cafeMenu.add(new MenuItem(
				"CA: Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole"));

		CompositeMenu coffeeMenu = new CompositeMenu("CA: COFFEE MENU",
				"Stuff to go with your afternoon coffee");

		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItem(
				"C: Coffee Cake",
				"Crumbly cake topped with cinnamon and walnuts"));
		coffeeMenu.add(new MenuItem(
				"C: Bagel",
				"Flavors include sesame, poppyseed, cinnamon raisin, pumpkin"));
		coffeeMenu.add(new MenuItem(
				"C: Biscotti",
				"Three almond or hazelnut biscotti cookies"));

		Waitress waitress = new Waitress(allMenus);

		waitress.printMenu();

		//---------------------------------------------------------------------

		System.out.println();
		System.out.println("=================================");

		cafeMenu.print();
	}
}
