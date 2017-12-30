import java.util.Enumeration;
import java.util.Vector;

public class TestClass {
	public static void main(String args[]) {
		Enumeration<String> days;

		Vector<String> dayNames = new Vector<String>();

		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Satday");
		dayNames.add("Sunday");

		days = dayNames.elements();

		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

		EnumerationAdaptor<String> adaptor = new EnumerationAdaptor<String>(dayNames.elements());

		// Now use it using iterator
		System.out.println("\n\nPrinting adaptor iterator output");
		while(adaptor.hasNext()) {
			System.out.println(adaptor.next());
		}
	}
}