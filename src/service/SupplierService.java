package service;

import java.util.List;

import model.Supplier;

public interface SupplierService {
	public Boolean updateSupplier(Supplier supplier);	//更新供应商
	public Supplier selectSupplierById(int id);		//通过id查找供应商
	public Boolean addSupplier(Supplier supplier);	//添加供应商
	public boolean deleteSupplier(int id);		//删除供应商
	public List<Supplier> selectAllSupplier();	//查找所有供应商
}
