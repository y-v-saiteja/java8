package newfeatures;

public class Order {
	public enum Side{ BUY, SELL };
	private final int quantity;
	private final String symbol;
	private final double price;
	private final Side side;
	
	
	
	public Order(int quantity, String symbol, double price, Side side) {
		super();
		this.quantity = quantity;
		this.symbol = symbol;
		this.price = price;
		this.side = side;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getSymbol() {
		return symbol;
	}
	public double getPrice() {
		return price;
	}
	public Side getSide() {
		return side;
	}
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", symbol=" + symbol + ", price=" + price + ", side=" + side + "]";
	}
	public static int compareByQuantity(Order a, Order b){
		return a.quantity - b.quantity; }//1000-500=500



		public int compareByPrice(Order a, Order b){
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
		}
	
}
