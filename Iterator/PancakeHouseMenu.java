import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("cake1", "cake 1", true, 10.0);
		addItem("cake2", "cake 2", true, 165.0);
		addItem("cake3", "cake 3", false, 102.0);
		addItem("cake4", "cake 4", true, 120.0);
		addItem("cake5", "cake 5", false, 140.0);
		addItem("cake6", "cake 6", false, 50.0);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
}