package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Approvalstate;
import com.chinatobacco.pojo.Commoditybag;
import com.chinatobacco.service.ApprovalstateService;
import com.chinatobacco.service.CommoditybagService;

/**
 * @author Davi
 * @category 商品包业务逻辑测试类
 */
public class CommoditybagServiceTest {
	/*
	 * selectByIndet
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CommoditybagService service = context.getBean(CommoditybagService.class);

		List<Commoditybag> list = service.selectByIndet(123123);
		System.err.println(list.size());

		for (Commoditybag commoditybag : list) {
			System.err.println(commoditybag.getIndentid()+"\t"+commoditybag.getSpnum());
		}
}*/
	
	/*
	 * add
	 */
	/*@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CommoditybagService service = context.getBean(CommoditybagService.class);

		Commoditybag commoditybag = new Commoditybag();
		commoditybag.setComid(10002);
		commoditybag.setIndentid(123123);
		commoditybag.setSpnum(25);
		service.add(commoditybag);
		List<Commoditybag> list = service.selectByIndet(123123);
		for (Commoditybag Commoditybag : list) {
			System.out.println(Commoditybag.getComid()+"\t"+Commoditybag.getSpnum());
		}
}*/
	
	/*
	 * update
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		CommoditybagService service = context.getBean(CommoditybagService.class);

		Commoditybag commoditybag = new Commoditybag();
		commoditybag.setBagid(100002);
		commoditybag.setComid(10002);
		commoditybag.setSpnum(24);
		service.update(commoditybag);
		List<Commoditybag> list = service.selectByIndet(123123);
		for (Commoditybag commoditybag1 : list) {
			System.err.println(commoditybag1.getComid()+"\t"+commoditybag1.getSpnum());
		}
	}
}
