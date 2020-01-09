package tools;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import model.Order;
import model.User;
import org.apache.ibatis.session.SqlSession;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {
	 public static void main(String[] args) {
 //        insertUser();
//       deleteUser();
  //     selectUserById();
//       selectAllUser();
		 
//		 Order order = createOrder();
		 
		 Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss z").create();
//		 String result = gson.toJson(order);
//		 System.out.println(result);
//		 Order nOrder;
	//	 nOrder = gson.fromJson(result, Order.class); 
		 
		 
   }

	 private static Order createOrder(){


	       Time fst=null;Time fet=null;Time sst=null;Time set=null;
	       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
	       simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
	       try{
	           fst = new Time(simpleDateFormat.parse("1:10 am").getTime());
	           fet = new Time(simpleDateFormat.parse("1:10 am").getTime());
	           sst = new Time(simpleDateFormat.parse("1:10 am").getTime());
	           set = new Time(simpleDateFormat.parse("1:10 am").getTime());
	       }catch (Exception e){
	           e.printStackTrace();
	       }
	       if(fst.after(fet)){

	           return null;
	       }
	       if(sst.after(set)){

	           return null;
	       }
	       if(fet.after(sst)){

	           return null;
	       }
	       Order order = new Order();


	       order.setSendId(1);
	       order.setExpressName("1");
	       order.setGetAddress("1");
	       order.setTakeName("1");
	       order.setTakeTelephone("1");
	       order.setTakeCode("1");
	       order.setMoney((float) 1.5);
	       return order;
	   }
	 
	 
	 
   /**
    * 新增用户
    */
   private static void insertUser() {
       SqlSession session = DBTools.getSession();
      // UserMapper mapper = session.getMapper(UserMapper.class);
       User user = new User();
       user.setTelephone("123");
       user.setPassword("123");
       try {
        //   mapper.insertUser(user);
           System.out.println(user.toString());
            session.commit();
       } catch (Exception e) {
           e.printStackTrace();
           session.rollback();
       }
   }
   
   
   /**
    * 删除用户
    */
//   private static void deleteUser(){
//       SqlSession session=DBTools.getSession();
//       UserMapper mapper=session.getMapper(UserMapper.class);
//       try {
//           mapper.deleteUser(1);
//           session.commit();
//       } catch (Exception e) {
//           e.printStackTrace();
//           session.rollback();
//       }
//   }
   
   
   /**
    * 根据id查询用户
    */
   private static void selectUserById(){
       SqlSession session=DBTools.getSession();
    //  UserMapper mapper=session.getMapper(UserMapper.class);
       try {
    //   User user=    mapper.selectById(2);
           
           session.commit();
       } catch (Exception e) {
           e.printStackTrace();
           session.rollback();
       }
   }
   
}
