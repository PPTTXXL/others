package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Shelf;
import com.chinatobacco.service.ShelfService;
/**
 * @author Castle
 * @category 货架的业务逻辑接口测试
 */
public class ShelfServiceTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		ShelfService service=context.getBean(ShelfService.class);
		/**
		 * select all
		 */
		/*List<Shelf> list = service.selectAll();
		System.out.println(list.size());
		
		for (Shelf shelf : list) {
			System.out.println(shelf.getShelfname());
		}*/
		/**
		 * select one
		 */
	/*Shelf shelf = service.selectOne(1);
		System.out.println(shelf);
		System.out.println(shelf.getShelfname());
	}*/
		/**
		 * add
		 */
		/*List<Shelf> list = service.selectAll();
		Shelf shelf = new Shelf(5,"东二排");
		service.add(shelf);
		list = service.selectAll();
		for (Shelf s  : list) {
			System.out.println(s.getShelfid()+s.getShelfname());
		}*/
		
		/**
		 * delete
		 */
		/*List<Shelf> list = service.selectAll();
		service.delete(6);
		list = service.selectAll();
		for (Shelf s : list) {
			System.out.println(s.getShelfid()+s.getShelfname());
		}*/
		
		/**
		 * update
		 */
		
		List<Shelf> list = service.selectAll();
		Shelf shelf = new Shelf(6,"南1排");
		service.update(shelf);
		
		list = service.selectAll();
		for (Shelf s : list) {
			System.out.println(s.getShelfid()+s.getShelfname());
		}
	}
}
