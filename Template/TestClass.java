public class TestClass {
	public static void main(String args[]) {
		CaffeineBeverage coffee = new Coffee();

		CaffeineBeverage tea = new Tea();

		coffee.prepareReceipe();

		System.out.println("\n\n");

		tea.prepareReceipe();
	}
}