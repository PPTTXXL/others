package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Moneylisttype;
import com.chinatobacco.service.MoneylisttypeService;
/**
 * @author Castle
 * @category 流水类型业务逻辑接口测试
 */
public class MoneylisttypeServiceTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		MoneylisttypeService service =context.getBean(MoneylisttypeService.class);
		/**
		 * select one
		 */
		/*Moneylisttype moneylisttype = service.selectOne(1);
		System.out.println(moneylisttype);
		System.out.println(moneylisttype.getName());*/
		
		/**
		 * select all
		 */
		/*List<Moneylisttype> list = service.selectAll();
		System.out.println(list.size());
		
		for (Moneylisttype moneylisttype : list) {
			System.out.println(moneylisttype.getName());
		}*/
		
		/**
		 * add
		 */
		
		/* List<Moneylisttype> list = service.selectAll(); 
		 Moneylisttype moneylisttype = new Moneylisttype(); 
		 moneylisttype.setId(3);
		 moneylisttype.setName("待定");;
		 service.add(moneylisttype); 
		 list = service.selectAll(); 
		 for (Moneylisttype m : list) {
		 System.out.println(m.getId() + "\t" + m.getName()); 
		 }*/
		/**
		 * delete
		 */

		List<Moneylisttype> list = service.selectAll();
		service.delete(3);
		list = service.selectAll();
		for (Moneylisttype m : list) {
			System.out.println(m.getId()+ "\t" + m.getName());
		}
		/**
		 * update
		 */
		/*List<Moneylisttype> list = service.selectAll();
		Moneylisttype moneylisttype = new Moneylisttype();
		moneylisttype.setId(1);
		moneylisttype.setName("支出");
		service.update(moneylisttype);
		list = service.selectAll();
		for (Moneylisttype m : list) {
			System.out.println(m.getId()+"\t"+m.getName());
		}*/
	}
}
