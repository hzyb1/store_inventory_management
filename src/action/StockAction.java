package action;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.InStock;
import model.Nb;
import model.Product;
import model.Stock;
import model.Supplier;
import model.User;
import po.InStockPo;
import po.InStockVo;
import po.OutStockPo;
import po.OutStockVo;
import po.StockVo;
import serviceImpl.ProductServiceImpl;
import serviceImpl.StockServiceImpl;
import serviceImpl.SupplierServiceImpl;

import com.opensymphony.xwork2.ActionContext;

public class StockAction {
	private int id;
	private Stock changeStock;
	private List<StockVo> stockVos;
	private Stock stock;
	private StockServiceImpl stockServiceImpl = new StockServiceImpl();
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private SupplierServiceImpl supplierServiceImpl = new SupplierServiceImpl();
	private String message; 
	private InStockPo inStockPo;
	
	List<OutStockVo> outStockVos;
	
	

	public List<OutStockVo> getOutStockVos() {
		return outStockVos;
	}
	public void setOutStockVos(List<OutStockVo> outStockVos) {
		this.outStockVos = outStockVos;
	}
	public InStockPo getInStockPo() {
		return inStockPo;
	}
	public void setInStockPo(InStockPo inStockPo) {
		this.inStockPo = inStockPo;
	}

	public List<Nb> getListNumber() {
		List<Nb> listNumber = new  ArrayList<Nb>();
		for(int i = 1;i<=10;i++){
			Nb number = new Nb();
			number.setId(i);
			number.setName(i+"号");
			listNumber.add(number);
		}
		return listNumber;
	}
	
	public List<Product> getListGood() {
		return productServiceImpl.listAllProduct();
	}



	public List<Supplier> getListSupplier() {
		return supplierServiceImpl.selectAllSupplier();
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

	public Stock getChangeStock() {
		return changeStock;
	}

	public void setChangeStock(Stock changeStock) {
		this.changeStock = changeStock;
	}

	public List<StockVo> getStockVos() {
		return stockVos;
	}

	public void setStockVos(List<StockVo> stockVos) {
		this.stockVos = stockVos;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public String checkAllStock() {
		stockVos =  stockServiceImpl.selectAllStock();
		if(stockVos != null)
		ActionContext.getContext().put("stockVos", stockVos);
		
		return "success";
	}

	public String deleteStock() {
		if (stockServiceImpl.deleteStock(id)) {
			message = "删除成功";
			return "success";
		} else {
			return "error";
		}
	}
	
	public String updateStockForm() {
		System.out.println(id+"aaaaaa");
		changeStock = stockServiceImpl.selectStockById(id);
		//ActionContext.getContext().put("changeUser", changeUser);
		return "success";
	}
	
	public String updateStock() {
		if (stockServiceImpl.addStock(changeStock)) {
			message = "更新用户成功！";
		} else {
			message = "更新用户失败！";
		}
		return "success";
	}
	
	public String addToInList(){
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		List<InStockPo> inStockList = (List<InStockPo>) session.get("inStockList");
		User user = (User) session.get("user");
		inStockPo.setId(inStockList.size()+1);
		inStockPo.setProductName(productServiceImpl.selectProductById(inStockPo.getProductId()).getName());
		inStockPo.setSupplierName(supplierServiceImpl.selectSupplierById(inStockPo.getSupplierId()).getName());
		inStockPo.setApproverId(user.getId());
		Timestamp submitTime = new Timestamp(System.currentTimeMillis());
		inStockPo.setInStockTime(submitTime);
		inStockList.add(inStockPo);
		message = "添加成功成功！";
		return "success";
	}
	
	public String checkInStockList() {
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		List<InStockPo> inStockList = (List<InStockPo>) session.get("inStockList");
		ActionContext.getContext().put("inStockList", inStockList);
		return "success";
	}
	public String inStockOption(){
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		List<InStockPo> inStockList = (List<InStockPo>) session.get("inStockList");
		boolean state = stockServiceImpl.inStockOption(inStockList);
		inStockList.clear();
		if(state){
			message = "入库成功！";
			System.out.println(message);
			return "success";
		}
		else{
			message = "入库失败！";
			System.out.println(message);
			return "error";
		}
	}
	
	public String checkAllInStock() {
		List<InStockVo> inStockVos =  stockServiceImpl.selectAllInStock();
		System.out.println(inStockVos.size()+"aaa");
		if(inStockVos != null)
		ActionContext.getContext().put("inStockVos", inStockVos);
		return "success";
	}
	
	public String deleteInStockDetail() {
		if (stockServiceImpl.deleteInStockDetail(id)) {
			message = "删除成功";
			return "success";
		} else {
			return "error";
		}
	}
	
	public String addToOutList(){
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		List<OutStockPo> outStockList = (List<OutStockPo>) session.get("outStockList");
		User user = (User) session.get("user");
		System.out.println(id+"ccccc");
		OutStockPo outStockPo = stockServiceImpl.addToOutList(id);
		outStockPo.setApproverName(user.getName());
		outStockPo.setApproverId(user.getId());
//		outStockPo.setId(outStockList.size()+1);
		outStockList.add(outStockPo);
		message = "已加入出库单！";
		return "success";
	}
	
	public String outStockOption(){
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		List<OutStockPo> outStockList = (List<OutStockPo>) session.get("outStockList");
		boolean state = stockServiceImpl.outStockOption(outStockList);
		outStockList.clear();
		if(state){
			message = "出库成功！";
			System.out.println(message);
			return "success";
		}
		else{
			message = "出库失败！";
			System.out.println(message);
			return "error";
		}
	}
	
	public String checkAllOutStock() {
		outStockVos =  stockServiceImpl.selectAllOutStock();
		if(outStockVos != null)
		ActionContext.getContext().put("outStockVos", outStockVos);
		System.out.println(outStockVos.size()+"????"+outStockVos.get(1).getApproverName());
		return "success";
	}
	
}
