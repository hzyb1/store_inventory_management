package model;
//111
//456
import java.sql.Timestamp;

public class InStock {
private  int id;
private  int supplierId;
private Timestamp completeTime;
private int approver;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public Timestamp getCompleteTime() {
	return completeTime;
}
public void setCompleteTime(Timestamp completeTime) {
	this.completeTime = completeTime;
}
public int getApprover() {
	return approver;
}
public void setApprover(int approver) {
	this.approver = approver;
}
}
