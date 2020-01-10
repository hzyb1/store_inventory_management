package mapper;

import java.util.List;

import model.Supplier;
import model.User;

public interface SupplierMapper {
	public Supplier selectById(int id);
	public List<Supplier> selectAll();
	public boolean updateSupplier(Supplier supplier);
	public boolean insertSupplier(Supplier supplier);
	public boolean deleteById(int id);
}
