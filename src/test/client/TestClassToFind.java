package test.client;

public class TestClassToFind<T> {

	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void addFoo(int a, int b, int c) {
		System.out.println("Bla "+a+b+c);
	}
	
}
