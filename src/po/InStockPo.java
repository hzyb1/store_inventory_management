package po;

import model.Stock;

public class InStockPo extends Stock{	//���������
	int supplierId;
	int approverId;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getApproverId() {
		return approverId;
	}
	public void setApproverId(int approverId) {
		this.approverId = approverId;
	} 
	
}
