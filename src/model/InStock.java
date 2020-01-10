package model;
//111
//456
import java.sql.Timestamp;

public class InStock {
private  int id;
private  int supplierld;
private Timestamp createtime;
private Timestamp completetime;
private int approver;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSupplierld() {
	return supplierld;
}
public void setSupplierld(int supplierld) {
	this.supplierld = supplierld;
}


public Timestamp getCreatetime() {
	return createtime;
}
public void setCreatetime(Timestamp createtime) {
	this.createtime = createtime;
}
public Timestamp getCompletetime() {
	return completetime;
}
public void setCompletetime(Timestamp completetime) {
	this.completetime = completetime;
}
public int getApprover() {
	return approver;
}
public void setApprover(int approver) {
	this.approver = approver;
}
}
