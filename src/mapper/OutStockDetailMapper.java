package mapper;

import java.util.List;

import model.OutStockDetail;
import model.Stock;

public interface OutStockDetailMapper {
	public OutStockDetail selectById(int id);
	public List<OutStockDetail> selectAll();
	public boolean updateOutStockDetail(OutStockDetail OutStockDetail);
	public boolean insertOutStockDetail(OutStockDetail OutStockDetail);
	public boolean deleteById(int id);
}
