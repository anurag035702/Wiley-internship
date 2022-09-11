
public enum coffee {
  Nescafe(5),Latte(7),Capachino(8),Expresso(11);
	int coffeebeans;
	private coffee(int coffeebeans) {
		this.coffeebeans=coffeebeans;
	}
	public void prepare() {
		System.out.println("being prepared");
	}
	public int calCost() {
		return this.coffeebeans*20;
	}
}
