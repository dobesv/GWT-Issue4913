package test.client;

public class TestSubclassToFind<T> extends TestClassToFind<T> {

	public void doWhatever(String x) {
		System.out.println(x);
	}
}
