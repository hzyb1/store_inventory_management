package action;

import java.util.List;

import model.Supplier;
import serviceImpl.SupplierServiceImpl;

import com.opensymphony.xwork2.ActionContext;

public class SupplierAction {
	private int id;
	private Supplier changeSupplier;
	private List<Supplier> suppliers;
	private Supplier supplier;
	private SupplierServiceImpl supplierServiceImpl = new SupplierServiceImpl();
	private String message; 
	public Supplier getChangeSupplier() {
		return changeSupplier;
	}

	public void setChangeSupplier(Supplier changeSupplier) {
		this.changeSupplier = changeSupplier;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}




	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public List<Supplier> getSuppliers() {
		return suppliers;
	}



	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}



	public Supplier getSupplier() {
		return supplier;
	}



	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}



	public String checkAllSupplier() {
		System.out.println("aaaaaaaa");
		suppliers =  supplierServiceImpl.selectAllSupplier();
		System.out.println(suppliers.size()+"asf");
		if(suppliers != null)
		ActionContext.getContext().put("suppliers", suppliers);
		
		return "success";
	}
	
	public String addSupplier() {
		if (supplierServiceImpl.addSupplier(supplier)) {
			message = "��ӳɹ�";
			System.out.println(message);
			return "success";
		} else {
			message = "���ʧ�ܣ�";
			System.out.println(message);
			return "error";
		}
	}
	public String deleteSupplier() {
		if (supplierServiceImpl.deleteSupplier(id)) {
			message = "ɾ���ɹ�";
			return "success";
		} else {
			return "error";
		}
	}
	
	public String updateSupplierForm() {
		System.out.println(id+"aaaaaa");
		changeSupplier = supplierServiceImpl.selectSupplierById(id);
		//ActionContext.getContext().put("changeUser", changeUser);
		return "success";
	}
	
	public String updateSupplier() {
		if (supplierServiceImpl.updateSupplier(changeSupplier)) {
			message = "�����û��ɹ���";
		} else {
			message = "�����û�ʧ�ܣ�";
		}
		return "success";
	}
}
