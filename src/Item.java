
public class Item {

	private String name;
	private double unitPrice;
	private int stock;
	private double weight;
	
	public Item (String n, double unit, int quantity) {
		name = n;
		setUnitPrice(unit);
		setQuantityInStock(quantity);
	}
	
	public Item (double unit, int quantity, String n) {
	}
	
	public String getName() {
		return name;
	}
	public void setName (String n) {
		name = n;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unit) {
		if (unit >= 0) {
			unitPrice = unit;
		} else {
			System.out.println("No negative prices, default being set to $3.");
			unitPrice = 3;
		}
	}
	
	public int getQuantityInStock() {
		return stock;
	}
	public void setQuantityInStock (int quantity) {
		if (quantity >= 0) {
			stock = quantity;
		}else {
			System.out.println("No negative quantities, assuming stock = 0");
			stock = 0;
		}
	}
	
}
