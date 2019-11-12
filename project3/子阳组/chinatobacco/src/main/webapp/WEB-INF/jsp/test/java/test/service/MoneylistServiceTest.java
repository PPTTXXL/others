package test.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Moneylist;
import com.chinatobacco.service.MoneylistService;

/**
 * @author Castle
 * @category 财务流水表业务逻辑测试
 */
public class MoneylistServiceTest {
	@Test
	public void test() throws ParseException{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		MoneylistService service =context.getBean(MoneylistService.class);
		/**
		 * select all
		 */
		/*List<Moneylist> list = service.selectAll();
		System.err.println(list.size());
		
		for(Moneylist moneylist:list){
			System.err.println(moneylist.getDirection());
		}*/
		/**
		 * selectByType
		 */
		/*List<Moneylist> list = service.selectByType(1);
		System.out.println(list.size());
		
		for (Moneylist moneylist : list) {
			System.out.println(moneylist.getDirection());
		}*/
		/**
		 * selectByDate
		 */
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2019-11-05");
		System.out.println(date);
		List<Moneylist> list = service.selectByDate(date);
		System.out.println(list.size());
		for (Moneylist moneylist : list) {
			System.err.println(moneylist.getDate());
		}*/
		
		/**
		 * selectQuery
		 */
		
		 /*Moneylist moneylist = new Moneylist();
		 List<Moneylist> list =service.selectQuery(moneylist); 
		 System.out.println(list.size());
		 for (Moneylist moneylist1 : list) {
		 System.err.println(moneylist1.getMoneynum()); 
		 }*/
		 
		/**
		 * add
		 */
		
		 /*List<Moneylist> list = service.selectAll();
		 Moneylist moneylist = new Moneylist(); moneylist.setId(1);
		 moneylist.setMoneynum(123456);
		 moneylist.setDirection("测试的");
		 service.add(moneylist); 
		 
		 list = service.selectAll(); 
		 for (Moneylist m : list) {
		 System.out.println(m.getMoneynum() + "\t" + m.getDirection());
		 }*/
		 
		/**
		 * delete
		 */

		
		 List<Moneylist> list = service.selectAll();
		 service.delete(100000000); 
		 list = service.selectAll(); 
		 for (Moneylist l : list) {
		 System.out.println(l.getDirection()+ "\t" + l.getMoneynum()); 
		 }
		
	}

}
