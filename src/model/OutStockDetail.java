package model;

public class OutStockDetail {
	private int id;
	private int outStockId;
	private int productId;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getOutStockId() {
		return outStockId;
	}
	public void setOutStockId(int outStockId) {
		this.outStockId = outStockId;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
