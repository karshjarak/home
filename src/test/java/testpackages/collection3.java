package testpackages;

public class collection3<T, W> {

	public T abc;
	public W cde;

	public T getabc() {

		return abc;

	}

	public void setabc(T abc) {

		this.abc = abc;
	}

	public W get() {
		return cde;

	}

	public void seT(W cde) {

		this.cde = cde;
	}

	public static void main(String[] args) {

		collection3<String, Integer> d = new collection3<>();

		d.setabc("karshak");

		d.seT(4);

		System.out.println(d.getabc() + d.get());

	}

}