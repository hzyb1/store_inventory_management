package po;

import model.Stock;

public class StockVo extends Stock{	//库存查找数据类
	String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
