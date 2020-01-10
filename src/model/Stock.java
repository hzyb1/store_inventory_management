package model;

import java.sql.Timestamp;

public class Stock {
private int id;
private int productId;
private int amount;
private int areanumber;
private int shelfnumber;
private Timestamp instocktime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public Timestamp getInstocktime() {
	return instocktime;
}
public void setInstocktime(Timestamp instocktime) {
	this.instocktime = instocktime;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getAreanumber() {
	return areanumber;
}
public void setAreanumber(int areanumber) {
	this.areanumber = areanumber;
}
public int getShelfnumber() {
	return shelfnumber;
}
public void setShelfnumber(int shelfnumber) {
	this.shelfnumber = shelfnumber;
}
}
