package test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatobacco.pojo.Waybill;
import com.chinatobacco.service.WaybillService;

public class WaybillServicetest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		WaybillService service = context.getBean(WaybillService.class);
		/*
		 * List<Waybill> list = service.selectAll();
		 * System.out.println(list.size());
		 */

		/*
		 * List<Waybill> list = service.selectByStore(20000);
		 * System.err.println(list.size()); for (Waybill waybill : list) {
		 * System.err.println(waybill.getStoreid()+"\t"+waybill.getWayaddr()); }
		 */
		/*
		 * Waybill waybill = service.selectByIndent(12312);
		 * System.err.println(waybill.getIndentid()+"\t"+waybill.getWayaddr());
		 */

		/*Waybill waybill = new Waybill();
		waybill.setIndentid(12345698);
		waybill.setStoreid(20001);
		waybill.setWayaddr("dcngfjfd");
		boolean flag = service.add(waybill);
		System.err.println(flag);*/

		Waybill waybill = new Waybill();
		waybill.setWayid(310000010);
		waybill.setWayaddr("西安");
		boolean flag = service.update(waybill);
		System.err.println(flag);

	}

}
