package serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mapper.SupplierMapper;
import model.Supplier;
import service.SupplierService;
import tools.DBTools;

public class SupplierServiceImpl implements SupplierService{
  SupplierMapper supplierMapper;
  SqlSession sqlSession;
  
public Boolean updateSupplier(Supplier supplier)
{ 
		
		try {
			sqlSession=DBTools.getSession();
			SupplierMapper supplierMapper =sqlSession.getMapper(SupplierMapper.class);
			boolean state=supplierMapper.updateSupplier(supplier);
			sqlSession.commit();
			return state;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			return null;
		}finally{
		sqlSession.close();
	     }
	
    }


public Supplier selectSupplierById(int id) {
	try{
		sqlSession=DBTools.getSession(); 
		SupplierMapper supplierMapper = sqlSession.getMapper(SupplierMapper.class);
		Supplier supplier = supplierMapper.selectById(id);
		return supplier;
	}catch(Exception e){
		e.printStackTrace();
		sqlSession.rollback();
		return null;
	}finally{
		sqlSession.close();
	}
}

public Boolean addSupplier(Supplier supplier) {
	try{
		sqlSession=DBTools.getSession(); 
		SupplierMapper supplierMapper = sqlSession.getMapper(SupplierMapper.class);
		boolean state = supplierMapper.insertSupplier(supplier);
		sqlSession.commit();
		return state;
	}catch(Exception e){
		e.printStackTrace();
		sqlSession.rollback();
		return null;
	}finally{
		sqlSession.close();
	}
}
public boolean deleteSupplier(int id) {
	try{
		sqlSession=DBTools.getSession(); 
		SupplierMapper supplierMapper = sqlSession.getMapper(SupplierMapper.class);
		boolean state = supplierMapper.deleteById(id);
		sqlSession.commit();
		return state;
	}catch(Exception e){
		e.printStackTrace();
		sqlSession.rollback();
	}finally{
		sqlSession.close();
	}
	return false;
}


@Override
public List<Supplier> selectAllSupplier() {
	List<Supplier> suppliers = null;
	try{
		sqlSession=DBTools.getSession(); 
		SupplierMapper supplierMapper = sqlSession.getMapper(SupplierMapper.class);
		suppliers = supplierMapper.selectAll();
		sqlSession.commit();
	}catch(Exception e){
		e.printStackTrace();
		sqlSession.rollback();
	}finally{
		sqlSession.close();
	}
	return suppliers;
}

}
