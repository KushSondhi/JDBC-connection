
public class Speaker implements Product {

	private String name;
	private double price;

	public Speaker(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void ship() {
		System.out.println(name + " is shipping");
	}
}
