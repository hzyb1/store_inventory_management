package service;

import java.util.List;

import model.Supplier;

public interface SupplierService {
	public Boolean updateSupplier(Supplier supplier);
	public Supplier selectSupplierById(int id);
	public Boolean addSupplier(Supplier supplier);
	public boolean deleteSupplier(int id);
	public List<Supplier> selectAllSupplier();
}
