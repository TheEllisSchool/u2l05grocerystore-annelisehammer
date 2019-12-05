
public class Flowers extends Item{
	private String type;
	private String color;
	private int fStock;
	
	
	public Flowers (String t, String c, int s) {
		super (t, c, s);
		
		setType(t);
		setColor(c);
		setfStock(s);
		
	}
	
	public void setfStock(int s) {
		if (s>0) {
			fStock = s;
		}else {
			System.out.println("Out of stock");
		}
	}
	public int getStock() {
		return fStock;
	}

	public void setType(String t) {
		type=t;
	}
	public String getType() {
		return type;
	}
	
	
	
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "We have" + fStock + "of" + type + "flowers that are" + color;
	}
	
	
	
}
