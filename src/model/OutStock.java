package model;

import java.sql.Timestamp;

public class OutStock {
private int id;
private Timestamp completeTime;
private int approver;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
