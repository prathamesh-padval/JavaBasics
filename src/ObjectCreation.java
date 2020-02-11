import java.lang.reflect.InvocationTargetException;

class Test implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void doSomething() {
		System.out.println("Test Performed");
	}
}

public class ObjectCreation {

	public static void main(String[] args)
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		// Using new keyword
		Test t = new Test();
		t.doSomething();

		// By cloning object
		Test tClone = (Test) t.clone();
		tClone.doSomething();

		// By using class.forname
		Test tForName = (Test) Class.forName("Test").newInstance();
		tForName.doSomething();

		// By using Constructor's newInstance
		Test tCon = Test.class.getConstructor().newInstance();
		tCon.doSomething();

		// By desirialization method
		
	}
}
