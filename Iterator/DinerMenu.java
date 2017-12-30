public class DinerMenu {
	static final int MAX_ITEMS = 0;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItems("Dal Makhni", "Dal with makhan", true, 100.0);
		addItems("Paneer Makhni", "Paneer with makhan", true, 120.0);
		addItems("Chicken Manchurian", "Manchurian chicken", false, 100.0);
		addItems("Chicken", "Butter chicken", false, 150.0);
		addItems("Naan", "Bread", true, 10.0);
	}

	public void addItems(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Menu is full");
		}
		else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
}