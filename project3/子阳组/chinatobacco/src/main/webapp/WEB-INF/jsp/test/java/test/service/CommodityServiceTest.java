package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Commodity;
import com.chinatobacco.service.CommodityService;

public class CommodityServiceTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CommodityService service = context.getBean(CommodityService.class);
		/*List<Commodity> list = service.selectAll();
		System.err.println(list.size());
		for (Commodity commodity : list) {
			System.err.println(commodity.getComname());
		}*/
		
		/*Commodity commodity = service.selectOne(10001);
		System.err.println(commodity.getComid()+"\t"+commodity.getComstate());*/
		
		/*List<Commodity> list = service.selectByType(2);
		System.err.println(list.size());
		for (Commodity commodity : list) {
			System.err.println(commodity.getComname());
		}*/
		/*List<Commodity> list = service.selectByState(2);
		System.err.println(list.size());
		for (Commodity commodity : list) {
			System.err.println(commodity.getComname());
		}*/
		/*List<Commodity> list = service.selectByName("asd");
		System.err.println(list.size());
		for (Commodity commodity : list) {
			System.err.println(commodity.getComname());
		}*/
		/*Commodity commodity  = new Commodity();
		commodity.setComimg("dfhjsagjs");
		commodity.setComname("yy");
		commodity.setStareid(2);
		commodity.setComtypeid(2);
		boolean flag = service.add(commodity);
		System.err.println(flag);*/
		
		Commodity commodity  = new Commodity();
		commodity.setComid(10000);
		commodity.setComname("fgd");
		boolean flag = service.update(commodity);
		System.out.println(flag);
	}
}
