package service;

import java.util.List;

import model.Supplier;

public interface SupplierService {
	public Boolean updateSupplier(Supplier supplier);
	public Supplier selectSupplierById(int id);
	public Boolean insertSupplier(Supplier supplier);
	public boolean deleteSupplier(int id);
}
