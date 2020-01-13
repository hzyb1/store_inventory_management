package po;

import java.sql.Timestamp;

import model.Stock;

public class OutStockPo extends Stock{	//出库数据类
	private int approverId;
	private String productName;
	private String approverName;
	
	public String getApproverName() {
		return approverName;
	}
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
	public int getApproverId() {
		return approverId;
	}
	public void setApproverId(int approverId) {
		this.approverId = approverId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
