
public class Main {

	String name = "";

	public Main(String _name) {
		name = _name;
	}
	public static void main(String[] args) {
		final float PI = 3.1415926535897f;
        int r = 3;
        System.out.print(2*r*PI);

		Main a = new Main("Son");
		a.name = "Nguyen";
	}

}

