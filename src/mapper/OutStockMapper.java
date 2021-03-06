package mapper;

import java.util.List;

import po.OutStockVo;
import model.InStock;
import model.OutStock;

public interface OutStockMapper {
	public OutStock selectById(int id);
	public List<OutStockVo> selectAll();
	public boolean updateOutStock(OutStock outStock);
	public boolean insertOutStock(OutStock outStock);
	public boolean deleteById(int id);
	
	public List<OutStock> selectByProductId(int id);
}
