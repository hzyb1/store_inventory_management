package model;

import java.sql.Timestamp;

public class Stock {
private int id;
private int productId;
private int amount;
private int areaNumber;
private int shelfNumber;
private int placeNumber;
private Timestamp inStockTime;

public Timestamp getInStockTime() {
	return inStockTime;
}
public void setInStockTime(Timestamp inStockTime) {
	this.inStockTime = inStockTime;
}
public int getPlaceNumber() {
	return placeNumber;
}
public void setPlaceNumber(int placeNumber) {
	this.placeNumber = placeNumber;
}
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

public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getAreaNumber() {
	return areaNumber;
}
public void setAreaNumber(int areaNumber) {
	this.areaNumber = areaNumber;
}
public int getShelfNumber() {
	return shelfNumber;
}
public void setShelfNumber(int shelfNumber) {
	this.shelfNumber = shelfNumber;
}

}
