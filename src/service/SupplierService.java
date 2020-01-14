package service;

import java.util.List;

import model.Supplier;

public interface SupplierService {
	public Boolean updateSupplier(Supplier supplier);	//���¹�Ӧ��
	public Supplier selectSupplierById(int id);		//ͨ��id���ҹ�Ӧ��
	public Boolean addSupplier(Supplier supplier);	//��ӹ�Ӧ��
	public boolean deleteSupplier(int id);		//ɾ����Ӧ��
	public List<Supplier> selectAllSupplier();	//�������й�Ӧ��
}
