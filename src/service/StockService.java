package service;

import java.util.List;

import model.Product;
import model.Stock;

public interface StockService {
	public Stock selectStocktById(int id);
	public List<Stock> selectAllStock();
	public Boolean updateStock(Stock stock);
	public Boolean insertStock(Stock stock);
	public boolean deleteStock(int id);
}
