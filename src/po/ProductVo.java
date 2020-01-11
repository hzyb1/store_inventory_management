package po;

import model.Product;

public class ProductVo extends Product{	//商品查找数据类
	int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
