package service;

import java.util.List;

import model.Product;
import model.Stock;
import model.InStock;
public interface StockService {
	public Stock selectStocktById(int id);
	public List<Stock> selectAllStock();
	public Boolean updateStock(Stock stock);
	public Boolean insertStock(Stock stock);
	public boolean deleteStock(int id);
	
	public InStock selectInStocktById(int id);
	public List<InStock> selectAllInStock();
	public Boolean updateInStock(InStock instock);
	public Boolean insertInStock(InStock instock);
	public boolean deleteInStock(int id);
	
}
