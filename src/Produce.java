
public class Produce extends Item { 
	
	private double price;
	private String typeOfProduce;
	private int stock;
	
	public Produce (double p, int s, String type) {
		super (type, p, s);
		
		setType (type);
		setPrice(p);
		setStock(s);
	}
	
	public void setStock(int s) {
		if (s>0) {
			stock = s;
		}else {
			System.out.println("Out of stock");
		}
	}
	public int getStock() {
		return stock;
	}
	public void setPrice(double p) {
		price = order * 0.99;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setType(String type) {
		typeOfProduce = type;
	}
	public String getType() {
		return typeOfProduce;
	}
	
	/*public void setWeight(double w) {
		if (w > 0) {
			weight = w;
		}else {
			System.out.println("No weight set");
		}
	}
	public double getWeight() {
		return weight;
	}*/
	
	public String toString() {
		return "We have" + stock + "many" + typeOfProduce + "and they cost" + price + "each.";
	}
}
