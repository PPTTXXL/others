package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Shopcar;
import com.chinatobacco.service.ShopcarService;

public class ShopcarServiceTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		ShopcarService service=context.getBean(ShopcarService.class);
		
		/**
		 * select all
		 */
		/*List<Shopcar> list = service.selectAll(20000);
		System.out.println(list.size());
		for (Shopcar shopcar : list) {
			System.out.println(shopcar.getCarid()+"\t"+shopcar.getCommodity().getComid());
		}*/
		/**
		 * add
		 */
		/*List<Shopcar> list = service.selectAll(20000);
		Shopcar shopcar = new Shopcar();
		shopcar.setComid(10002);
		shopcar.setStoreid(20007);
		boolean i=service.add(shopcar);
		System.out.println(i);
		list = service.selectAll(20001);
		for (Shopcar s  : list) {
			System.out.println(s.getCarid()+s.getComid());
		}*/
		
	}
}
