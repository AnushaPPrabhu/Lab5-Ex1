package p1;

public class AgeException extends Exception {

	int age;

	public AgeException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeException [age=" + age + "]";
	}
	
}
