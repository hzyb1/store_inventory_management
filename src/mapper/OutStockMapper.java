package mapper;

import java.util.List;

import model.OutStock;

public interface OutStockMapper {
	public OutStock selectById(int id);
	public List<OutStock> selectAll();
	public boolean updateOutStock(OutStock outStock);
	public boolean insertOutStock(OutStock outStock);
	public boolean deleteById(int id);
}
