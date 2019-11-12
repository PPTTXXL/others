package test.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Collect;
import com.chinatobacco.service.CollectService;

/**
 * @author Davi
 * @category 我的收藏业务逻辑测试
 */
public class CollectServiceTest {
	/*
	 * selectAll
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CollectService service = context.getBean(CollectService.class);

		List<Collect> list = service.selectAll();
		System.err.println(list.size());

		for (Collect collect : list) {
			System.err.println(collect.getColldate());
		}
	}*/
	
	
	/*
	 * selectByStoreid
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CollectService service = context.getBean(CollectService.class);

		List<Collect> list = service.selectByStoreid(20001);
		System.err.println(list.size());

		for (Collect collect : list) {
			System.err.println(collect.getCollid()+"\t"+collect.getCommodity());
		}
}*/
	
	/*
	 * selectQuery
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CollectService service = context.getBean(CollectService.class);

		Collect collect = new Collect();
		service.selectQuery(collect);
		List<Collect> list = service.selectAll();
		for (Collect collect1 : list) {
			System.err.println(collect1.getStoreid());
		}
	}*/
	
	/*
	 * add
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CollectService service = context.getBean(CollectService.class);

		Collect collect = new Collect();
		collect.setColldate(new Date());
		collect.setComid(10001);
		collect.setStoreid(20009);
		service.add(collect);
		List<Collect> list = service.selectAll();
		for (Collect approval2 : list) {
			System.out.println(approval2.getColldate()+"\t"+approval2.getCommodity());
		}
}
}
