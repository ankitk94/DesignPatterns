public class TestClass {
	public static void main(String args[]) {
		Duck mallardDuck = new MallardDuck();

		mallardDuck.quack();

		Turkey wildTurkey = new WildTurkey();
		wildTurkey.gobble();

		Duck wildTurkeyWithAdaptor = new TurkeyAdaptor(wildTurkey);
		wildTurkeyWithAdaptor.quack();
		wildTurkeyWithAdaptor.fly();
	}
}