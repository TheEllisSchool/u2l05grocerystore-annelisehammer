import javax.swing.JOptionPane;

public class U2L04Supermarket {

	public static void main(String[] args) {
		
		Item cookies = new Item ("Chocolate Chip Cookies", 0.70, 20);
		
		Produce apple = new Produce (0.99, 40, "Green Apples");
		
		Flowers bunch = new Flowers ("Roses", "Red", 20);
		
		double totalCost = 0;
		
		String order = JOptionPane.showInputDialog(null, "We have Chocolate Chip"
				+ "Cookies, Apples, and Red Roses. "
				+ "Please write what you would like.");
		String orderNext = JOptionPane.showInputDialog(null, "How many would "
				+ "you like?");
		int amount = Integer.parseInt(orderNext);
		
		if (order.equals("Chocolate Chip Cookies")) {
			int newAmount = cookies.getQuantityInStock() - amount;
			cookies.setQuantityInStock(newAmount);
			totalCost= totalCost + amount * cookies.getUnitPrice();
			
		} else if (order.equals("Green Apples")) {
			int newAmount = apple.getQuantityInStock() - amount;
			apple.setQuantityInStock(newAmount);
			totalCost= totalCost + amount * apple.getUnitPrice();
			
		} else if (order.equals("Red Rodes")) {
			int newAmount = bunch.getQuantityInStock()- amount;
			bunch.setQuantityInStock(newAmount);
			totalCost= totalCost + amount * bunch.getUnitPrice();
		}
		
		System.out.println("Your total is: $" +totalCost);
	}

}
