package model;

public class OutStockDetail {
	private int id;
	private int outstockid;
	private int productid;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOutstockid() {
		return outstockid;
	}
	public void setOutstockid(int outstockid) {
		this.outstockid = outstockid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
